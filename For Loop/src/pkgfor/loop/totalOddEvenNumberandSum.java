
package pkgfor.loop;


public class totalOddEvenNumberandSum {
    public static void main(String[] args) {
        int i,o=0,e = 0,so=0,se=0;
        for (i=1;i<=5;i++)
        {
            if(i%2==0)
            {
                e++;
                se=se+e;
            }
            else
            {
                o++;
                so=so+o;
            }
        }
        System.out.println("Total Even Number: "+e+"\nSum of Even Number: "+se+"\nTotal Odd Number: "+o+"\nSum of Odd Number: "+so);
        
    }
    
}
