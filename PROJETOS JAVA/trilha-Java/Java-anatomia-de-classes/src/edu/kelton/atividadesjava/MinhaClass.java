public class MinhaClass {

    public static void main (String [] args) {

        //System.out.print ( "Vem vindo(a)! " );
        String primeiroNome = "Kelton";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
