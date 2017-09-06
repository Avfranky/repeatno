package guvi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Avfranky
 */
public class height {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList b=new ArrayList();
        Integer[] a=new Integer[50];
        int i,j,temp,k;
        for(i=0;i<50;i++)
        {
            a[i]=sc.nextInt();
            b.add(a[i]);
        }
        k=sc.nextInt();
        for(i=0;i<=k;i++)
        {
            for(j=i+1;j<50;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }        
        System.out.println(b.indexOf(a[k]));
    }
}
