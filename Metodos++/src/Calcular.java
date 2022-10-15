import java.util.Scanner;
public class Calcular {

    public static double calculadora(double numero1,double numero2, int calculo) {
        double resultado = 0;
        if (calculo == 1){
            resultado = numero1 * numero2;
        }else if(calculo == 2){
            resultado = numero1 + numero2;
        }else if(calculo == 3){
            resultado = numero1 - numero2;
        }else if(calculo == 4){
            resultado = numero1 / numero2;
        }
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        //criação do metodo = <visibilidade?> <tipo?> <modificador?> retorno nome (parametros?) <exceções?> {corpo} - ? = opcional
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação matemática para ser realizada: \n1 - Multiplicação\n2 - Soma\n3 - Subtração\n4 - Divisão");
        int escolhaOperação = scanner.nextInt();
        System.out.println("\nDigite um número para a operação:");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite outro número para a operação:");
        double segundoNumero = scanner.nextDouble();

        System.out.println("O resulta da operação escolhida é: " + calculadora(primeiroNumero, segundoNumero, escolhaOperação));
        
    }
}
