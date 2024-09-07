import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void  calculator()
    {
        float a,b;
        char op;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i==0;)
        {
            System.out.println("Podaj liczbe 1: ");
            a=scanner.nextFloat();
            System.out.println("Podaj liczbe 2: ");
            b=scanner.nextFloat();
            System.out.println("Podaj symbol operacji lub e by zakonczyc: ");
            op=scanner.next().charAt(0);
            switch(op)
            {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    if(b!=0) {
                        System.out.println(a / b);
                    }else System.out.println("Nie mozna dzielic przez 0!");
                    break;
                case 'e':
                    i+=1;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji w menu!");
                    break;
            }
        }
    }
    public static void odd_numbers()
    {
        int a,b,c,s;
        boolean h;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        a=rand.nextInt(50)+1;
        b=rand.nextInt(50)+1;
        h=false;
        if(a!=b)
        {
            if(a>b)
            {
                c=a;
                a=b;
                b=c;
            }
            c=0;
            s=0;
            for(int i=a; i<=b; i++)
            {
                if(i%2==1)
                {
                    System.out.println(i);
                    c++;
                    s+=i;
                    h=true;
                }
            }
            if(h)
            {
                System.out.println("Srednia:");
                System.out.println(s/1.0/c);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is our first project");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Podajliczbę punktow do wylosowania");
        int n=scanner.nextInt();
        float valX,valY;
        float c=0;
        for(int i=0; i<n; i++)
        {
            valX = rand.nextFloat()*2;
            valY = rand.nextFloat()*2;
            if(Math.sqrt((valX - 1) * (valX - 1) + (valY - 1) * (valY - 1)) <= 1)
            {
                c++;
            }
        }
        System.out.println(4*c/(n-c));

    }
}