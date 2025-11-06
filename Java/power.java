import java.util.Scanner;
class power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,po=1,p;
        System.out.println("Enter a numbers: ");
        n=sc.nextInt();
        System.out.println("Enter the power of number: ");
        p=sc.nextInt();
        for(int i=1;i<=p;i++)
        {
            po=po*n;
        }
        System.out.println("Result = "+po);
    }
}