public class LoopDetection {
    //returns the index of the first element in the array that is equal to the target
    public static int findFirst(int[] array, int target) {
        int i = 0;
        while (i < array.length && array[i] != target) {
            i++;
        }
        return i;
    }
}

