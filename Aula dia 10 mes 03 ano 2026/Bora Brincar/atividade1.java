import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu cargo: ");
        String cargo = teclado.nextLine();
        
        System.out.print(" Eu sei o seu primeiro nome, é: " + nome + ". Também sei seu cargo de trabalho, é: " + cargo + ". Agora acredita em mim?");

        teclado.close();
    }
}