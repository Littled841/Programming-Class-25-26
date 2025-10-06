//Matthew Dempsey wrote this
//This program is for 2.3c assignment
public class asignment23c {
    public static void main(String[] args) {
        Horse Horse1;
        Horse Horse2;
        Horse Horse3;
        Horse temp;
        Horse1=new Horse ("Matt",2000);
        Horse2=new Horse ( "Steve",1990);
        Horse3=new Horse ("Alex",2005);
        System.out.println(Horse1);
        System.out.println(Horse2);
        System.out.println(Horse3);
        temp=Horse1;
        Horse1=Horse3;
        Horse3=temp;
        System.out.println(Horse1);
        System.out.println(Horse2);
        System.out.println(Horse3);
     }
}
