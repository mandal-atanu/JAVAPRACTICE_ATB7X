package thread_demo;

public class TH02 {


    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("workers");

        workerth03 w1 = new workerth03(threadGroup,"w1");
        w1.start();

        workerth03 w2 = new workerth03(threadGroup,"w2");
        w2.start();






        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();

            }

        }

    }

}

class workerth03 extends Thread{

    workerth03(ThreadGroup threadGroup,String name){
        super(threadGroup,name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();

            }

        }


    }
}




