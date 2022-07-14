public class Intersection {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        //find where they meet in the middlem

        
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.println("Intersection: " + a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
}   
}
