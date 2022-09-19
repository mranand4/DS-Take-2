import practice.Sandbox;

public class Main {

    public static void main(String args[]) {

        long start = System.nanoTime();
        Sandbox sb = new Sandbox();
        System.out.println("RUNNING ...");
       System.out.println("RECURSIVE ANS: " + sb.sum(50000) + "\nTIME: " + (System.nanoTime() - start));
        start = System.nanoTime();
//        System.out.println("LOOP ANS: " + sb.sumLoop(50000) + "\nTIME: " + (System.nanoTime() - start));

    }


}

