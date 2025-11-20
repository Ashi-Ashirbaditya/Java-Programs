import java.util.Scanner;

class Atomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int no = sc.nextInt();
        int sq = no*no;
        boolean flag = true;
        while (no > 0) {
            if (no % 10 != sq % 10) {
                flag = false;
                break;
            }
            no /= 10;
            sq /= 10;
        }
        if(flag)
            System.out.println("Automorphic");
        else
            System.out.println("Not a Automorphic");
    }
}
