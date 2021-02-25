package learning.synchronization;

public class Main {

    public static void  main (String args[]) throws InterruptedException {
            Multiplication my_var = new Multiplication();
            FirstMultiplicator thread1 = new FirstMultiplicator(10L, my_var);
            SecondMultiplicator thread2 = new SecondMultiplicator(4L, my_var);
            thread1.start();
            thread2.start();
    }
}
