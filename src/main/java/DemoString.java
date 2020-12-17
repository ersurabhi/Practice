//public class DemoString {
 
//public static void main(String[] args) {
//String s1="STH";
//String s2="STH";
//String s3=new String("STH");
//String s4=new String("STH");
// 
//System.out.println("s1=="+System.identityHashCode(s1));
//System.out.println("s2=="+System.identityHashCode(s2));
//System.out.println("s3=="+System.identityHashCode(s3));
//System.out.println("s4=="+System.identityHashCode(s4));
//}
//}

	 
//public static void main(String[] args) {
//String str="software";
//String S= str.concat(" engineering");
//System.out.println(S);
//}
// 
//}
public class DemoString implements Runnable {
	 
public void run() {
for(int i=0;i<10;i++) {
System.out.println("Music Playing ...... ");
}
}
 
public static void main(String Args[])
{
 
	DemoString p=new DemoString();
	Thread t1= new Thread (p);
t1.start();
 
DemoString d=new DemoString();
Thread t2= new Thread (d);
t2.start();
//for(int i=0;i<1000;i++) {
//System.out.println("coding");
//}
}
}