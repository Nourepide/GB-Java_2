class ThreadArray {
    private final int SIZE = 10000000;
    private final int HALF_SIZE = SIZE / 2;

    private void fill(float[] array) {
        for (int i = 0; i < array.length; i++) array[i] = 1;

    }

    private float[] handling(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        return array;
    }

    private void printTime(long time) {
        System.out.println(System.currentTimeMillis() - time);
    }

    void firstCalculate() {
        float[] array = new float[SIZE];

        fill(array);

        long time = System.currentTimeMillis();

        handling(array);

        printTime(time);
    }

    void secondCalculate() {
        float[] array = new float[SIZE];
        float[] array1 = new float[HALF_SIZE];
        float[] array2 = new float[HALF_SIZE];

        fill(array);

        long time = System.currentTimeMillis();

        System.arraycopy(array, 0, array1, 0, HALF_SIZE);
        System.arraycopy(array, HALF_SIZE, array2, 0, HALF_SIZE);

        Thread thread1 = new Thread(() -> {
            float[] arr = handling(array1);
            System.arraycopy(arr, 0, array1, 0, array1.length);
        });

        Thread thread2 = new Thread(() -> {
            float[] arr = handling(array2);
            System.arraycopy(arr, 0, array2, 0, array2.length);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(array1, 0, array, 0, HALF_SIZE);
        System.arraycopy(array2, 0, array, HALF_SIZE, HALF_SIZE);

        printTime(time);
    }
}