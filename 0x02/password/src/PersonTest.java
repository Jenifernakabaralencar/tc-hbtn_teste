import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {
    static Person pessoa;

    @BeforeAll
    public static void setup() {
        pessoa = new Person();
    }

    @ParameterizedTest(name = "checkUser, deve ser válido valor: {0}")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid(String usuario) {
        pessoa.setUsuario(usuario);
    }

    @ParameterizedTest(name = "checkUser, não deve ser válido valor: {0}")
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid(String usuario) {
        pessoa.setUsuario(usuario);
        assertFalse(pessoa.checkUser());
    }

    @ParameterizedTest(name = "checkPassword - sem letras, não deve ser válido valor: {0}")
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String senha) {
        pessoa.setSenha(senha);
        assertFalse(pessoa.checkPassword());
    }

    @ParameterizedTest(name = "checkPassword - sem numeros, não deve ser válido valor: {0}")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String senha) {
        pessoa.setSenha(senha);
        assertFalse(pessoa.checkPassword());
    }

    @ParameterizedTest(name = "checkPassword - menos que 8, não deve ser válido valor: {0}")
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    public void does_not_have_eight_chars(String senha) {
        pessoa.setSenha(senha);
        assertFalse(pessoa.checkPassword());
    }

    @ParameterizedTest(name = "checkPassword, deve ser válido valor: {0}")
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String senha) {
        pessoa.setSenha(senha);
        assertTrue(pessoa.checkPassword());
    }
}