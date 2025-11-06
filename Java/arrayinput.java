import java.util.Scanner;
public class arrayinput {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no. of element");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
