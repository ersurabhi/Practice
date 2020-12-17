import java.util.*;  
class Main
{  
     public static void main(String args[])
    {  
//        //Creating arraylist of String objects
//        ArrayList<String> color_list=new ArrayList<String>();  
//        //populate the arraylist with add method
//        color_list.add("Red");
//        color_list.add("Green");
//        color_list.add("Blue");
//        color_list.add("Cyan");
//        color_list.add("Magenta");
//        color_list.add("Yellow");
//        color_list.add("Yellow");
//        //Traverse the list through Iterator  
//        Iterator<String> itr=color_list.iterator();  
//        System.out.println("The contents of the arraylist are:");
//        while(itr.hasNext()){  
//            System.out.println(itr.next());  
//        }  
    	 TreeSet<Integer> set_oddnums=new TreeSet<Integer>();  
         set_oddnums.add(3);  
         set_oddnums.add(1);  
         set_oddnums.add(9);  
         set_oddnums.add(5);
         set_oddnums.add(7);
         set_oddnums.add(7);
         
         System.out.println("Elements in TreeSet are:");
         //traverse the treeset using iterator  
         Iterator<Integer> itr=set_oddnums.iterator();  
         while(itr.hasNext())
         {  
              System.out.print(itr.next() + " ");  
         } 
         set_oddnums.remove(7);
         Iterator<Integer> itr2=set_oddnums.iterator();
         System.out.println("");
         while(itr2.hasNext())
         {   
              System.out.print(itr2.next() + " ");  
         } 
         
         HashSet<String> set_subjects=new HashSet<String>(); 
         System.out.println("Elements in the given hashsetset_subjects are:");
         set_subjects.add("Maths");  
         set_subjects.add("Computers");  
         set_subjects.add("English");  
         set_subjects.add("French"); 
         set_subjects.add("English");
         //Traverse the hashset
         Iterator<String> itr1=set_subjects.iterator();  
         while(itr1.hasNext())
         {  
               System.out.println(itr1.next());  
         }  
    }  
}  