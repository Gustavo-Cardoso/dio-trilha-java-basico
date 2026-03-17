import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            // Criando o objeto scanner
            scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome:");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura:");
            double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam numéricos.");
        } finally {
            // Este bloco sempre será executado
            System.out.println("Encerrando o scanner...");
            scanner.close();
        }
    }
}