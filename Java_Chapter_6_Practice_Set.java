public class Java_Chapter_6_Practice_Set {
    public static void main(String[] args) {

        float[] arr = {1f,2f,3f,4f,5f};
        float sum = 0;
        for (int i = 0 ; i < arr.length ; i++ ){
            sum += arr[i];
        }
        System.out.println(sum);

        int [] arr_ = {1,2,3,4,5};
        int find = 6;
        boolean found = false;
        for (int i = 0 ; i < arr.length ; i++ ){
            if (arr_[i] == find){
                System.out.println("Is present at index " + i + " in array arr_");
                found = true;
                break;
            }
        }
        if (found == false){
            System.out.println("Is not present in the array arr_");
        }

        float[] arr__ = {1f,2f,3f,4f,5f};
        float sum_ = 0;
        for (float i : arr__) {
            sum_ += i;
        }
        System.out.println(sum_);

        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};
        int[][] res  = {{0, 0, 0},
                        {0, 0, 0}};
        for (int i = 0 ; i < res.length ; i++){
            for (int j = 0 ; j < res[i].length ; j++ ){
                res[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        int [] arr_____ = {1,2,3,4,5};
        int l = arr_____.length;
        int n = arr_____.length/2;
        int temp;
        for(int i = 0 ; i <= n ; i++){
            temp = arr_____[i];
            arr_____[i] = arr_____[l-i-1];
            arr_____[l-i-1] = temp;
        }
        for (int i : arr_____) {
            System.out.print(i + " ");
        }

        int [] arr___ = {1,2,3,7,4,5};
        int max = 0 ;
        for (int i:arr___) {
            if (i>max){
                max = i ;
            }
        }
        System.out.println("\n"+max);

        int [] arr____ = {1,2,3,4,5};
        boolean sort = true;
        for (int i = 0 ; i < (arr____.length - 1) ; i++){
            if (arr____[i] > arr____[i+1]){
                sort = false;
            }
        }
        if (sort == true){
            System.out.println("array arr____ is sorted");
        }else if (sort == false){
            System.out.println("array arr____ is not sorted");
        }


    }
}
