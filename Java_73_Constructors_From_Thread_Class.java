/*
Commonly used Constructors of Thread class :
Thread() --> as seen in creating Thread by extending Thread class
Thread(String name)
Thread(Runnable r) --> as seen in creating Thread by implementing Runnable interface
Thread(Runnable r,String name)

used as
*/

class MyThr extends Thread {
    public MyThr (String name){
        super(name);
    }
    public void run (){
        for (int i=0;i<10;i++){
            System.out.println("I am Thread1");
        }
    }
}

class MyThrRun implements Runnable {
    public void run (){
        for (int i=0;i<10;i++) {
            System.out.println("I am Thread2");
        }
    }
}

public class Java_73_Constructors_From_Thread_Class {
    public static void main(String[] args) {
        // Thread(String name)
        MyThr T1 = new MyThr("ThreadName1");

        T1.start();
        System.out.println("The id of Thread T1 is " + T1.getId());
        System.out.println("The name of Thread T1 is " + T1.getName());

        MyThrRun T2 = new MyThrRun();

        // Using Thread(Runnable r,String name)
        Thread G2 = new Thread(T2,"ThreadName2");

        G2.start();
        System.out.println("The id of Thread G2 is " + G2.getId());
        System.out.println("The name of Thread G2 is " + G2.getName());

        // Thread Groups

        ThreadGroup Tg = new ThreadGroup("Tg");
        MyThr u1 = new MyThr("Tg:MyThr");
        MyThrRun u2 = new MyThrRun();
        Thread v2 = new Thread(u2,"Tg:MyThrRun");

        System.out.println("Threads u1 and v2 belong to Thread Group named " + Tg.getName());
    }
}
