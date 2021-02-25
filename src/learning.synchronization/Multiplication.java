package learning.synchronization;

public class Multiplication {
    synchronized public void multiply(Long number) throws InterruptedException {
        for(int i=1; i<=number; i++){
            System.out.println(i+"*"+number+"="+(i*number));
            Thread.sleep(200);
        }
    }
}