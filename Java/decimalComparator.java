/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
*/

public class DecimalComparator{
 public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
     
     
    if(String.format("%.3d",num1) == String.format("%.3d", num2))
        return true;
    else
        return false;
 }
}
