import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int a,b,z=0;
		float c=0;
		Random rand=new Random();
		a= rand.nextInt(50)+1;
		b= rand.nextInt(50)+1;
		if(a==b || b<a) b= rand.nextInt(50)+1;
		if(a>b) a= rand.nextInt(50)+1;
		for (int i = a; i <b+1; i++) {
			if(i%2!=0) {
				System.out.println(i);
				c = c + i;
				z+=1;
			}
			}
		System.out.println(a+" "+b);
		System.out.println(c);
		System.out.println(c/z);
		}
	}
