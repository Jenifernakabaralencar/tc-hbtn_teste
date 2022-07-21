import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String usuario;
    private String senha;

    public boolean checkUser() {
        int minLength = 8;
        Pattern pattern = Pattern.compile(".\\W");
        Matcher matcher = pattern.matcher(usuario);

        boolean lengthValid = usuario.length() >= minLength;
        boolean containsSpecialCharacters = matcher.find();

        return lengthValid && !containsSpecialCharacters;
    }

    public boolean checkPassword() {
        int minLength = 8;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(senha);

        boolean containsNumers = matcher.find();
        boolean lengthValid = senha.length() >= minLength;

        pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(senha);
        boolean containsUpperCaseChar = matcher.find();

        pattern = Pattern.compile(".\\W");
        matcher = pattern.matcher(senha);
        boolean containsSpecialCharacters = matcher.find();

        return containsNumers && lengthValid && containsUpperCaseChar && containsSpecialCharacters;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}