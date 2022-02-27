package class5;

/**
 * Created by michael.garcia on 24/02/2022
 */
public class ThreadReloj implements Runnable {
    //un thread es un proceso o un flujo de ejecución
    private String id;

    ThreadReloj(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                //duerme el sistema un segundo
                Thread.sleep(1000);
                System.out.println("Thread id: " + id + " operation #" + i);
                if (i == 5) {
                    System.out.println("End thread with id: " + id);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class ThreadExcel implements Runnable {
        //un thread es un proceso o un flujo de ejecución
        @Override
        public void run() {
            System.out.println("Open excel");
        }
    }

    static class ThreadWord implements Runnable {
        //un thread es un proceso o un flujo de ejecución
        @Override
        public void run() {
            System.out.println("Open word");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        //Este runnable implementa al reloj
        Thread reloj1 = new Thread(new ThreadReloj("persona1"));
        reloj1.start();
        reloj1.join();

        Thread reloj2 = new Thread(new ThreadReloj("persona2"));
        reloj2.start();

        Thread reloj3 = new Thread(new ThreadReloj("persona3"));
        reloj3.start();

        Thread reloj4 = new Thread(new ThreadReloj("persona4"));
        reloj4.start();

        Thread reloj5 = new Thread(new ThreadReloj("persona5"));
        reloj5.start();

        Thread reloj6 = new Thread(new ThreadReloj("persona6"));
        reloj6.start();

        Thread reloj7 = new Thread(new ThreadReloj("persona7"));
        reloj7.start();

        Thread reloj8 = new Thread(new ThreadReloj("persona8"));
        reloj8.start();

        Thread reloj9 = new Thread(new ThreadReloj("persona9"));
        reloj9.start();

        Thread excel = new Thread(new ThreadExcel());
        excel.start();

        Thread word = new Thread(new ThreadWord());
        word.start();

        System.out.println("This is other stuff!");
    }


}
