package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class NissanTiida {
	
	public void tiida(){
		int i,j;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number :");
		int n = scanner.nextInt();
			for(i=1;i<=n;i++){
				for(j=1;j<=n;j++){
					System.out.print("*");
				}
				System.out.println(" ");
			}
	}

}
