import java.util.Random;

public class Main {

    private static double testQueue(Queue<Integer> q,int opCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(i);
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//
//        for (int i = 0; i < 10; i++) {
//            arrayQueue.enqueue(i);
//            System.out.println(arrayQueue);
//
//            if (i % 3 == 2) {
//                arrayQueue.dequeue();
//                System.out.println(arrayQueue);
//            }
//        }

//        LoopQueue<Integer> loopQueue = new LoopQueue<>();
//
//        for (int i = 0; i < 11; i++) {
//            loopQueue.enqueue(i);
//            System.out.println(loopQueue);
//
//            if (i % 3 > 0) {
//                loopQueue.dequeue();
//                System.out.println(loopQueue);
//            }
//        }


        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue,opCount);
        System.out.println("ArrayQueue time：" + time1 + " s");


        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue,opCount);
        System.out.println("LoopQueue time：" + time2 + " s");

    }
}
