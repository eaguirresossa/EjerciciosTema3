import java.util.Scanner;

public class suma {
    public static void main (String args[]){
        Scanner n1 = new Scanner(System.in);
        System.out.print("Ingrese el número1: ");
        int num1 = Integer.parseInt(n1.nextLine());

        Scanner n2 = new Scanner(System.in);
        System.out.print("Ingrese el número2: ");
        int num2 = Integer.parseInt(n2.nextLine());

        Scanner n3 = new Scanner(System.in);
        System.out.print("Ingrese el número3: ");
        int num3 = Integer.parseInt(n3.nextLine());

        suma(num1, num2, num3);
    }
    public static void suma (int num1, int num2, int num3){
        int total = num1 + num2 + num3;
        System.out.println("El total de la suma es: "+total);
    }
}
