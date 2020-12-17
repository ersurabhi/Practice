import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMapDemo {
 
public static void main(String[] args) {
HashMap<Integer, String> m=new HashMap<Integer,String>();
 

m.put(2, "two");
m.put(3, "three");
m.put(4, "four");
m.put(null, "one");
m.put(null, null);
m.put(1, "one");

System.out.println("m=" +m);
 
TreeMap<String, String> tm =new TreeMap<String, String>();
 
tm.put("R", "red");
tm.put("B", null);
tm.put("null", null);
tm.put("G", "green");
System.out.println(tm);
tm.put("G", "green");
 
Hashtable<Integer, String> ht =new Hashtable<Integer, String>();
 
ht.put(1, "one");
ht.put(2, "two");

ht.put(4, "four");
//ht.put(null, "null");
ht.put(3, "three");
 
System.out.println(ht);
 
}
}