import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o preco do produto em dor: ");
        float dor = teclado.nextFloat();
        
        System.out.print(" Digite o valor da cotação: ");
        float cotacao = teclado.nextFloat();

        float rei = dor * cotacao;

        System.out.print(" O valor em reis ficou: " + rei);
        teclado.close();
    }
}