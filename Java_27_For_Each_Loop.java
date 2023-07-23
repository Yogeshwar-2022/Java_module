/*
for (int element:Arr) {
    System.out.println(element);    // Prints all the elements
}
*/

public class Java_27_For_Each_Loop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i : arr) {
            System.out.println(i);
        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

