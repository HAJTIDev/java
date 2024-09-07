import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int index = -1;

		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("podaj liczbe ");
		int a = s.nextInt();
		if (a >= 5 && a <= 25) {
			int[] tab = new int[a];
			for (int i=0;i<a;i++) {
				tab[i] = rand.nextInt(50) + 1;
				for (int k = 0; k < i; k++) {
					while (tab[i] == tab[k]) {
						tab[i] = rand.nextInt(50) + 1;
					}
				}
			}
				for (int i = 0; i < tab.length; i++) {
				index = i;
				for (int j = i; j <= tab.length - 1; j++) {
					if (tab[j] < tab[index]) {
						index = j;
					}
				}
				int t = tab[i];
				tab[i] = tab[index];
				tab[index] = t;
			}

			for (int i = 0; i < a; i++) {
				System.out.print(tab[i] + " ");
			}
			System.out.println(" ");
			if (tab.length % 2 == 0) {
				System.out.print("middle= ");
				int x = tab[tab.length / 2 - 1];
				int y = tab[tab.length / 2];
				System.out.println(x + " and " + y);
				System.out.println("avg:" + (x + y) / 2);
			} else {
				System.out.println("middle= " + tab[tab.length / 2]);
			}
			System.out.println("min= " + tab[0]);
			System.out.println("max= " + tab[a - 1]);
		} else System.out.println("zła wartość");
	}

}