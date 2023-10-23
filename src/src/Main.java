import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int NUM,DIV,FACT=0;
        boolean Primo=false;
        {
            //con el scaner cogeis un numero entero positivo y una cadena

            //ver el string es palindromo
            //[
            //ver si el numero es primo

            //ver cuantas mayusculas tiene la cadena

            //Si no es primo factorizarlo:
            System.out.println("NUM");
            NUM=leer.nextInt();
            while (Primo=false){
                for (DIV=1;DIV<=NUM;NUM++){
                    if(NUM%DIV==0){
                        System.out.println(+DIV+"es divisor de"+NUM);
                        FACT=FACT*DIV;
                    }

                }
                System.out.println("el factorial de"+NUM+"es"+FACT);
            }


            //mostrar el tamaño de la cadena
        }
    }
}
