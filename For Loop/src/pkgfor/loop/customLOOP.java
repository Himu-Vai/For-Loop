
package pkgfor.loop;

import java.util.Scanner;


public class customLOOP {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,a,l,n;
        System.out.println("Enter initial Value: ");
        a=input.nextInt();
        System.out.println("Enter Limit: ");
        l=input.nextInt();
        System.out.println("Enter increment: ");
        n=input.nextInt();
        
        for(i=a;i<=l;i=i+n)
        {
            System.out.print(i+"+");
        }
    }
    
}
