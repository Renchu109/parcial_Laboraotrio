import java.util.Scanner;

public class Calculadra_RenzoDiLaudo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declaracion de las variables de n�meros

        int number1 = input.nextInt();
        System.out.println("Ingrese un n�mero: ");

        int number2 = input.nextInt();
        System.out.println("Ingrese otro n�mero: ");

        //Creacion de las fnciones suma, resta, multiplicacion

        int suma = number1 + number2;
        int resta = number1 - number2;
        int multiplicacion = number1 * number2;

        boolean bool = true;

        //Bucle para repetir el programa

        while (bool){

            //Condicion para la division por 0
            if (number2 == 0){
                System.out.println("No se puede dividir por 0");
            } else {

                //Declaracion de la funcion divsion
                int division = number1 / number2;

                //Menu de operaciones
                System.out.println("Elija la operaci�n que desea realizar: ");
                System.out.println("1.Suma");
                System.out.println("2.Resta");
                System.out.println("3.Multiplicaci�n");
                System.out.println("4.Divisi�n");

                //Bucle para corregir errores de selecci�n
                int eleccion = input.nextInt();
                if ((eleccion != 1) && (eleccion != 2) && (eleccion != 3) && (eleccion != 4)) {
                    while ((eleccion != 1) && (eleccion != 2) && (eleccion != 3) && (eleccion != 4)) {
                        System.out.println("Debe presionar un n�mero para realizar la operaci�n respectiva");
                        System.out.println("Elija la operaci�n que desea realizar: ");
                        System.out.println("1.Suma");
                        System.out.println("2.Resta");
                        System.out.println("3.Multiplicaci�n");
                        System.out.println("4.Divisi�n");
                        eleccion = input.nextInt();
                    }
                }

                //Salida de la operaci�n seleccionada

                if (eleccion == 1) {
                    System.out.println("Suma");
                    System.out.println(number1 + " + " + number2 + " = " + suma);
                } else if (eleccion == 2) {
                    System.out.println("Resta");
                    System.out.println(number1 + " - " + number2 + " = " + resta);
                } else if (eleccion == 3) {
                    System.out.println("Multiplicaci�n");
                    System.out.println(number1 + " * " + number2 + " = " + multiplicacion);
                } else {
                    System.out.println("Divisi�n");
                    System.out.println(number1 + " / " + number2 + " = " + division);
                }
            }


            //Bucle para repetir el programa y evitar eleciones equivocadas
            System.out.println("�Desea realizar otra operaci�n?");
            int decision = input.nextInt();
            if ((decision != 1) && (decision != 2)){
                while ((decision != 1) && (decision != 2)){
                    System.out.println("Ingrese 1 para si o 2 para no");
                    System.out.println("�Desea realizar otra operaci�n?");
                    decision = input.nextInt();
                }
            }


            //Condicional para repetir el programa o finalizarlo
            if (decision == 1){
                System.out.println("Reiniciando calculadora...");
            }else {
                System.out.println("Proceso finalizado");
                bool = false;
            }

        }

        input.close();

    }
}
