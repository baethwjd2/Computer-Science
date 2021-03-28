public class Time {
    public static long timeIt(Runnable code){
        long start = System.nanoTime();
        code.run();
        return System.nanoTime()-start;
    }
}