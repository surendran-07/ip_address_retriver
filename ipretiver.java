import java.io.*;
import java.net.*;

public class ipretiver {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
URL url=new URL("http://www.google.com");
BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));
String line;
while ((line =in.readLine())!=null) {
	System.out.println(line);
}
in.close();
}

}
