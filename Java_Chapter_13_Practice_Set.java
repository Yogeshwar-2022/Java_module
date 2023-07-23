class GoodMorning extends Thread {
    @Override
    public void run() {
        System.out.println("Good Morning");
    }
}

class Welcome extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}

public class Java_Chapter_13_Practice_Set {
    public static void main(String[] args) {

        GoodMorning obj1 = new GoodMorning();
        obj1.setPriority(Thread.MAX_PRIORITY);

        Welcome obj2 = new Welcome();

        obj1.start();
        obj2.start();
        System.out.println("Status of Thread obj2 (class Welcome) is " + obj2.getState());
        System.out.println("The Priority of thread obj1 (class GoodMorning) is " + obj1.getPriority());
        System.out.println("The reference of the current Thread " + Thread.currentThread());
    }
}

/*
Question 4: How do you get the state of a given thread in Java?
Answer 4: getState() method is used to get the state of a given thread in Java.

Question 5: How do you get the reference to the current thread in Java?
Answer 5: currentThread() method is used to reference the current thread in Java.
 */