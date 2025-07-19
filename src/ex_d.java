import java.util.Scanner;

public class ex_d{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa 1:");
        var nome1 = scanner.next();
        System.out.printf("Digite a idade de %s: \n", nome1);
        var idade1 = scanner.nextInt();

        System.out.println("Digite o nome da pessoa 2:");
        var nome2 = scanner.next();
        System.out.printf("Digite a idade de %s: \n", nome2);
        var idade2 = scanner.nextInt();

        var dif = idade1 - idade2;

        System.out.printf("A diferena entre %s e %s são de %s anos", nome1, nome2, dif);
    }
}
