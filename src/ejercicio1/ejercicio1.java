package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad=sc.nextInt();
        //
        if(edad < 5){
            System.out.println("La entrada es gratis");
        } else{
            if(edad>=5 && edad<=12) {
                System.out.println("La entrada tiene 50% de descuento");
            } else if(edad>=13 && edad<=64) {
                System.out.println("La entrada no tiene descuento");
            } else if (edad >= 65) {
                System.out.println("La entrada tiene un 75% de descuento");
            }

        }
    }
}
