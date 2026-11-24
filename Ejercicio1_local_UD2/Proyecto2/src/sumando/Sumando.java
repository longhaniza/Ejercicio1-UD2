package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int n1 = input.nextInt();
		System.out.println("Dame otro numero: ");
		int n2 = input.nextInt();
		
		System.out.println(n1 + n2);
		input.close();
	}

}
