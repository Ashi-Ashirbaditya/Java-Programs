import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int no = sc.nextInt();
        int sum = 0;
        int temp = no;
        /*while(no > 0){
            rem = no%10;
            sum += (rem*rem*rem);
            no = no/10;
        }*/
        for(int rem; no > 0; no = no/10){
            rem = no%10;
            sum += (rem*rem*rem);
        }
        if(sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not a Armstrong");
    }
}
