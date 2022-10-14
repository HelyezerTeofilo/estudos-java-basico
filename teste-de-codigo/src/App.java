import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.println(verificarIdade(idade));
    }

    public static String verificarIdade (int idade){
        String autorizacao = "";
        if (idade<18){
            autorizacao = "Usuário não autorizado";
        }else{
            autorizacao = "Usuário autorizado!";
        }
        
        return autorizacao;
    }
}
