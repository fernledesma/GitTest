
import java.util.Scanner;
public class Lab6Task2 {

	public static void main(String[] args){
		
		getChoice();
	   }
	   
public static void getChoice(){
		   Scanner keyboard= new Scanner(System.in);
	       System.out.println("Welcome! Would you like to calculate your Bmi using the English system or Metric system?");
	       System.out.println("If you would like to use the English system, enter 1.");
	       System.out.println("If you would like to use the Metric system, enter 2.");
	       int choice= keyboard.nextInt();
	       if (choice==1){
	    	   bmiEnglish();
	       }
	       else if(choice==2){
	    	   bmiMetric();
	       }
	       else{
	    	   errorMessage();
	       }keyboard.close();
}
	       public static void bmiEnglish(){
	    	   Scanner keyboard= new Scanner(System.in); 
	    	   //Reminding user that the calculation in the english system
	            System.out.println("Bmi calculator is using English units.");

	            //Asks for user's weight in pounds and saves the value in the weight
	            System.out.println("Please enter your weight in pounds.");
	            double weight = keyboard.nextDouble();

	            //Asks for user's height in inches and saves the value in height
	            System.out.println("Please enter your height in inches.");
	            double height = keyboard.nextDouble();
	            keyboard.close();
	            
	            //Calculates Bmi and prints it
	            int bmi = (int) ((weight/ (height*height)) *703) ;
				if(bmi>0 && bmi<24){
	                System.out.println("Your bmi is normal.");
	             }
	             else if(bmi >= 25 && bmi <= 29){
	                System.out.println("Your bmi indicates you are overweight.");
	             }
	             else if(bmi >= 30 && bmi <=39) {
	                System.out.println("Your bmi indicates you are obese.");
	             }
	             else if(bmi >= 40){
	                System.out.println("Your bmi indicates you are extremely obesity.");
	             }
	             else{
	                System.out.println("You have an invalid bmi");
	             }

			}
      public static void bmiMetric(){
        	Scanner keyboard= new Scanner(System.in);
        	//Reminds user that the calculation in the metric system
            System.out.println("Bmi calculator is using Metric units.");

            //Asks for user's weight in kilograms and saves the value in the weight value
            System.out.println("Please enter your weight in kilograms.");
            double weight = keyboard.nextDouble();

            //Asks for user's height in meters and saves the value in the height value
            System.out.println("Please enter your height in meters.");
            double height = keyboard.nextDouble();
            keyboard.close();

          //Calculates Bmi and prints it
            int bmi = (int) (weight/ (height*height)) ;

            System.out.println("Your bmi is: "+ bmi);
			if(bmi>0 && bmi<24){
                System.out.println("Your bmi is normal.");
             }
             else if(bmi >= 25 && bmi <= 29){
                System.out.println("Your bmi indicates you are overweight.");
             }
             else if(bmi >= 30 && bmi <=39) {
                System.out.println("Your bmi indicates you are obese.");
             }
             else if(bmi >= 40){
                System.out.println("Your bmi indicates you are extremely obesity.");
             }
             else{
                System.out.println("You have an invalid bmi");
             } 
       }

      public static void errorMessage(){
      
    	  System.out.println("Error! Invalid input. Goodbye.");
      }
}
