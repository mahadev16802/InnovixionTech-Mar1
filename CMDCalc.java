import java.util.Scanner;

public class CMDCalc {
    public static void main(String[] args) {

	double result;

	System.out.print("CMD CALCULATOR : \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.print("Enter the operator \n+\n-\n*\n/");
        char op = sc.next().charAt(0);

        
        switch (op) {
            case '+':
                res=n1+n2;
                break;

            case '-':
                res=n1-n2;
                break;

            case '*':
                res=n1*n2;
                break;

            case '/':
                if(n2==0)
		{
                    System.out.println("Zero division error : denominater cant be '0' ");
                    return;
                }
                res=n1/n2;
                break;

            default:
                System.out.println("enter a valid operator from + , - , *, / only");
                return;
        }

        System.out.println("Result is : " +res);
    }
}