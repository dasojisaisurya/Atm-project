package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationimpl implements Atminterface{
Atm atm=new Atm();
Map<Double,String> ministmt=new HashMap<>();	@Override
	public void ViewBalance() {
		System.out.println("AvailableBalance"+atm.getBalance());
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("collect the Cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.put(withdrawAmount,"Amount Withdraw");
				ViewBalance();
				
				
				
			}
			else {
				System.out.println("Insuffient Balance");
				
			}
		}
			else {
				System.out.println("enter the amount in  terms in 500");
		
		}
		
	}

	@Override
	public void depositeAmount(double depositeAmount) {
		// TODO Auto-generated method stub
		System.out.println("depositeAmount"+depositeAmount);
		atm.setBalance(atm.getBalance()+depositeAmount);
		ministmt.put(depositeAmount,"Deposite Succesfully");
		ViewBalance();
	}

	@Override
	public void ViewMiniStatement() {
		// TODO Auto-generated method stub
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
	}

}
