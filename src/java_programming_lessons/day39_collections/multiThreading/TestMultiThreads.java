package java_programming_lessons.day39_collections.multiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {


        //Thread:
        //• A subset of a process
        //• A sequence of execution within a process
        //• Every single process at least have one thread
        //• Shares all the resources of process

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);

        // we use start() method, if we want the threads get executed at the same time concretely
        // when we use the start method, the run() method gets executed at the same time for each thread
        thread1.start();
        thread2.start();

        // we have two threads, and they print "Hello World " five times at the SAME EXACT TIME (simultaneously)
        /*
Hello World 1 from Thread 2
Hello World 1 from Thread 1
Hello World 2 from Thread 2
Hello World 2 from Thread 1
Hello World 3 from Thread 2
Hello World 3 from Thread 1
Hello World 4 from Thread 2
Hello World 4 from Thread 1
Hello World 5 from Thread 2
Hello World 5 from Thread 1
         */

    }
}
