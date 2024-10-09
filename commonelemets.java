import java.util.ArrayList;
import java.util.Scanner;

public class commonelemets {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n1=in.nextInt();
        int [] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=in.nextInt();
        }
        int n2=in.nextInt();
        int [] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=in.nextInt();
        }
        ArrayList<Integer> s1=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]  && !s1.contains(arr1[i])){
                    s1.add(arr1[i]);
                }
            }
        }
       for(int ele:s1){
          System.out.print(ele+" ");
      }


    }
    
}
