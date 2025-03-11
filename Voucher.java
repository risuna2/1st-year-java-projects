import java.util.Scanner;

public class Voucher{
	
	public static boolean isValidOrder(int orders){
		
		boolean valid = true;
		
			if(orders>= 1 && orders<=100){
			valid = true;
			}else{
			valid = false;
			}
		
			return valid;
		}
	
	public static double determineVoucherAmnt(int orders){
		double amount = 0.0;
		
			if(orders >= 4 && orders <= 6){
				amount = orders * 15.00;
			}else if(orders >= 7 && orders <= 15){
				amount = orders * 16.50;
			}else if(orders >= 16 && orders <= 30){
				amount = orders * 18;
			}else if(orders >=31 ){
				amount = orders * 20;
			}else {
				amount = 0;
			}
		return amount;
	}

	public static void displayVoucher(int orders, String accNo , double amount){
	
		System.out.println( "Account # : " + accNo +"\nAmount :R " + amount );
	}

	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
	
		while(true){
		
			int clientNumber = 1;
		
			System.out.println("Provide account number for client " + clientNumber+ ": " );
				String accNo = scan.next();
				if(!accNo.isEmpty()){
					
					clientNumber++;
				}
	
		
			System.out.println("Provide number of orders for client: ");
			
				int orders = scan.nextInt();
		
				boolean status = isValidOrder(orders);
		
				if(status == true){
				
					double voucher = determineVoucherAmnt(orders);
				
					displayVoucher(orders , accNo , voucher);
				
				}else{
					System.out.print("Invalid order number");
				}
			}
	
		}

	}
			
		
		
	
	

	
		
		