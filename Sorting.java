
import java.util.Arrays;
 public class Sorting{

public static void main(String args[])
{
 int arr []={22,20,2,12,3,34,30,0,9,8,6,1}; 
 int lenght=arr.length;
 for(int i=0;i<lenght-1;i++){ 
               if (arr[i]> arr[i+1]){
                                           int tmp=arr[i];
                                           arr[i]=arr[i+1];
                                           arr[i+1]=tmp;
                                            //need to reset the index
                                            i=-1;
               }
 }
 int min =arr[0];
 int max=arr[0];
for (int i=0;i<arr.length;i++) {  if(arr[i]<min) {  min=arr[i];}
if (arr[i]< max){max=arr[i]; }

}
int Gap=max-min;

System.out.println("Sorted Array"+ Arrays.toString(arr)+"gap"+Gap);

}
}
