import java.util.*; 
class Main
{
     public static void main(String []args)
     {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);
       
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping numbers are: ");
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);
     }
}