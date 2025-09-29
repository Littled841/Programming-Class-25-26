//Matthew Dempsey wrote this
//This program is for 2.2c assignment

public class assignment22c {
    public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

            int temp;
            temp=arrayToSwap[lowerIndex];
            arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
            arrayToSwap[lowerIndex+1]=temp;
            return arrayToSwap;
}
    public static void main(String[] args) {
        int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
    System.out.println("unsorted aray");
     for(int x=0; x<arrayToSort.length; x++){
        System.out.print(arrayToSort[x] +", ");
           
        

        }
    for(int x=0; x<arrayToSort.length-1; x++){
         for(int y=0; y<arrayToSort.length-1-x; y++){
             if (arrayToSort[y]>arrayToSort[y+1]) {
                arrayToSort=swapTwoArrayElements (arrayToSort,y);            
            }
        }
    }
   System.out.println();     
     System.out.println("sorted aray");
     for(int x=0; x<arrayToSort.length; x++){
        System.out.print(arrayToSort[x] +", ");

        }       
}
}