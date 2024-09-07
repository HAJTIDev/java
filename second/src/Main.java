import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("podaj pierwsza liczba");
		float a = scanner.nextFloat();
		System.out.println("podaj druga");
		float b = scanner.nextFloat();
		System.out.println("podej znak");
		char  c = scanner.next().charAt(0);
		switch (c){
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '/':
				if(b==0) System.out.println("nie dziel przez zero");
				else System.out.println(a/b);
				break;
			case '*':
				System.out.println(a*b);
				break;
		}


	}
}