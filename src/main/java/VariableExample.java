public class VariableExample {
   // instance variable
   public String myVar="instance variable";
   
//   static variable
//   public static String myVar="instance variable";
    
   public void myMethod(){
    	// local variable
    	String myVar = "Inside Method";
    	System.out.println(myVar);
   }
   public static void main(String args[]){
      // Creating object
      VariableExample obj = new VariableExample();
      VariableExample obj1 = new VariableExample();
      VariableExample obj2 = new VariableExample();
    	
      /* We are calling the method, that changes the 
       * value of myVar. We are displaying myVar again after 
       * the method call, to demonstrate that the local 
       * variable scope is limited to the method itself.
       */
      System.out.println("Calling Method");
      obj.myMethod();
      System.out.println(obj.myVar);
      System.out.println(obj1.myVar);
      System.out.println(obj2.myVar);
      obj1.myVar= "new one";
      System.out.println("*******************");
      System.out.println(obj.myVar);
      System.out.println(obj1.myVar);
      System.out.println(obj2.myVar);
   }
}