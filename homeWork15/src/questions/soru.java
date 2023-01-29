package questions;



	import java.util.Scanner;
	public class soru {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String answer;
	        do {
	            System.out.print("Tamam mı devam mı? (E/H): ");
	            answer = sc.nextLine();
	        } while (!answer.equalsIgnoreCase("E"));
	    }
	}
	
	

