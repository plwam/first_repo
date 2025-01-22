
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        int nombre1,nombre2,somme;

        Scanner reader = new Scanner(System.in);
        System.out.println("entrer le first number");
        nombre1=reader.nextInt();
        System.out.println("entrer le second number");
        nombre2=reader.nextInt();
        somme=nombre1+nombre2;
        //ou on peu aussi  faire
        int somme_try=addition(nombre1, nombre2);

        System.out.println("la somme  "+somme);
        System.out.println("la somme pour la deuxieme façon est  "+somme_try);
    }
    public static int addition (int a,int b) {
        return a+b;
    }
}
