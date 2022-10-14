import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número para gerar a tabuada: ");
        numero = scanner.nextInt();

        for (int multiplicador = 1;  multiplicador <=10;multiplicador++){
            int multiplicacao = numero * multiplicador;
            System.out.println(numero + "x" + multiplicador + "=" + multiplicacao);
        }

    }
}
