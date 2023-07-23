/*
Some methods include :
<Thread_name>.join(long millis,long nanos); // Surround with try and catch block
Thread.sleep(long millis,long nanos); // Surround with try and catch block
<Thread_name>.interrupt();
*/

class Thr1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running Thr1");
        }
    }
}

class Thr2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running Thr2");
        }
    }
}

class Thr3 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running Thr3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thr4 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running Thr4");
        }
    }
}

class Thr5 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running Thr5");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thr6 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<25;i++) {
            System.out.println("Running Thr6");
        }
    }
}

public class Java_75_Thread_Methods {
    public static void main(String[] args) {
        Thr1 T1 = new Thr1();
        Thr2 T2 = new Thr2();
        Thr3 T3 = new Thr3();
        Thr4 T4 = new Thr4();
        Thr5 T5 = new Thr5();
        Thr6 T6 = new Thr6();

        T1.start();
        try {
            T1.join(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        T2.start();

        T3.start();
        T4.start();

        T5.start();
        T5.interrupt();

        /* Thread works normally because no exception occurred during the thread's execution ,
        but the interrupt flag will be changed to true. */
        T6.start();
        T6.interrupt();
        System.out.println("The End");
    }
}
