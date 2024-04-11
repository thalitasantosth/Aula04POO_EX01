package view;

import model.Paralelogramo;
import model.Trapezio;

public class Principal {

	public static void main(String[] args) {
		
		//Paralelogramo
        Paralelogramo p1 = new Paralelogramo();
        p1.setBase(5); 
        p1.setAltura(3);
        float perimetroParalelogramo = p1.calcPerimetro();
        float areaParalelogramo = p1.calcArea();

        System.out.println("Paralelogramo:");
        System.out.println("Perímetro: " + perimetroParalelogramo);
        System.out.println("Área: " + areaParalelogramo);

        // Trapézio
        Trapezio t1 = new Trapezio();
        t1.setBase(6); 
        t1.setAltura(4);
        t1.setBaseMenor(3); 
        float perimetroTrapezio = t1.calcPerimetro();
        float areaTrapezio = t1.calcArea();

        System.out.println("\nTrapézio:");
        System.out.println("Perímetro: " + perimetroTrapezio);
        System.out.println("Área: " + areaTrapezio);
    }
}
