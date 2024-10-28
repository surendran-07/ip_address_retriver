package sem;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressRetriver  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the website  name");
		String website=scanner.nextLine();
		try {
			InetAddress inetaddress=InetAddress.getByName(website);
			System.out.println("the rl of"+ website +"is"+inetaddress.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("unable to retive ip address of the" +website);
			e.printStackTrace();
			
		}
        scanner.close();
	}
}
