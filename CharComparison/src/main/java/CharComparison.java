public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){

        for(int i = 0; i < a.length; i++){
            if(i - a.length == 0 || i - b.length == 0){
                break;
            }
            if(a[i] < b[i]){
                return -1;
            }
            else if(a[i] > b[i]){
                return 1;
            }
        }
        if(a.length == b.length){
            return 0;
        }
        else if (a.length > b.length){
            return 1;
        }
        else{
            return -1;
        }
    }
}
/*
 * test cases didnt check but I think this would fail for when the second word is long and the first
 * part is all the same (ie, dog and dogma)
 * also if first word is long, will throw array index out of bounds 
 * fixed to check for length of array
 */