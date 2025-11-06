import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        int i,n;
        int total=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Instruction \n For add item :a \t For submit :s");
        System.out.println("Enter your choice");
        ch=sc.next().charAt(0);
        System.out.println("Enter no of element:");
        n=sc.nextInt();
        System.out.println("Sl.no \t Price \t Quantity");
        int sl[]=new int[100];
        int qty[]=new int[100];
        int price[]=new int[100];
        int amt[]=new int[100];
                for(i=0;i<n;i++)
                {
                    sl[i]=sc.nextInt();
                    qty[i]=sc.nextInt();
                    price[i]=sc.nextInt();
                    amt[i]=qty[i]*price[i];
                    total=total+amt[i];
                }
                System.out.println("Sl.no \t Price \t Qty \t Amonut");
                {
                    for(i=0;i<n;i++)
                    {
                        System.out.print(sl[i]+"\t");
                        System.out.print(sl[i]+"\t");
                        System.out.print(sl[i]+"\t");
                        System.out.println(sl[i]);
                    }
                }
                System.out.println("Total="+total);
}
}