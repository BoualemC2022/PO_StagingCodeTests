public class WalkingOnAxis {
    public static void main(String[]args) {
        int N=1;
        int distance=0;
        //first interation to add the distance from the left
      for (int i=0;i<N+1;i++){
               //distance+=A-B;
               // second to add the distance from the right
          for (int j=N+1;j>0;j--)
          {if  ( i-j>0 ){   distance+=i-j;  }


      }




        }
    }


}
