import java.util.*;
class WordNumScan
{
    static String t[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
                    "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        static String te[]={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        static String h=" Hundred ";
        static String th=" Thousand ";
        static String la=" Lakh ";
        static String cr=" Crore ";
        static int c=0;
        static long d,n,temp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long a;
        System.out.print("Enter a no. ");
        a=sc.nextLong();
        c=0;
        n=Math.abs(a);
        System.out.println(n);
        temp=n;
        while(n>0)
        {
            c++;
            n/=10;
        }
        System.out.println("c="+c);
        n=temp;
        if(c<=2)
        two(n);
        else if(c==3)
        three(n);
        else if(c<=5)
        five(n);
        else if(c<=7)
        seven(n);
        else 
        nine(n);
    }
    static void nine(long a)
    {
        seven(a/10000000);
        if(a/10000000>0)
        System.out.print(cr);
        a=a-(a/10000000)*10000000;
        seven(a);       
    }
    static void seven(long a)
    {
        two(a/100000);
        if(a/100000>0)
        System.out.print(la);
        a=a-(a/100000)*100000;
        five(a);
    }
    static void five(long a)
    {
        two(a/1000);
        if(a/1000>0)
        System.out.print(th);
        a=a-(a/1000)*1000;
        three(a);
    }
    static void three(long a)
    {        
        System.out.print(t[(int)(a/100)]);        
        if(a/100>0)
        System.out.print(h);
        a=a-(a/100)*100;
        two(a);
    }
   
    static void two(long a)
    {    
        if(a<20)
        System.out.print(t[(int)a]+" ");
        else
        System.out.print(te[((int)a/10)-2]+" "+t[(int)a%10]);        
    }
}
