import java.util.Scanner;
class DoubleOpt{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // Input double values
        System.out.print("Enter value for a: ");
        double a=input.nextDouble();

        System.out.print("Enter value for b: ");
        double b=input.nextDouble();

        System.out.print("Enter value for c: ");
        double c=input.nextDouble();

        // Operations
        double result1=a+b*c;
        double result2=a*b+c;
        double result3=c+a/b;
        double result4 = a % b + c;

        //result
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 +
                           ", " + result3 + ", and " + result4);
    }
}
