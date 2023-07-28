
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("please enter the element to Search");
          int ser= sc.nextInt();
           int max=(arr.length-1);
           int i;
           for( i=0;i<arr.length;i++){
               if(arr[i]<arr[max]){
                  max=i;
               }

           }
           System.out.println(max);



    }
    }
