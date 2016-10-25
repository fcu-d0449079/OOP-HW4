package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	String password;
    	do{
        PasswordEncorder string = new PasswordEncorder();
        System.out.println("Please enter a password");
        Scanner scanner = new Scanner(System.in);
        password = scanner.next();
        System.out.println(string.encode(password));
    	}while(!password.equals("exit"));
    }
}
