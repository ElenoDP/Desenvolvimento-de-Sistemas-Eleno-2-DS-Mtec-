import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o preco do produto: ");
        float preco = teclado.nextFloat();

        System.out.print(" Digite a quantidade: ");
        int quantidade = teclado.nextInt();

        System.out.print(" Precisa pagar: " + preco * quantidade + "reais.");

        teclado.close();
    }
}