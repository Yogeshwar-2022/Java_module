public class Java_24_break_and_continue {
    public static void main(String[] args) {

        // break
        for(int i=10;i>0;i--){
            if(i==7){
                break;//break the loop and anything after 8 is not printed
            }
            System.out.println(i);
        }
        System.out.println("--x--");
        // continue
        for(int i=7;i>0;i--){
            if(i==3){
                continue;//continue skips the rest of the code and 3 is not printed
            }
            System.out.println(i);
        }

    }
}
