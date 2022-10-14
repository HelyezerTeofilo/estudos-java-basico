import java.util.Scanner;
public class PareImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numerosImpares = 0;
        int numerosPares = 0;
        do {
            System.out.println("Digite um número qualquer:");
            numero = scanner.nextInt();

            if ((numero%2)==0) {
                ++numerosPares;
            }else ++numerosImpares;

        } while (numero!=000);

        System.out.println("Quantidade de números impares: "+numerosImpares);
        System.out.println("Quantidade de números pares: "+numerosPares);
    }

}
