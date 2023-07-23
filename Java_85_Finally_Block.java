public class Java_85_Finally_Block {
    public static int execute(int a ,int b){
        try {
            return a/b;
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }finally {
            System.out.println("This is a statement in finally block");
        }return -1;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int k = execute(a,b);

        int c = 7;
        int d = 9;
        while (true){
            try {
                System.out.println("Division : " + c/d);
            }catch (Exception e){
                System.out.println("Exception : "+e);
                break;
            }finally {
                System.out.println("Value of d = "+d);
            }d--;
        }
    }
}
