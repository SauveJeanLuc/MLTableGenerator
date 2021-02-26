package learning.threadpool;

import java.time.LocalDateTime;

public class Job implements Runnable{

    public String name;

    public Job(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try{
            System.out.println("Entered thread"+getName()+"now: "+ LocalDateTime.now().toString());
            Thread.sleep(100);
            for(int i=0; i<5; i++){
                System.out.println("Executing task: " +i +"From "+ getName()+"now:"+ LocalDateTime.now().toString());
                Thread.sleep(200);
            }
            System.out.println("Completed Thread:"+getName()+"now:"+ LocalDateTime.now().toString());
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
