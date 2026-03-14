import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        float salario = teclado.nextFloat();
        
        System.out.print(" Digite o valor total vendido: ");
        float venda_total = teclado.nextFloat();

        System.out.print(" Sálario final: " + (salario) + venda_total * 0.05 + "\n");
        System.out.print(" Comissão(5% de " + venda_total + "): " + venda_total * 0.05);

        teclado.close();
    }
}