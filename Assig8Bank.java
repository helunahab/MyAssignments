
 interface Bank1{
		int getBalance();
	}
 	class BankA implements Bank1{
 			int BankA;
		@Override
		public int getBalance() {
			this.BankA=1000;
			return BankA;
		}
}

	class BankB implements Bank1{		
		int BankB;
		@Override
		public int getBalance() {
			this.BankB=2000;
			return BankB;
		}
}
	 class BankC implements Bank1{
		 int BankC;
			@Override
			public int getBalance() {
				this.BankC=2500;
				return BankC;
			}
	}
	public class Assig8Bank {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			BankA a1 = new BankA();
			System.out.println(a1.getBalance());
			BankB b1 = new BankB();
			System.out.println(b1.getBalance());
			BankC c1 = new BankC();
			System.out.println(c1.getBalance());
			
	}

}
