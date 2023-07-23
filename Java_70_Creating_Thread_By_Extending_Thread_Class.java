/*
Syntax : Creating Thread by extending Thread Class
class <class_name> extends Thread{
    @Override
    public void <method_name>(){
        ||Code
    }
}
*/

class MyThread1 extends Thread{
    @Override
    public void run (){
        for (int j=0;j<4;j++){
            System.out.println("MyThread1 is running");
            System.out.println("....................");
        }
    }
}

class MyThread2 extends Thread{
    public void run () {
        for (int i=0;i<4;i++){
            System.out.println("MyThread2 is running");
            System.out.println("....................");
        }
    }
}
public class Java_70_Creating_Thread_By_Extending_Thread_Class {
    public static void main(String[] args) {
        MyThread1 T1 = new MyThread1();
        MyThread2 T2 = new MyThread2();
        T1.start();
        T2.start();
    }
}
