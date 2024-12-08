import java.util.*;
public class Arrayprefixsum{
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int temp[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            temp[i]=sum;
        }
        System.out.println(Arrays.toString(temp));

    } 
}
