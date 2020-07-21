import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter Your Choice:");
			choice=sc.nextInt();
			if(choice==5)
				return ;
			System.out.println("Enter Number1:");
			double num1=sc.nextDouble();
			System.out.println("Enter Number2:");
			double num2=sc.nextDouble();
			Calculator calculator=new Calculator(0,0);
			double res=0;
			switch(choice)
			{
				case 1:calculator=new Addition(num1,num2);
					break;
				
				case 2:calculator=new Subtraction(num1,num2);
				break;
				
				case 3:calculator=new Multiplication(num1,num2);
				break;
				
				case 4:calculator=new Division(num1,num2);
				break;
			}
			System.out.println("Result is :"+calculator.calculate());
			
			
		}while(choice<=4);
	}

}
