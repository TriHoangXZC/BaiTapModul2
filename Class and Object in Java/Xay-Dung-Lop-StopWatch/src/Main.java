public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long[] array = new long[100000];
        for (int i = 0; i < args.length; i++) {
            array[i] = Math.round(Math.random() * 100000);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    long temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTimer());
    }
}
