import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Runner {

    public static final Random random = new Random();

    public static void main(String[] args) {

        List<Integer> timeArray = new ArrayList<>();
        List<Integer> timeLinked = new LinkedList<>();

        final int listSize = 1000000;
        final int amount = 10000;

        //Array
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            timeArray.add(getRandomInt());

        }
        long endTime = System.nanoTime();
        long averageArray = endTime - startTime;
        System.out.println("Array with 1000000 random elements " + averageArray);


        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            timeArray.add(amount);

        }
        long end = System.nanoTime();
        long aver = end - start;
        System.out.println("Array adding 1000 elements " + aver);


        long starT = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            timeArray.remove(amount);

        }
        long endT = System.nanoTime();
        long dur = endT - starT;
        System.out.println("Array removing 1000 elements " + dur);

        long star = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            timeArray.get(amount);

        }
        long en = System.nanoTime();
        long duration = en - star;
        System.out.println("Array getting 1000 elements " + duration);

        //Linked
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            timeLinked.add(getRandomInt());

        }
        long endTime2 = System.nanoTime();
        long averageArray2 = endTime2 - startTime2;
        System.out.println("LinkedList with 1000000 random elements " + averageArray2);

        long start2 = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            timeLinked.add(amount);

        }
        long end2 = System.nanoTime();
        long aver2 = end2 - start2;
        System.out.println("LinkedList adding 1000 elements " + aver2);

        long starT2 = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            timeLinked.remove(amount);

        }
        long endT2 = System.nanoTime();
        long dur2 = endT2 - starT2;
        System.out.println("LinkedList removing 1000 elements " + dur2);

        long star2 = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            timeLinked.get(amount);

        }
        long en2 = System.nanoTime();
        long duration2 = en2 - star2;
        System.out.println("LinkedList getting 1000 elements " + duration2);
    }

    public static int getRandomInt() {
        return (int) Math.floor(random.nextInt() * 1000000);
    }
}