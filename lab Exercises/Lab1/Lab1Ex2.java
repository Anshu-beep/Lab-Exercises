package Day1;
import java.util.*;
public class Lab1Ex2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("red ");
		System.out.print("yellow ");
		System.out.print("green");
		String str;
		str=scan.next();
		if(str.equals("red")) {
			System.out.println("stop");
		}
		else if(str.equals("yellow")) {
			System.out.println("ready");
		}
		else if(str.equals("green")) {
			System.out.println("go");
		}
	}
}
