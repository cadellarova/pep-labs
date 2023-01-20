
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        
        int concat[] = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){
            concat[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            concat[arr1.length + i] = arr2[i];
        }

        return concat;
    }
}
