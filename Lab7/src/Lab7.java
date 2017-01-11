import java.util.Random;
import java.util.Scanner;
public class Lab7 {
	
	public static void main(String[] args){
    
	Scanner kb = new Scanner(System.in);
	System.out.println("Hello! Welcome to the lottery game.");
	System.out.println("Would you like to enter the number yourself or have the computer generate it.");
	System.out.println(" If you would like to enter the number, press 1 and if a computer generated number, press 2.");
	int initialChoice = kb.nextInt();
	
	if( initialChoice ==1){
	System.out.println("Please enter the first digit of the five digit lotter nummber.");
	int userChoice = kb.nextInt();
	System.out.println("Please enter the second digit of the five digit lotter nummber.");
	int userChoice2 = kb.nextInt();
	System.out.println("Please enter the third digit of the five digit lotter nummber.");
	int userChoice3 = kb.nextInt();
	System.out.println("Please enter the fourth digit of the five digit lotter nummber.");
	int userChoice4 = kb.nextInt();
	System.out.println("Please enter the fifth digit of the five digit lotter nummber.");
	int userChoice5 = kb.nextInt();
	int[] myPick= {userChoice, userChoice2, userChoice3, userChoice4, userChoice5};
	System.out.println("Your number is: ");
	for(int i=0; i<myPick.length;i++){
		System.out.print(myPick[i]+ " ");
	}
	int [] win= computerGenerateWinningNumber();
	System.out.println("\nThe winning number is:");
	for(int i=0; i<win.length;i++){
		System.out.print(win[i]+" ");
	}
	int w= compareNumbers( myPick, win);
	System.out.println("\nThis numbers matched:" + w);
	
	}
	else if(initialChoice==2){
		int [] myPick1= computerGenerateNumber();
		System.out.println("Your computer generated number is: ");
	for(int i=0; i<myPick1.length;i++){
		System.out.print(myPick1[i]+ " ");
	}
	int [] win= computerGenerateWinningNumber();
	System.out.println("\nThe winning number is:");
	for(int i=0; i<win.length;i++){
		System.out.print(win[i]+" ");
	}
	int w= compareNumbers( myPick1, win);
	System.out.println("\nThis numbers matched:" + w);
	}
	
	}
	
	
	public static int[] computerGenerateNumber(){
	    Random ran = new Random();
		int[] userNumber= new int[5];
		for(int i=0; i<userNumber.length; i++){
			userNumber[i]= ran.nextInt(9);
		}
		return userNumber;
		
	}
	public static int[] computerGenerateWinningNumber(){
	    Random ran = new Random();
		int[] winningNumber= new int[5];
		for(int i=0; i<winningNumber.length; i++){
			winningNumber[i]= ran.nextInt(9);
		}
		return winningNumber;
		
	}
	public static int compareNumbers(int[] myPick, int [] win){
		int count=0;
		for(int i=0; i<myPick.length; i++){
			if(myPick[i]== win[i]){
			count++;
			}
		
}
		return count;
}
	}
