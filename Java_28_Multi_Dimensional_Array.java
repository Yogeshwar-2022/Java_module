public class Java_28_Multi_Dimensional_Array {
    public static void main(String[] args) {

        int [][] mat = new int[2][3]; // A 2-D array of 2 rows + 3 columns
        mat[0][0] = 100; // accessing elements in 2D array
        mat[0][1] = 101;
        mat[0][2] = 102;
        mat[1][0] = 201;
        mat[1][1] = 202;
        mat[1][2] = 203;

        String[][][] arr = new String [2][3][4]; // A 3-D array

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<mat.length;i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
