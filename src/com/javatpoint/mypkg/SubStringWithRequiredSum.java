package com.javatpoint.mypkg;

import java.util.HashSet;
import java.util.Set;

public class SubStringWithRequiredSum {
    static Set<String> set=new HashSet<String>();
    public static void main(String[] args) {
           String input="24156";
           int requiredSum=5;
           
           sumCall(input.toCharArray(),requiredSum);
           System.out.println("In the Given String ("+input+") following subString "+set+" have sum="+requiredSum);
           
    }
    
    /**
     * find substring whose sum matches required sum.
     */
    static void sumCall(char array[], int requiredSum){
           
           for(int i=0;i<array.length-1;i++){
                  int sum=0;
                  for(int j=i;j<array.length;j++){
                        sum=sum+Integer.parseInt(String.valueOf(array[j]));
                        
                        if(sum>requiredSum){
                               break;
                        }
                        else if (sum==requiredSum){
                               int Ref=i;
                               char subArray[]=new char[j-i+1];
                               for(int k=0;k<j-i+1;k++){
                                      subArray[k]=array[Ref++];
                               }
                               set.add(new String(subArray));
                               break;
                        }
                        
                  }
           }
    }
 
}
