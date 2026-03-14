import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o preco do produto: ");
        float preco = teclado.nextFloat();
        
        System.out.print(" O preco, com aumento de 25% fica: " + preco + (preco / 4));

        teclado.close();
    }
}