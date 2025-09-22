//Matthew Dempsey wrote this
//This program is for 2.1c assignment

public class assignment21c {
    public static void main(String[] args) {
        int[ ] aray=new int [100];
        for(int x=1; x<=aray.length; x++){
            aray [x-1]=x;


        }
        int i=0;
        int sum=0;
        while (i<100){
            System.out.print(aray[i] +" ");
            sum=sum+aray [i];
            if (i%2==0) {
                System.out.println("even");
            }else{
                System.out.println("odd");
            }

         i++;
        }
        System.out.println("the sum is "+sum);
    }
}
