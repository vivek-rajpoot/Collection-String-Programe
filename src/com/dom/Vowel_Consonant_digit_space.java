package com.dom;
public class Vowel_Consonant_digit_space {
	public static void main(String[] args) {  
        //Counter variable to store the count of vowels and consonant  
        int vCount = 0, cCount = 0,dCount=0;  
        //Declare a string  
        String str = "This is a really simple sentence123";  
        //Converting entire string to lower case to reduce the comparisons  
        str = str.toLowerCase();  
          char [] cha=str.toCharArray();
        for (char ch : cha) {
            //Checks whether a character is a vowel  
            if(ch == 'a' || ch== 'e' || ch== 'i' ||ch == 'o' || ch == 'u') {  
                //Increments the vowel counter  
                vCount++;  
            }  
            //Checks whether a character is a consonant  
            else if(ch >= 'a' && ch<='z') {    
                //Increments the consonant counter  
                cCount++;  
            } 
            else if(ch>0||ch<9) {
            	dCount++;
            }
        }  
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);
        System.out.println("Number of consonants: " + dCount);
    }  

}
