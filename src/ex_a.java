import java.util.Scanner;

public class ex_a{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        var nome = scanner.next();

        System.out.println("Digite seu ano de nascimento:");
        var ano = scanner.nextInt();

        var res = 2025 - ano;

        System.out.printf("Olá %s você tem %s anos!", nome, res);
    }
}
