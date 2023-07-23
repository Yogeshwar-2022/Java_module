// data_type[] arr;                       // Declaration!
// arr = new data_type[5];                // Memory allocation!
// data_type[] arr = new data_type[5];    // Declaration + Memory allocation!
// data_type[] arr = {100,70,80,71,98};   // Declare + Initialize!

/*
accessing array members
arr[0] = 100 // indexing starts from 0
arr[1] = 70
.
.
arr[4] = 98
*/

public class Java_26_Arrays {
    public static void main(String[] args) {

        int[] arr = {12,23,34,45,65};

        // using arr_name.length function to find number of elements in an array
        System.out.println(arr.length);

        // using for loop for array traversal
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
