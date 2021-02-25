package learning.synchronization;

public class SecondMultiplicator extends Thread{
    private Long number;
    private Multiplication mult;
    public SecondMultiplicator(Long number, Multiplication mult){
        this.number = number;
        this.mult=mult;
    }
    public void run() {
        try {
            mult.multiply(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}