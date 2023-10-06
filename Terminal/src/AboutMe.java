import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome aqui:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome aqui:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade aqui:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura aqui:");
        double altura = scanner.nextDouble();

        System.out.println("Olá, eu me chamo " + nome +(" ") + sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
}

}