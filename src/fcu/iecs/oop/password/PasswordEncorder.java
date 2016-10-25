package fcu.iecs.oop.password;

public class PasswordEncorder {
    
    public String encode(String password){
    	String str1 = password.replace("e","3").replace("i","1").replace("o","0");
    	String str2 = str1.replace("t","7").replace("a","4");
    	String str3 = str2.replace("T","7").replace("A","4");
    	String str4 = str3.replace("E","3").replace("I","1").replace("O","0");
		return str4 ;
    }
}