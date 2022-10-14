import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    double nota;
    System.out.println("Informe a nota:");
    nota = scanner.nextInt();
    
    while (nota < 0 || nota > 10) {
        System.out.println("Nota inválida! Por favor informe uma nota válida: ");
        nota = scanner.nextInt();
    }
    
    System.out.println("Nota válida! Obrigado.");
    

    }

}
