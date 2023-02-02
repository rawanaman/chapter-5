
package ch5;
import java.util.Random;
public class Chapter {
    public static void main(String[] args){
    Random rand=new Random();
    int i=1,randnum,even=0,odd=0;
    while(i<=100){
        randnum=rand.nextInt(100)+1;
        if(isEVEN(randnum)){
            even+=1;
        }
        else{
          odd+=1;
        }
        i++;
    }
    System.out.println("the number of even number is: "+even);
    System.out.println("the number of odd number is: "+odd);
}
    public static boolean isEVEN(int num){
     if(num%2==0) {
         return true;
     } 
     else{
         return false;
     }
    }
}
