/*
Syntax : setPriority()
<Thread_name>.setPriority(Thread.<MIN/NORM/MAX>_PRIORITY);
<Thread_name>.setPriority(0<int<10);

Syntax : getPriority()
<Thread_Name>.getPriority;
*/

class NewThr1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running MyThr1");
        }
    }
}

class NewThr2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running MyThr2");
        }
    }
}

class NewThr3 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running MyThr3");
        }
    }
}

class CusThr extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running CusThr");
        }
    }
}

public class Java_74_Thread_Priorities {
    public static void main(String[] args) {

        NewThr1 T1 = new NewThr1(); // Thread of maximum priority
        T1.setPriority(Thread.MAX_PRIORITY);

        NewThr2 T2 = new NewThr2(); // Thread of normal priority
        T1.setPriority(Thread.NORM_PRIORITY); // Default Priority

        NewThr3 T3 = new NewThr3(); // Thread of minimum priority
        T3.setPriority(Thread.MIN_PRIORITY);

        CusThr T4 = new CusThr();
        T4.setPriority(7); // Takes any int argument between (1 to 10)

        T1.start();
        T2.start();
        T3.start();
        T4.start();

        System.out.println("Priority of Thread T1 is " + T1.getPriority());
        System.out.println("Priority of Thread T2 is " + T2.getPriority());
        System.out.println("Priority of Thread T3 is " + T3.getPriority());
        System.out.println("Priority of Thread T4 is " + T4.getPriority());
    }
}
