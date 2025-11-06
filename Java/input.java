import java.util.Scanner;
class input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your roll: ");
        int roll=sc.nextInt();
        System.out.println("Name is "+name);
        System.out.println("Roll is "+roll);
    }
}