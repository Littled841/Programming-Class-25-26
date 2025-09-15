//Matthew Dempsey wrote this
//This program is for 1.4c assignment

public class assignment14c {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while (i<=100){
            System.out.print(i +" ");
            sum=sum+i;
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
