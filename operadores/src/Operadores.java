import javax.lang.model.util.ElementScanner6;

public class Operadores {
    public static void main(String[] args) throws Exception {
        
        //operador de atribuição "="
            int idade = 19;
        
        //operadores aritmeticos + - * / ...
            int soma = 10 + 10;
        
        //operadores unarios + - ++ -- !
            int numero = 5;
                //System.out.println(- numero);
            numero = - numero;
                //System.out.println(numero);
            numero = numero * -1;
                //System.out.println(numero);
            numero++;
                //System.out.println(numero);
            //System.out.println(-- numero);

            boolean variavel = true;
                //System.out.println(variavel);
                //System.out.println(!variavel); // variavel = !variavel
            
        // operador ternario ?: abreviação if else
            int a,b;
            a = 5;
            b = 6;

            String resultado = "";
            if (a==b)
                resultado = "verdadeiro";
            else 
                resultado = "falso";
            
            //System.out.println(resultado);

            a = 6;
            b = 6;
            //resultado = a==b ? "verdadeiro" : "falso";
                //System.out.println(resultado);

        // operadores relacionais == != > ... * para obejtos .equals...
            boolean simNao = 4 == 5;
                //System.out.println(simNao);

        //operadores logicos && ||
            boolean condicao1 = true;
            boolean condicao2 = true;
            if (condicao1 && condicao2){
                System.out.println("Ambas verdadeiras");
            }
            else{
                System.out.println("Alguma não é verdadeira");
            }
    }
}
