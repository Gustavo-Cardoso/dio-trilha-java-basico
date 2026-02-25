public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /* Tipos de dados */
        byte idade = 123;
        short ano = 2021;
        int cep = 17350000;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1580;
        
        short numeroCurto = 1;
        int numeroNomal = numeroCurto;
        short numeroCurto2 = (short) numeroNomal; // Cast

        /* Diferenças entre variáveis e constantes */
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        double VALOR_DE_PI = 3.14; // Convensão de nome (constantes sempre terão nome em caixa ALTA)
        VALOR_DE_PI = 10.75;
        System.out.println(VALOR_DE_PI); // Mesmo em caixa alta, sem o uso do "final", o valor pode mudar

        /*
        final double VALOR_DE_PI_FINAL = 3.14;
        VALOR_DE_PI_FINAL = 10.75; // Não permite atribuir valor para variáveis que são contantes (uso da palavra "final")
        System.out.println(VALOR_DE_PI_FINAL);
        */
    }
}
