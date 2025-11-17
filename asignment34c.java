//Matthew Dempsey wrote this
//This is for asignment 3.4
import java.util.ArrayList;
import java.util.Collections;

public class asignment34c {
public static void main(String[] args) {
    int [] array={1,2,3,4,5,6,7};
int age=17;
int badAge=0;
try{
System.out.println(age/badAge);
    
} catch (Exception e) {
    // TODO: handle exception
    System.out.println("We tried to divied by zero");
    System.out.println("The exception is "+e);
}
for (int x=0; x<8; x++){
    try {
        

System.out.println("The value at index "+x+" is "+array[x]);
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Cought the error");
    }
}
System.out.println("program ending");
}}