public class sum2Array {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int c = 0;
        int i = arr1.length-1, j = arr2.length-1, k = output.length-1;
        while(k >= 0) {
            int digit = c;
            if(i >= 0) {
                digit += arr1[i];
            }
            if(j >= 0) {
                digit += arr2[j];
            }
            c = digit / 10;
            digit = digit % 10;
            output[k] = digit;
            i--;
            j--;
            k--;
        }
        if(c != 0) {
            System.out.println(c);
        }
    }

}