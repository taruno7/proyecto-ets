
package proyecto.ets;

import java.util.Scanner;


public class ProyectoEts {
        static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Escribe el primer numero: " );
        double num1=input.nextDouble();

        System.out.println("Escribe un operador: ");

        //Espacio en blanco por el error nextLine() después de un nextDouble()
        input.nextLine();
        String op=input.nextLine();

        System.out.println("Escribe el segundo numero: " );
        double num2=input.nextDouble();
        ProyectoEts.operacion(op, num1, num2);

    }
    public static void operacion(String op, double num1,double num2){
        if ("sumar".equals(op)) {
            double suma= num1+num2;
            System.out.println("La suma es: " +suma);
        }
        if ("restar".equals(op)) {
            double restar= num1-num2;
            System.out.println("La suma es: " +restar);
        }
        if ("multiplicar".equals(op)) {
            double multiplicar= num1*num2;
            System.out.println("La suma es: " +multiplicar);
        }
        if ("diivir".equals(op)) {
            double dividir= num1/num2;
            System.out.println("La suma es: " +dividir);
        }
        else{
            System.out.println("ERROR! NO HAS ESCRITO UNA OPERACIÓN VALIDA");
        }
    }
}
