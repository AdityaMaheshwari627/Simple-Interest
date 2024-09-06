//Find the SI
package Numbers;

import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter P:");
        float p=obj.nextFloat();
        System.out.print("Enter R:");
        float r=obj.nextFloat();
        System.out.print("Enter T:");
        float t=obj.nextFloat();
        double si=((p*r*t)/100);
        System.out.print("SI is "+si);
	}

}
