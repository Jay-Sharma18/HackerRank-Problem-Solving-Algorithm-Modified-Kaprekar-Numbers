package JavaAlgorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        ArrayList<Integer> kaprekarNumbers=new ArrayList<Integer>();
        //count number of modified kaprekar Numbers
        int count=0;
        for(Integer i=p;i<=q;i++)
        {   
            //Long variable to hold numbers in the range
            Long number1=new Long(i);
            //Long variable to hold the same number 
            Long number2=new Long(i);
            //Long variable to store the square of numbers
            Long square =(number1*number2);
            //convert square into string
            String number=square.toString();
            //logic to check if number is modified kaprekar number or not 
            if(i==1)
            {
                kaprekarNumbers.add(i);
                count++;
                continue;
            }
            else if(number.length()==1) continue;
            //check if square has even length. divide and sum half lengths
            else if(number.length()%2==0)
            {
                if(Integer.parseInt(number.trim().substring(0,number.length()/2))+
                Integer.parseInt(number.trim().substring(number.length()/2))==i)
                {
                    kaprekarNumbers.add(i);
                    count++;
                }
            }
            //add square numbers with odd length. make sure right side length is 
            //equal to length of number
            else 
            {     
                if(Integer.parseInt(number.trim().substring(0,number.length()/2))+
                Integer.parseInt(number.trim().substring(number.length()/2))==i)
                {
                    kaprekarNumbers.add(i);
                    count++;
                }
                
            }
            
    
        }
        
        //if count is 0, there are no modified kaprekar numbers in the range

        if(count==0)
        {
            System.out.println("INVALID RANGE");
        }
        //else, output the numbers
        else
        {
            for(Integer b:kaprekarNumbers)
            {
                System.out.print(b+" ");
            }
        }

          
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}


