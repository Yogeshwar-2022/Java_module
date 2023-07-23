class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<15;i++) {
            System.out.println("I am a ThreadRunnable1");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<15;i++) {
            System.out.println("I am a ThreadRunnable2");
        }
    }
}


public class Java_71_Creating_Thread_Using_Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 Bullet1 = new MyThreadRunnable1();
        Thread Gun1 = new Thread(Bullet1);
        MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
        Thread Gun2 = new Thread(Bullet2);
        Gun1.start(); //shoot
        Gun2.start();
    }
}
