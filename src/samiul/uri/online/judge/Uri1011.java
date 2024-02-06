package samiul.uri.online.judge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		
		double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.000");
		
		double R;
		
		System.out.println("Enter your radius: ");
		
		R = input.nextDouble();
		
		double volume = ((4.0 / 3) * (PI) * (R * R * R));
		
		System.out.println("VOLUME = " + df.format(volume) );
		
		

	}

}
