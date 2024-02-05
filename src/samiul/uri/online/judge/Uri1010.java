package samiul.uri.online.judge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my uri project serial 1010.");
		
		int num1, num2, num3, num4;

		float num5, num6;

		Scanner input = new Scanner(System.in);

		num1 = input.nextInt();

		num2 = input.nextInt();

		num5 = input.nextFloat();

		num3 = input.nextInt();

		num4 = input.nextInt();

		num6 = input.nextFloat();

		DecimalFormat df = new DecimalFormat("#.00");

		float totalPrice = ((num2 * num5) + (num4 * num6));

		System.out.println("VALOR A PAGAR: " + "R$ " + df.format(totalPrice));

	}

}
