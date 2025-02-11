import java.util.Scanner;
public class Pattern_Greate_Developer_Company {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int j=1;j<=n+2;j++){
            for(int k=1;k<=n-1;k++){
                System.out.print(" ");
            }
            System.out.println("e");
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
