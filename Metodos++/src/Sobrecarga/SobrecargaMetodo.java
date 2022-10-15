package Sobrecarga;
public class SobrecargaMetodo {
    

    public static double area(double lado) {
        double calculo = lado * lado;
        return calculo;
    }

    public static double area(double lado1,double lado2) {
        double calculo = lado1 * lado2;
        return calculo;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        double calculo = ((baseMaior+baseMenor)*altura)/2;
        return calculo;
    }
}
