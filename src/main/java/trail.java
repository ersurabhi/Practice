
	
	class trial1 {
		public void run() {
		System.out.println("class trial1 run");
	}
	 }
	 
	 class trial2 extends trial1{
			public void run2() {
			System.out.println("class trial2 run");
		}
	 }
	 

	 class trail extends trial2 {
		public void run() {
			System.out.println("class trial run");
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//trail obj = new trial1();
//trail obj = new trail();
//trial1 obj = new trail(); error
//trail obj = new trail();
//trial1 obj1=new trail();
//trial2 obj2=new trail();
trail obj = new trail();
obj.run2();
//obj1.run();
//obj2.run();
	}
}
	


