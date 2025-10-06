
public class Horse {

    String name;
    int birthYear;
String [] names=new String[2];
int numberOfNames=0;

public Horse(String horseName, int year){
name=horseName;
birthYear=year;
}
public String toString(){

return name;

}

public void changeName(String newName){
names[numberOfNames]=name;
    name=newName;
numberOfNames++;
}




}