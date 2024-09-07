import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String text1=sc.nextLine();
		String text2=sc.nextLine();
		String text3=text1+" "+text2;
		text3=text3.toLowerCase();
		String[] s =  text3.split(" ");
		HashSet<String> uni = new HashSet<>();

		for (String value : s) {
			if (!uni.contains(value) && !value.equals("")) {
				uni.add(value);
			}
		}

		int l=0;
		String[] s2=new String[uni.size()];

		for(String ele:uni){
			s2[l++] = ele;
		}

		for (int i=s2.length-1; i>0; i--) {
			int j = 0;
			for (int k=1; k <= i; k++)
				if (s2[j].compareTo(s2[k]) < 0) j = k;
			String temp = s2[i];
			s2[i] = s2[j];
			s2[j] = temp;
		}

		for (String value : s2) System.out.print(value+ " ");
	}
}