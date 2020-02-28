import java.util.Scanner;

public class Lab1y2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int decision = 0;
        String str1=" ";String str2=" ";String str3="";
        double num1=0; double num2=0;
        int[] array1 = new int[1]; int[]array2 = new int[1]; int[]array3 = new int[1];
		String[] warpedArrays;

        boolean arrays = false; int dec2=0;
        boolean exit = false; boolean strings = false;
        System.out.println("Welcome to my units 1 and 2 laboratory");
        do
        {
            System.out.println("Option 1: Type 3 strings of characters");
            System.out.println("Option 2: Display the length of the 3 strings of characters");
            System.out.println("Option 3: Concatenate the 3 strings of characters");
            System.out.println("Option 4: Display the character on a specific position of the 3 strings of characters");//method done;
            System.out.println("Option 5: Type 2 real numbers greater than 0");
            System.out.println("Option 6: Show the quotient between the 2 real numbers");
            System.out.println("Option 7: Show the quotient and remainder of the whole parts of the 2 real numbers");
            System.out.println("Option 8: Create 3 arrays of whole numbers of a specific length");
            System.out.println("Option 9: Displays the 3 arrays of whole numbers");
            System.out.println("Option 10: Displays the average of the numbers in a specific array");
            System.out.println("Option 11: Displays the greatest number in a specific array");
            System.out.println("Option 12: Creates a new array with the result of a specific operation between the elements of two specific arrays");
            System.out.println("Option 13: Creates a new array by merging the 3 arrays (allows repeated elements");
            System.out.println("Option 14: Creates a new array by merging the 3 arrays (does not allow repeated elements");
            System.out.println("Option 15: Creates a new array with the interception of the three arrays");
            System.out.println("Option 16: Shifts a specific amount of times the elements in a specific array");
            System.out.println("Option 17: Arranges the numbers in a specific array from least to greatest");
            System.out.println("Option 18: exit");
            System.out.println("Select the option you want (1-18):");
            decision = lector.nextInt();
            lector.nextLine();
            System.out.println("You selected option "+decision);
	    if(decision<19)
	    {	
            switch(decision)
            {
                case 1:
                    System.out.println("please type 3 strings of characters");
                    str1=lector.nextLine();
                    str2=lector.nextLine();
                    str3=lector.nextLine();
                    System.out.println("You entered the next strings: " + str1  +" "+ str2+" "+str3);
                    strings = true;
		    break;

                case 2:
                    if(strings)
                    {
                        System.out.println("The first string has " + str1.length()  +" characters");
                        System.out.println("The second string has " + str2.length() + " characters");
                        System.out.println("The third string has " + str3.length() + " characters");
                    }
                    else{System.out.println("For this option you must first enter 3 strings of characters (option 2)");}
                    break;

                case 3:
                    if(strings)
                    {
                        System.out.println(str1+" "+ str2+" " +str3);
                    }
                    else{System.out.println("For this option you must first enter 3 strings of characters (option 2)");}
                    break;

                case 4:
                    if(strings)
                    {
                        System.out.println("In which position of the strings do you want to know the character? (remember it starts at 0)");
                        int position=0;
                        position=lector.nextInt();
                  	if(charInPos(str1, position).equals("tooLong"))
			{System.out.println("The first string is not that long");}
                        else{System.out.println("The character in position "+position+" in the first string is "+charInPos(str1, position).charAt(0));}
                        if(charInPos(str2, position).equals("tooLong"))
                        {System.out.println("The second string is not that long");}
                        else{System.out.println("The character in position "+position+" in the second string is "+charInPos(str2, position).charAt(0));}
                  	if(charInPos(str3, position).equals("tooLong"))
                        {System.out.println("The third string is not that long");}
                        else{System.out.println("The character in position "+position+" in the third string is "+charInPos(str2, position).charAt(0));}
                    }
                    else{System.out.println("For this option you must first enter 3 strings of characters (option 2)");}
		    lector.nextLine();
                    break;

                case 5:
                    System.out.println("Type two real numbers greater than 0");
                    do
                    {
                        num1=lector.nextDouble();
                        num2=lector.nextDouble();
                        if(num1<=0){System.out.println("The first number is invalid");}
                        if(num2<=0){System.out.println("The second number is invalid");}
                    }
                    while((num1<=0) || (num2<=0));
                    lector.nextLine();
                    break;

                case 6:
                    if(num1!=0)
                    {
                        double quotient = num1/num2;
                        System.out.println("The quotient between the first and second number is "+quotient);
                    }
                    else{System.out.println("For this option, you must first enter two real numbers (option 6)");}
                    break;

                case 7:
                    if(num1!=0)
                    {
                        double quotient = (int)num1/(int)num2;
                        double remainder = (int)num1%(int)num2;
                        System.out.println("The quotient between the whole parts of first and second number is "+quotient+" and the remainder is "+remainder);
                    }
                    else{System.out.println("For this option, you must first enter two real numbers (option 6)");}
                    break;

                case 8:



                    System.out.println("Creating 3 arrays of whole numbers");
                    
                    System.out.println("How many numbers will the first array have?");
                    array1=new int[lector.nextInt()];
                    System.out.println("How many numbers will the second array have?");
                    array2=new int[lector.nextInt()];
                    System.out.println("How many numbers will the third array have?");
                    array3=new int[lector.nextInt()];
                    System.out.println("Type the numbers that belong to the first array");
                    for(int i=0;i<array1.length;i++)
                    {do{array1[i]=lector.nextInt();} while(array1[i]==0);}
                    System.out.println("Type the numbers that belong to the second array");
                    for(int j=0;j<array2.length;j++)
                    {array2[j]=lector.nextInt();}
                    System.out.println("Type the numbers that belong to the third array");
                    for(int k=0;k<array3.length;k++)
                    {array3[k]=lector.nextInt();}
                    arrays=true;


                    break;

                case 9:
                    if(arrays)

                    {
                        System.out.println("Check out the numbers of the coolest array: The first one!");
                        for(int i=0; i<array1.length; i++){System.out.println(array1[i]);}
                        System.out.println("Now look at the a m a z i n g numbers in the second array!");
                        for(int i=0; i<array2.length; i++){System.out.println(array2[i]);}
                        System.out.println("And last but not least, the hottest numbers out there, hosted in array number 3!");
                        for(int i=0; i<array3.length; i++){System.out.println(array3[i]);}
                    }
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 10:
                    if(arrays)
                    {
                       do{ System.out.println("Which array do you want to know the average of? (1, 2 or 3)");
                        double aver=0;
                        dec2=lector.nextInt(); lector.nextLine();
                        if (dec2==1||dec2==2||dec2==3)
			 {switch(dec2)
                        {
                            case 1:
                                aver=averOfArray(array1);
                                break;
                            case 2:
                                aver=averOfArray(array2);
                                break;
                            case 3:
                                aver=averOfArray(array3);
                                break;
                        }
                        System.out.println("The average for that array is "+aver);
                     }
		    } while(dec2!=1||dec2!=2||dec2!=3);}
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 11:
                    if(arrays)
                    {
                        double greatest=0;
						do{System.out.println("From which array do you want to know the greatest number of?  (1, 2 or 3)");
                        dec2=lector.nextInt(); lector.nextLine();
                        if (dec2==1||dec2==2||dec2==3)
			 {switch(dec2)
                        {
                            case 1:
                                greatest=greatestOfArray(array1);
                                break;
                            case 2:
                                greatest=greatestOfArray(array2);
                                break;
                            case 3:
                                greatest=greatestOfArray(array3);
                                break;
                        }
						
                        System.out.println("The greatest number of that array is "+greatest);
                    }
					} while(dec2!=1||dec2!=2||dec2!=3);}
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 12:
                    if(arrays)
                    {do{
		    System.out.println("Select which array you want operated (1, 2 or 3)(1/2)");
                    dec2=lector.nextInt();lector.nextLine();}
					while(dec2!=1||dec2!=2||dec2!=3);
		    int[]arop1= defineArray(dec2, array1, array2, array3);
		    do{System.out.println("Select which array you want operated (1, 2 or 3) (2/2)");
                    dec2=lector.nextInt();lector.nextLine();}
					while(dec2!=1||dec2!=2||dec2!=3);
		    int[]arop2= defineArray(dec2, array1, array2, array3);
		    System.out.print("Select which operation you want performed between those arrays \n" + "1: Addition \n"  + "2: Subtraction\n" + "3: Multiplication \n");
		    dec2=lector.nextInt();
		    int[] opedArrays = operateArrays(dec2, arop1, arop2);
		    System.out.println("The results of that operation between those arrays is");
		    System.out.print(opedArrays);
                    }
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 13:
                    if(arrays)
                    {
		    warpedArrays=mergeArraysRep(array1, array2, array3);
		    System.out.println("These are the elements of an array resulting from merging the three arrays (allowing repetition):");
		    for(int i=0; i<warpedArrays.length; i++) 
			{System.out.println(warpedArrays[i]);}
                    }
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 14:
                    if(arrays)
                    {
		    warpedArrays=mergeArraysNoRep(array1, array2, array3);
		    System.out.println("These are the elements of an array resulting from merging the three arrays (not allowing repetition):");
		    for(int i=0; i<warpedArrays.length; i++) 
			{System.out.println(warpedArrays[i]);}
                    }
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 15:
                    if(arrays)
                    {
		    int [] interceptedArrays=interceptArrays(array1, array2, array3);
		    System.out.println("These are the elements of an array resulting from intercepting the three arrays:");
		    for(int i=0; i<interceptedArrays.length; i++) 
			{System.out.println(interceptedArrays[i]);}
                    }
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 16:
                    if(arrays)
                    {
		    do{System.out.println("Which array do you want to shift? (1, 2 or 3)");
		    dec2=lector.nextInt(); lector.nextLine();} while(dec2!=1||dec2!=2||dec2!=3);
		    System.out.println("How many times do you want to shift that array?");
		    switch(dec2)
			{
			case 1:
			  dec2=lector.nextInt(); lector.nextLine();
			  array1=shiftArray(array1, dec2);
			  System.out.println("Ok, the new order of the first array is: ");
			  for(int i=0; i<array1.length; i++) 
 			  	{System.out.println(array1[i]);}
		    	break;
		        case 2:
		    	  dec2=lector.nextInt(); lector.nextLine();
			  array2=shiftArray(array2, dec2);
			  System.out.println("Ok, the new order of the second array is: ");
			  for(int i=0; i<array2.length; i++) 
 			  	{System.out.println(array2[i]);}
		    	break;
		        case 3:
		    	  dec2=lector.nextInt(); lector.nextLine();
			  array3=shiftArray(array3, dec2);
			  System.out.println("Ok, the new order of the third array is: ");
			  for(int i=0; i<array3.length; i++) 
 			  	{System.out.println(array3[i]);}
		    	break;
		    	}		    
                    }
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;

                case 17:
                    if(arrays)
                    {
		    System.out.println("Which array do you want to rearange from least to greatest? (1, 2 or 3)");
		    dec2=lector.nextInt(); lector.nextLine();
		    switch(dec2)
		    {
		    case 1:
		      array1=rearrangeArray(array1);
		      System.out.println("Ok, the new order of the first array is: ");
		      for(int i=0; i<array1.length; i++) 
 			  {System.out.println(array1[i]);}
		    break;
		    case 2:
		      array2=rearrangeArray(array2);
		      System.out.println("Ok, the new order of the second array is: ");
		      for(int i=0; i<array2.length; i++) 
 			  {System.out.println(array2[i]);}
		    break;
		    case 3:
		      array3=rearrangeArray(array3);
		      System.out.println("Ok, the new order of the third array is: ");
		      for(int i=0; i<array3.length; i++) 
 			  {System.out.println(array3[i]);}
		    break;
					}
					}
                    else{System.out.println("For this option you must first create 3 arrays (option 9)");}
                    break;
                case 18:
                    System.out.println("Good bye!");
                    exit = true;
                    break;
            }
            System.out.println("Press enter to continue");
            lector.nextLine();
	    cls();
	}
        }
        while(!exit);


	
    }

/**
* name: charInPos<br>
*this method returns a String with the character in a given position or "tooLong" if the position is larger than the string<br>
*@param: pos must be a positive int.<br>
*@param: str must be a String not empty or null.<br>
*@return: returns a String with a single character (corresponding to the character in the given position in the given string) or a string that says tooLong if the chain does not have that position (it is shorter). <br>
*/
public static String charInPos(String str , int pos)
{
	String result;
	if(pos>str.length()-1)
	{result="tooLong";}
	else
	{result= ""+ str.charAt(pos);}
	return result;
}
/**
*<b>name:</b> averOfArray<br>
*this method calculates the average of a given array.<br>
*@param: array must be an array of integers, not null.<br>
*@return: returns a double with the average of the given array.<br>
*/
public static double averOfArray(int[]array)
{
	double average=0;
	for(int i=0; i<array.length;i++)
             {average+=array[i];}
	average/=array.length;
	return average;
}
/**
<b>name:</b>greatestOfArray <br>
*this method returns the greatest number in a given array.<br>
*@param: array must be an array of integers not null.<br>
*@return: returns a double with the greatest number of the given array.<br>
*/
public static double greatestOfArray(int[]array)
{
	double great=0;
	for(int i=0; i<array.length;i++)
		{if(array[i]>great)
			{great=array[i];}
		}
return great;
}
/**
<b>name:</b> defineArray<br>
*this method returns an array chosen between the three given.<br>
*@param: dec must be a positive integer.<br>
*@param: array1 must be an array of integers, not null.<br>
*@param: array2 must be an array of integers, not null.<br>
*@param: array3 must be an array of integers, not null.<br>
*@return: returns an array of integers (the chosen one) between the three given.<br>
*/
public static int[] defineArray(int dec, int[]array1, int[]array2, int[]array3)
{
	switch(dec)
		    {
		    	case 1:
		    	  return array1;
		    	  
		    
		    	case 2:
		    	  return array2;
		    	 

		    	case 3:
		    	  return array3;
		    	  
		    }

	return array1;
}

/**
<b>name:</b> operateArrays <br>
*this method returns an array of integers with the results of an operation between the two given integer arrays.<br>
*@param: op must be a positive integer (1,2 or 3).<br>
*@param: ar1 must be an array of integers, not null.<br>
*@param: ar2 must be an array of integers, not null.<br>
*@return: returns an array of integers with the results of an operation between the two given integer arrays, its length is that of the shortest array.<br>
*/
public static int[] operateArrays(int op, int[] ar1, int[] ar2)
{
	int[]resultingArray;
	if(ar1.length<ar2.length)
	{
		resultingArray = new int[ar1.length];
		switch(op)
		{
			case 1:
			  for(int i=0; i<ar1.length;i++)
			  {
				resultingArray[i]=ar1[i]+ar2[i];
			  }
			  break;
			case 2:
			  for(int i=0; i<ar1.length;i++)
			  {
				resultingArray[i]=ar1[i]-ar2[i];
			  }
			  break;
			case 3:
			  for(int i=0; i<ar1.length;i++)
			  {
				resultingArray[i]=ar1[i]*ar2[i];
			  }
			  break;
		}
	}
	else
	{
		resultingArray = new int[ar2.length];
		switch(op)
		{
			case 1:
			  for(int i=0; i<ar2.length;i++)
			  {
				resultingArray[i]=ar1[i]+ar2[i];
			  }
			  break;
			case 2:
			  for(int i=0; i<ar2.length;i++)
			  {
				resultingArray[i]=ar1[i]-ar2[i];
			  }
			  break;
			case 3:
			  for(int i=0; i<ar2.length;i++)
			  {
				resultingArray[i]=ar1[i]*ar2[i];
			  }
			  break;
		}
	}
	return resultingArray;
}

/**
<b>name:</b> mergeArraysRep <br>
*this method returns an array of Strings merging the 3 given integer arrays.<br>
*@param: ar1 must be an array of integers, not null.<br>
*@param: ar2 must be an array of integers, not null.<br>
*@param: ar2 must be an array of integers, not null.<br>
*@return: returns an array of Strings which contain the result of merging the 3 given integer arrays, its length is that of the shortest array.<br>
*/

public static String[] mergeArraysRep(int[] ar1,int[] ar2,int[] ar3)
{
	int length=0; String[] resultingArray;
	if (ar1.length<=ar2.length&&ar1.length<=ar3.length){length = ar1.length;}
	if (ar2.length<=ar3.length&&ar2.length<=ar1.length){length = ar2.length;}
	if (ar3.length<=ar1.length&&ar3.length<=ar2.length){length = ar3.length;}
	resultingArray = new String [length];
	for(int i=0; i<resultingArray.length; i++)
	{
		resultingArray[i]=""+ar1[i] +", "+ar1[2] +", "+ar1[3];
	}
	return resultingArray;
}

/**
<b>name:</b> mergeArraysNoRep <br>
*this method returns an array of Strings by merging the 3 given integer arrays, does not allow repetition.<br>
*@param: ar1 must be an array of integers, not null.<br>
*@param: ar2 must be an array of integers, not null.<br>
*@param: ar2 must be an array of integers, not null.<br>
*@return: returns an array of Strings which contain the result of merging the 3 given integer arrays, its length is that of the shortest array.<br>
*/

public static String[] mergeArraysNoRep(int[] ar1,int[] ar2,int[] ar3)
{
	String[] resultingArray;
	if (ar1.length<=ar2.length&&ar1.length<=ar3.length){resultingArray = new String[ar1.length];}
	if (ar2.length<=ar3.length&&ar2.length<=ar1.length){resultingArray = new String[ar2.length];}
	if (ar3.length<=ar1.length&&ar3.length<=ar2.length){resultingArray = new String[ar3.length];}
	for(int i=0; i<resultingArray.length; i++)
	{
		if(ar1[i]!=ar2[i]&&ar1[i]!=ar3[i]&&ar2[i]!=ar3[i])
		{resultingArray[i]=""+ar1[i] +", "+ar1[2] +", "+ar1[3];}
		if(ar1[i]!=ar2[i]&&ar1[i]==ar3[i])
		{resultingArray[i]=""+ar1[i] +", "+ar1[2];}
		if(ar1[i]==ar2[i]&&ar1[i]!=ar3[i])
		{resultingArray[i]=""+ar1[i] +", "+ar1[3];}
		if(ar1[i]!=ar2[i]&&ar1[i]!=ar3[i]&&ar2[i]==ar3[i])
		{resultingArray[i]=""+ar1[i] +", "+ar1[2];}
		if(ar1[i]==ar2[i]&&ar1[i]==ar3[i])
		{resultingArray[i]=""+ar1[i];}
	}
	return resultingArray;
}
/**
<b>name:</b> interceptArrays <br>
*this method returns an array of integers by intercepting the 3 given integer arrays.<br>
*@param: ar1 must be an array of integers, not null.<br>
*@param: ar2 must be an array of integers, not null.<br>
*@param: ar2 must be an array of integers, not null.<br>
*@return: returns an array of integers which contain the result of intercepting the 3 given integer arrays, its length is that of the amount of repeated elements.<br>
*/
public static int[] interceptArrays(int[] ar1,int[] ar2,int[] ar3)
{
	int[]resultingArray;
	if (ar1.length>=ar2.length&&ar1.length>=ar3.length){resultingArray = new int[ar1.length];}
	if (ar2.length>=ar3.length&&ar2.length>=ar1.length){resultingArray = new int[ar2.length];}
	if (ar3.length>=ar1.length&&ar3.length>=ar2.length){resultingArray = new int[ar3.length];}
	int i=0; boolean exists1=false; boolean exists2=false; boolean quit=false; boolean alreadyThere=false;
	for(; i<resultingArray.length; i++)
	{
		for(int j=0; (j<ar1.length)&&!quit; j++)
		{
		exists1=existsInArray(ar1[j], ar2);
		exists2=existsInArray(ar1[j], ar3);
		if(exists1&&exists2)
		{for(int k=0; k<resultingArray.length; k++)
		{
			if (resultingArray[k]==ar1[j])
				{alreadyThere=true;}
		}
		if(!alreadyThere){resultingArray[i]=ar1[j]; quit=true;}
		}}
	}
	int[] hold= new int [i+1];
	for( int j= 0; j<=i; j++)
	{hold[j]=resultingArray[j];}
	return hold;
}
/**
<b>name:</b> existsInArray <br>
*this method determines wether or not a number exists in an array.<br>
*@param: num must be an integer.<br>
*@param: ar must be an array of integers, not null.<br>
*@return: returns true if the number exists in the array, false if it does not.<br>
*/
public static boolean existsInArray(int num, int[] ar)
{
	boolean value=false;
	for(int i2=0; i2<ar.length&&!value; i2++)
		{
			if(num==ar[i2])
				{value=true;}
		}
	return value;
}
/**
<b>name:</b> shiftArray <br>
*shifts the elements of the given array a given amount of times.<br>
*@param: array must be an array of integers, not null.<br>
*@param: shifts must be an positive integer. <br>
*@return: returns an array of integers resulting from rearranging the elements of the given array from least to gratest.<br>
*/
public static int[] shiftArray(int[] array, int shifts)
{
	int[] resultingArray = new int [array.length];
	int i=0; int midpoint=0;
	for(;i+shifts-1<array.length;i++)
		{resultingArray[i]=array[i+shifts-1];}
	midpoint=i-1;
	for(int j=0;j<midpoint;j++)
		{resultingArray[i]=array[j];i++;}
	return resultingArray;
}
/**
<b>name:</b> rearrangeArray <br>
*rearranges the elements of the given array from least to gratest.<br>
*@param: array must be an array of integers, not null.<br>
*@return: returns an array of integers resulting from rearranging the elements of the given array from least to gratest.<br>
*/
public static int[] rearrangeArray(int[] array)
{
	int i=0; int j=0; int aux =0;
	for(i=0; i<array.length-1;i++)
	{
		for(j=0; j<array.length-i-1;j++)
		{
			if(array[j+1]<array[j])
			{aux=array[j+1];
			array[j+1]=array[j];
			array[j]=aux;
			}
		}
	}
	return array;
}
public static void cls()
{
	try
	{new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}
	catch(Exception E)
	{System.out.println(E);}	
}


}