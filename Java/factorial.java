import java.util.Scanner;
class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,fact=1;
        System.out.println("Enter a numbers: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial = "+fact);
    }
}