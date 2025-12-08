//Matthew Dempsey wrote this
//This prgram is for assignment 4.4a
public class card {
int value;    
String suits;
public card (int value, String suits){
    this.value=value;
    this.suits=suits;
    }
public String toString()
{
    String printValue;
    printValue=Integer.toString(value);
if (value==11){
    printValue="Jack";
}
if (value==12){
    printValue="Queen";
}
if (value==13){
    printValue="King";
}
if (value==14){
    printValue="Ace";
}
return printValue+" of "+ suits;
}
public int getValue(){
    return value;
}    
}    