public class Main {
	public static void main(String[] args) {
		String j="-7+8-147+8-49";
		int k,result=0;
		StringBuilder pos= new StringBuilder();
		StringBuilder neg= new StringBuilder();
		String[] words=j.split("((?=[-:+]))");
		for (String word : words) {
			k=Integer.parseInt(word);
			result+=k;
			if(k>=0){
				word=word.replace("+","");
				pos.append(word).append("\n");
			}
			else{
				word=word.replace("-","");
				neg.append(word).append("\n");
			}

		}
		System.out.println("dodatnie: "+"\n"+pos);
		System.out.println("ujemne: "+"\n"+neg);
		System.out.println("wynik: "+result);
	}
}