import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        
        int sum=0;
        System.out.println("Enter the number ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" numbers is :"+sum);
    }
}
