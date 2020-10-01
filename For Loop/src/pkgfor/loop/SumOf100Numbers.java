
package pkgfor.loop;


public class SumOf100Numbers {
    public static void main(String[] args) {
        int i,s=0;
        for (i=1;i<=100;i++)
        {
            s=i+s;
        }
        System.out.println("The sum is: "+s);
    }
    
}
