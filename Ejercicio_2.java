package practica_10;

import java.util.Scanner;

import practica_10.Ejercicio2.Circulo;
import practica_10.Ejercicio2.Rectangulo;

/**
 *
 * @author MauriRod
 */
public class Practica_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner mj = new Scanner(System.in);
        double ancho, largo, radio;

        System.out.println("---------AREA DE UN RECTANGULO---------");
        System.out.println("");
        System.out.println("Ingrese el primer número: ");
        ancho = mj.nextDouble();
        System.out.println("Ingrese el segundo número:");
        largo = mj.nextDouble();

        Rectangulo rect = new Rectangulo(ancho, largo);
        System.out.println("-----------RESULTADOS--------------");
        System.out.println("");
        System.out.println("El area es: " + rect.getAre() + " cms");
        System.out.println("El perimetro es: " + rect.getPerimetro() + " cms");
        System.out.println(rect.toString());

        System.out.println("---------AREA DE UN CIRCULO---------");
        System.out.println("");
        System.out.println("Ingrese el radio del circulo: ");
        radio = mj.nextDouble();
        Circulo cl = new Circulo(radio);
        System.out.println("-----------RESULTADOS--------------");
        System.out.println("");
        System.out.println("El area es: " + cl.getAre() + " cms");
        System.out.println("El perimetro es: " + cl.getPerimetro() + " cms");
        System.out.println(cl.toString());
        

    }

}
