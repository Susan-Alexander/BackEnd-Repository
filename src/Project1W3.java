
public class Project1W3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//Coding Request 1:
		
		
	//Create an int array called ages, add 8 values to the array
	

		int resultAge = 0;
		int x;
		
		//Create the ages array
		int[] ages = {3,9,23,64,2,8,28,93};
		
		
		//Title output 1:
		System.out.println("First Coding Request: \n");
		
		int result = ages[ages.length - 1];
		
		System.out.println("     For the first array, Results of subtracting the first array cell from the last = " + (result - ages [0]));
		                
		
		System.out.println(); 
		
		//Create a new string of 1 cell size bigger then the old array
		int [] largerAges = new int[ages.length + 1] ;
		
		//Add the numbers to the new array from the old array;
		for (int i = 0; i < ages.length; i++) {
			largerAges[i] = ages[i];
			
		}
			            	
		//Subtracted the value of the first element in the array from the value in
		//the last element of the array and printed it out to the console.
		
		
				largerAges[ages.length] = 44;
				
				for (int i = 0; i < largerAges.length; i++) {
					
			
				}
				int largerArrayResult = largerAges[largerAges.length - 1];
				System.out.println("     For the second larger array, Results of subtracting the first array cell from the last = " + (largerArrayResult - largerAges [0]));
	
	
	    //Find and print out the average of an array to the console.
				
				
				int sum = 0;
				
			
			for (int i = 0; i < largerAges.length; i++) {
					
					sum += largerAges[i];
			
			}
			
			int average = sum / largerAges.length;
			
			System.out.println(); 
			System.out.println("     The average age is: " + average + "\n");
			
	// ----------------------------------------------------------------------------------	
	// ----------------------------------------------------------------------------------
	//Code Request 2:
			System.out.println("Second Coding Request: \n");	
			
			//Create the names array
			String [] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
			 
			//Calculate the average number of letters per name and print the result to the console.
			int sumOfCount = 0;
			
			for (int i = 0; i < names.length; i++) {
				
				//count++
				int count =names[i].length();					                           	

			    sumOfCount += count;		
		}
						                           
			 System.out.println("     The Average of number of characters in this names array is  " + (sumOfCount) / names.length);
		
			
			  // Loop to iterate through the array again and concatenate all the names together, 
	          // separated by spaces, and print the result to the console.
			
			String runOnNames = "";
			
	        for (int i = 0; i < names.length; i++) {
				
				runOnNames += names[i];	 
		
		}
	         System.out.println();
	         System.out.println("     The value of the final run-on-name is: " + runOnNames);

	 // ----------------------------------------------------------------------------------	
	 // ----------------------------------------------------------------------------------	
	 //Code Request 5: Create a new array of int called nameLengths. Write a loop to iterate over the
	 //   previously created names array and add the length of each name to the nameLengths array.

	         System.out.println();
	         System.out.println("Fifth Coding Request: " + "\n"); 
	 	    
	       //Create the namelengths array
	         int [] nameLengths = new int[6];
	         
	         for (int i = 0; i < names.length; i++) {
					        	 
	        	 nameLengths [i] = names[i].length();
	  
	        	 System.out.println("    Length of each name in the namelengths array: " + names[i] + " = " + nameLengths[i]);
		  		
			}
	  // ----------------------------------------------------------------------------------	
	  // ----------------------------------------------------------------------------------
	  //Code Request 6: Calculate the sum of all the elements in nameLengths and print the result to the console.
	         
	         int total = 0;
	                   
	         	for (int i = 0; i < nameLengths.length; i++) {
					        	 
	         		  total += nameLengths[i];
	         	
			}
	            System.out.println();
		        System.out.println("Sixth Coding Request: " + "\n"); 
	        	System.out.println("    The sum of all the elements in the nammelengths array: " + total);
	        	System.out.println();
	  // ----------------------------------------------------------------------------------
	  // ----------------------------------------------------------------------------------
	  //Code request 7: Create a method that takes a String, word, and an int, n, as arguments and returns the word 
	  //concatenated to itself n number of times. 
		        	
		        	String word = "Guards";
		        	int numOfTimes = 3;
		        	
		        	String concatWord = multipleWords(word, numOfTimes);	
		        	
		           	System.out.println("Seventh Coding Request: " + "\n"); 
		           	System.out.println("     " + concatWord);
	  // ----------------------------------------------------------------------------------
      // ----------------------------------------------------------------------------------
	  //Code Request 8: Create a method that takes two Strings, firstName and lastName, and returns a full name 
	  //(the full name should be the first and the last name as a String separated by a space).
	        	
	        	String firstName = "Sam";
	        	String lastName = "Vimes";
	        	String fullName = createFullName(firstName, lastName);
	        	
	            System.out.println();
	        	System.out.println("Eighth Coding Request: " + "\n"); 
	        	System.out.println("     " + fullName);	
	        	
	  // ----------------------------------------------------------------------------------
	  // ----------------------------------------------------------------------------------
	  // Code Request 9: Write a method that takes an array of int and returns true if the sum of all the
	  // ints in the array is greater than 100.
	        	
	        	int[] numberArray = new int [3];
	        	numberArray[0] = 22;
	        	numberArray[1] = 60;
	        	numberArray[2] = 54;
	        	
	        	boolean answer = isGreater(numberArray);
	        
	            System.out.println();
	        	System.out.println("Ninth Coding Request: " + "\n"); 
	        	System.out.println("     Is the sum of all the elements in the array larger then 100?: " + answer);
	   // ----------------------------------------------------------------------------------	
	   // ----------------------------------------------------------------------------------
       // Code Request 10: Write a method that takes an array of double and returns the average of all the
	   // elements in the array.
			     double[] doubleNumArray = new double [3];
			     doubleNumArray [0] = 34.5;
			     doubleNumArray [1] = 66.34;
			     doubleNumArray [2] = 12.6;	
			     
			    double averageForArray = arrayAverage(doubleNumArray);
			     
			     System.out.println();
			     System.out.println("Tenth Coding Request: " + "\n"); 
		         System.out.println("     The average of this array is: " + averageForArray);
	        	
		// ----------------------------------------------------------------------------------   	
	    // ----------------------------------------------------------------------------------
	    //Code Request 11: Write a method that takes two arrays of double and returns true if the average
	    // of the elements in the first array is greater than the average of the elements in the second array.
		         double[] dArrayOne = new double [3];
		         dArrayOne [0] = 34.5;
		         dArrayOne [1] = 66.34;
		         dArrayOne[2] = 12.6;	   
		         
		         double[] dArrayTwo = new double [3];
		         dArrayTwo [0] = 19.6;
		         dArrayTwo [1] = 14.5;
		         dArrayTwo[2] = 16.3;	  
	  
		        boolean aResult = averagecomparision(dArrayOne, dArrayTwo);
			     
		        System.out.println();
			    System.out.println("Eleventh Coding Request: " + "\n"); 
		        System.out.println("     The first Array's average is larger then the second array's average: " + aResult);
	    // ----------------------------------------------------------------------------------     
	    // ---------------------------------------------------------------------------------- 
        //Code Request 12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
	    // and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		         boolean isHotOutside = true;
		         double moneyInPocket = 20.00;
		        
		        System.out.println();
		        System.out.println("Twelfth Coding Request: " + "\n"); 
		        
		       // willBuyDrink(isHotOutside, moneyInPocket);
		        System.out.println("     Testing...If we need to and have the money to buy a drink: " +  willBuyDrink(isHotOutside, moneyInPocket));
		          
	    // ----------------------------------------------------------------------------------
	    // Code Request 13: The method I wrote: a two array length compare method, this creates a simple test
	    // a person can run to test out two double arrays. I wanted something to test out  
	    // two arrays such as could happen in the earlier method if the two arrays were of 
	    // different lengths.I wanted it to return a boolean value to then wrap in code
	    // for error testing. 
		           
		        System.out.println();
		        System.out.println("Thriteeth Coding Request: " + "\n"); 
		        System.out.println("     This compares the lenght of two arrays and returns a boolen result"); 
		        System.out.println("     In this test the result is: " + twoDoubleArrayLengthCompare(dArrayOne, dArrayTwo)); 
		         
		     // ----------------------------------------------------------------------------------
		        System.out.println();
	     	    System.out.println("- This is the end of the output for this Java Week 3 assignment - "); 
	
			
		}
	// ----------------------------------------------------------------------------------
	// Methods Section:
	// ----------------------------------------------------------------------------------
	private static boolean willBuyDrink(boolean tooHot, double pocketMoney) {
		if ((tooHot == true) && (pocketMoney > 10.50)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	// ----------------------------------------------------------------------------------
	private static boolean twoDoubleArrayLengthCompare(double [] array1, double [] array2) {
		
		if (array1.length == array2.length) {
			return true;					
		} else {
			return false;
		}	
	}
	// ----------------------------------------------------------------------------------
	private static boolean averagecomparision(double[] dArrayOne, double[] dArrayTwo) {
		double sum1 = 0;
		double sum2 = 0;
		
		for (int i = 0; i < dArrayOne.length; i++) {
			
			sum1 += dArrayOne[i];
			sum2 += dArrayTwo[i];
		}
		if (sum1 > sum2) {
			return true;
		} else {
			return false;
		}	
	}
	// ----------------------------------------------------------------------------------
	private static double arrayAverage(double [] averageArray) {
		double sum = 0;
		for (int i = 0; i < averageArray.length; i++) {
			
			sum += averageArray[i];
		}
		return sum / averageArray.length;	
	}
	// ----------------------------------------------------------------------------------	
	private static boolean isGreater(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		if (sum >= 100) {
			return true;
		} else {
		return false;
		}
	}
	// ----------------------------------------------------------------------------------	
	private static String multipleWords(String word, int numberOfTimes) {
		String result = "";
		for (int i = 0; i < numberOfTimes; i++) {
			result += word;
		}
		return result;
	}
	// ----------------------------------------------------------------------------------	
	private static String createFullName(String a, String b) {
		String fullName = a + " " + b;
		return fullName;
	}
	// ----------------------------------------------------------------------------------	
}

