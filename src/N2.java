import java.util.Scanner;

public class N2 {

    public static void m(int x) {
        if(x!=0) {
            m(x/2);
        }
        System.out.print(x%2);
    }

    public static void main(String[]args ){

        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Число=> ");
        int n=sc.nextInt();
        N2 country[]=new N2[n];

        m(25);

    }
}
