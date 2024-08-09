import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        int primerNumero= scanner.nextInt();
        System.out.println("ingrese el segundo numero:");
        int segundoNumero= scanner.nextInt();
        System.out.println("ingrese el tercer numero:");
        int tercerNumero= scanner.nextInt();
        if (primerNumero == segundoNumero || primerNumero == tercerNumero || segundoNumero == tercerNumero) {
            System.out.println("Los numeros ingresados son iguales!");
        } else {
            if (primerNumero > segundoNumero && primerNumero > tercerNumero){
                System.out.println("el Numero mayor es: " + primerNumero);
            } else if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
                System.out.println( "el numero mayor es: " + segundoNumero);
            } else  {
                System.out.println("el numero mayor es: " + tercerNumero);
            }

            //---- Identificar el menor
            if (primerNumero < segundoNumero && primerNumero < tercerNumero){
                System.out.println("el Numero menor es: " + primerNumero);
            } else if (segundoNumero < primerNumero && segundoNumero < tercerNumero) {
                System.out.println( "el numero menor es: " + segundoNumero);
            } else  {
                System.out.println("el numero menor es: " + tercerNumero);
            }

        }
    }
}