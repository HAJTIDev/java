import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n,k=0;
		double x,y,p;
		Scanner sc=new Scanner(System.in);
		System.out.print("liczba = ");
		n=sc.nextInt();
		for (int i = 0; i <=n; i++) {
			x=Math.random();
			y=Math.random();
			if(x*x+y*y<=1) k++;
		}
		p=4.*k/n;
		System.out.println(p);
	}
}