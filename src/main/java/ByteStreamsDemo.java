import java.io.FileInputStream;
 
import java.io.FileNotFoundException;
 
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
 
import java.io.IOException;
 
public class ByteStreamsDemo {
 
public static void main(String[] args) throws IOException {
 
//FileInputStream fin =null;
// 
//FileOutputStream fout =null;
// 
	FileReader input = null;
	 
	FileWriter output = null;
try {
 
//fin=new FileInputStream("./src/main/java/input.txt");
// 
//fout=new FileOutputStream("./src/main/java/output.txt");
	input = new FileReader("./src/main/java/input.txt");
	 
	output = new FileWriter("./src/main/java/output.txt");
	 
 
int c;
 
while((c=input.read() )!= -1)
 
{
System.out.println(Character.toString ((char) c));
output.write(c);
 
}
 
} catch (FileNotFoundException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
} catch (IOException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
}
 
finally {
 
if(input!=null) {
 
input.close();
 
}if(output!=null) {
 
output.close();
 
}
}
}
}
 