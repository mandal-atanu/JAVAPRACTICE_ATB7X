package thread_demo;

public class TH03 {
    public static void main(String[] args) {
        Runnable w1 = new workerth04();
        Thread t1 = new Thread(w1);
        t1.start();
    }


}

class workerth04 implements Runnable{


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
