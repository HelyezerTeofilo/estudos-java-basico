import java.util.Scanner;
public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome:");
        nome = scanner.next();
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();
        
        while (true) {
            System.out.println("Digite seu nome:");
            nome = scanner.next();
            
            if(nome.equals("0"))break;

            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();
        }
    }
}
