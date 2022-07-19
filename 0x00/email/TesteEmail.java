public class TesteEmail {

    public static boolean testar_email_com_arroba() {
        boolean emailValid = Pessoa.emailValid("email_teste@dominio.com.br");
        if (emailValid){
            return true;
        }return false;
    }

    public static boolean testar_email_sem_arroba() {
        boolean semArroba = Pessoa.emailValid("email_testedominio.com.br");
        if (!semArroba){
            return true;
        }return false;
    }

    public static boolean testar_email_mais_50_caracteres() {
        boolean emailValid = Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        if (!emailValid){
            return true;
        }return false;
    }
}
