package atm;

import java.util.Scanner;

public class UserInteface {
	private static int status;
public static void main(String[] args) {
	AtmOperationimpl impl=new AtmOperationimpl();
	
Scanner sc=new Scanner(System.in);
int atmnumber=123456;
int atmpin=123;
System.out.println("ENTER THE ATM NUMBER");
int atmnum2=sc.nextInt();
System.out.println("ENTER THE ATM PIN");
int atmpin2=sc.nextInt();
while(true) {
if(atmnumber == atmnum2 && atmpin == atmpin2) {
System.out.println("1.viewAvailable\n 2.withdrawAmount\n 3.DepositeAmount\n 4.ViewMinistatement\n 5.exit");
	int ch=sc.nextInt();
	if(ch == 1) {
		impl.ViewBalance();
	}
	else if(ch == 2) {
		System.out.println("Enter Amount to Withdraw");
		double withdrawAmount=sc.nextDouble();
		impl.withdrawAmount(withdrawAmount);
	}
	else if(ch == 3) {
		System.out.println("Enter Deposite Amount");
	double depositeAmount=sc.nextDouble();
	impl.depositeAmount(depositeAmount);
	}
	else if(ch == 4) {
	impl.ViewMiniStatement();	
	}
	else if(ch == 5) {
		System.out.println("Collect Your Atm CArd \n Thank You");
		System.exit(status);
	}
}

else {
	System.out.println("INCORRECT ATM NUMBER OR PIN");
	
}
}


}
}
