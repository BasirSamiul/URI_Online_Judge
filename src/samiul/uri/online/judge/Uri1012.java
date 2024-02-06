package samiul.uri.online.judge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#.000");
		
		System.out.println();

		double PI = 3.14159;

		double baseA, baseB, heightC;

		baseA = input.nextDouble();

		baseB = input.nextDouble();

		heightC = input.nextDouble();

		double areaTriangle = ((0.500) * (baseA) * (heightC));

		double areaCircle = ((PI) * (heightC * heightC));

		double areaTrapezium = (((baseA + baseB) / 2) * heightC);

		double areaSquare = (baseB * baseB);

		double areaRectangle = (baseA * baseB);
		
		System.out.println("TRIANGULO: " + df.format(areaTriangle));
		
		System.out.println("CIRCULO: " + df.format(areaCircle));
		
		System.out.println("TRAPEZIO: " + df.format(areaTrapezium));
		
		System.out.println("QUADRADO: " + df.format(areaSquare));
		
		System.out.println("RETANGULO: " + df.format(areaRectangle));

	}

}
