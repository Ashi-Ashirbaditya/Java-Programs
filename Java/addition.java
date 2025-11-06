import java.util.Scanner;
class addition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,sum;
        System.out.println("Enter 2 numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum=n1+n2;
        System.out.println("Sum = "+sum);
    }
}