package thread_demo;

public class TH01 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        for (int i = 0; i <10 ; i++) {
            System.out.println(t.getName() + i + "-" + t.getThreadGroup() +"-"+ t.getPriority());

        }

    }
}
