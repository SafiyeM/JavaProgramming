package java_programming_lessons.day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {  // because it's overridden method, we can not use throws in method signature to handle with checked exception
        for (int i= 1; i < 6; i++){
            System.out.println("Hello World " +i + " from Thread " + threadNumber);
            try {
                Thread.sleep(500);      // this is for in order to visualise threading in TestMultiThreads class,
                                             // we give a 0,5 seconds wait time in each printing
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
