import java.util.Scanner;

class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int a = sc.nextInt();
        int arr[] = new int[a/2];
        int sum = 0;
        for(int i = 1; i<= a/2; i++){
            if(a / i == 0)
                arr[i - 1] = i;
                sum += arr[i - 1];
        }
        if(sum > a)
            System.out.println("Abundant");
        else
            System.out.println("Not a Abundant");
    }
}
