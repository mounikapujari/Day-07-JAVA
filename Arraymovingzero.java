import java.util.*;
public class  movingzero{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        int p=0;
        for(int i=0;i<n;i++)
        {
         arr[i]=s.nextInt();
         if(arr[i]!=0){
            temp[p]=arr[i];
            p++;
         }
        }
         System.arraycopy(temp,0,arr,0,n);
         System.out.println(Arrays.toString(arr));
        }
    }
