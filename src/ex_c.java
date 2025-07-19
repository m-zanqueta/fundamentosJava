import java.util.Scanner;

public class ex_c{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite a base do retangulo:");
        var base = scanner.nextInt();

        System.out.println("Digite a altura do retangulo:");
        var altura = scanner.nextInt();

        var area = base * altura;

        

        System.out.printf("A área do retangulo é: %s", area);
    }
}
