import java.util.Thread;

class ClassA extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Task 1");
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println("Error: ", e);
            }
        }
    }
}
class ClassB extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Task 2");
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println("Error: ", e);
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        ClassA task1 = new ClassA();
        ClassB task2 = new ClassB();

        task1.run();
        task2.run();
    }
}
