/*
1.We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

2.Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
*/

public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree){
        boolean teen = false;
        
        if(ageOne >= 13 && ageOne <= 19){
            teen = true;
        } else if(ageTwo >= 13 && ageTwo <= 19){
            teen = true;
        } else if(ageThree >= 13 && ageThree <= 19){
            teen = true;
        }
        return teen;
    }
    
    public static boolean isTeen(int age){
        boolean teen = false;
        
        if(age >= 13 && age <= 19){
            teen = true;
        }
        return teen;
    }
 
}
