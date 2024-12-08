import java.util.*;
public class Merge2sortarrays{
    public static void main(String args[]){
        int a[]={3,4,5,6};
        int a1[]={9,10,12};
        int k=0;
        int temp[]=new int[a.length+a1.length];
        for(int i=0;i<a.length;i++){
            temp[k]=a[i];
            k++;
        }for(int i=0;i<a1.length;i++){
            temp[k]=a1[i];
            k++;
        }
        System.out.println(Arrays.toString(temp));

        }


    }


