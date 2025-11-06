import java.util.Scanner;
import java.calculation.multi;
class func{
    static void isEven(int num)
    {
        if(num%2==0)
        System.out.println(num+" is a Even number.");
        else 
        System.out.println(num+" is a Odd number.");
    }
    public static void main(String[] args) {
        int n,res;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        n=sc.nextInt();
        isEven(n);
        res=multi(2,3);
        System.out.println("Multiplcation="+res);
        sc.close();
    }
}