public class MinhaClasse {
    public static void main (String[] args){
//        System.out.print("Olá mundo");
        String primeiroNome = "Gustavo";
        String segundoNome = "Cardoso";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
