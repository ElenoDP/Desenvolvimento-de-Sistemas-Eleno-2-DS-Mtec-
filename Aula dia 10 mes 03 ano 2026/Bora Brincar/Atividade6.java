import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print(" Digite o valor do produto: ");
        float produto_preco = teclado.nextFloat();

        produto_preco = produto_preco - ((produto_preco / 10) + produto_preco / 20);

        System.out.print(" Aplicando 15% de desconto, o cleinte precisara pagar: " + produto_preco);
        teclado.close();
    }
}