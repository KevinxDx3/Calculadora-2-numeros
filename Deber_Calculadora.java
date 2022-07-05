import java.util.Scanner;

public class Deber_Calculadora {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean rep=true;

        do {

            int op=0;
            float num1=0,num2=0,resul=0;
            double cos=0,sen=0,tan=0;

            System.out.println("----------- Seleccione la operacion ---------------- ");
            System.out.println("  1.- Suma ");
            System.out.println("  2.- Resta ");
            System.out.println("  3.- Multiplicacion ");
            System.out.println("  4.- Division ");
            System.out.println("  5.- Sen ");
            System.out.println("  6.- Cos ");
            System.out.println("  7.- Tan ");
            System.out.println("  0.- Salir ");

            System.out.println("Seleccione la opcion: ");

            op = in.nextInt();

            switch (op){

                case 1:
                    System.out.println("Ingrese el numero 1: ");
                    num1 = in.nextFloat();
                    System.out.println("Ingrese el numero 2: ");
                    num2 = in.nextFloat();

                    resul = num1 + num2;

                    System.out.println("El resultado es: " + resul);

                    rep=true;




                    continue;





                case 2:

                    System.out.println("Ingrese el numero 1: ");
                    num1 = in.nextFloat();
                    System.out.println("Ingrese el numero 2: ");
                    num2 = in.nextFloat();

                    resul = num1 - num2;

                    System.out.println("El resultado es: " + resul);

                    continue;



                case 3:

                    System.out.println("Ingrese el numero 1: ");
                    num1 = in.nextFloat();
                    System.out.println("Ingrese el numero 2: ");
                    num2 = in.nextFloat();

                    resul = num1 * num2;

                    System.out.println("El resultado es: " + resul);

                    continue;



                case 4:

                    System.out.println("Ingrese el numerador : ");
                    num1 = in.nextFloat();
                    System.out.println("Ingrese el denominador: ");
                    num2 = in.nextFloat();

                    if (num2 == 0) {

                        System.out.println("NO SE PUEDE DIVIDIR PARA CERO");


                    } else {

                        resul = num1 / num2;

                    }


                    System.out.println("El resultado es: " + resul);

                    continue;



                case 5:
                    System.out.println("Ingrese los grados: ");
                    sen = in.nextDouble();

                    System.out.println("El resultado es: ");

                    System.out.println(Math.sin(Math.toRadians(sen)));

                    continue;



                case 6:
                    System.out.println("Ingrese los grados: ");
                    cos = in.nextDouble();

                    System.out.println("El resultado es: ");

                    System.out.println(Math.cos((Math.toRadians(cos))));

                    continue;



                case 7:
                    System.out.println("Ingrese los grados: ");
                    tan = in.nextDouble();

                    System.out.println("El resultado es: ");

                    System.out.println(Math.tan((Math.toRadians(tan))));

                    continue;



                case 0:

                    System.exit(0);

                    break;
            }



        }while(rep=true);


    }


}
