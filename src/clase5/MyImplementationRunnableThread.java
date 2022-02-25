package clase5;

/**
 * Created by michael.garcia on 24/02/2022
 */
public class MyImplementationRunnableThread implements Runnable {
    //un thread es un proceso o un flujo de ejecución
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                //duerme el sistema un segundo
                Thread.sleep(1000);
                System.out.println("Reloj - seconds: " + i);
                if (i == 5) {
                    System.out.println("End thread");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyThreadExcel implements Runnable {
        //un thread es un proceso o un flujo de ejecución
        @Override
        public void run() {
            System.out.println("Open excel");
        }
    }

    static class MyThreadWord implements Runnable {
        //un thread es un proceso o un flujo de ejecución
        @Override
        public void run() {
            System.out.println("Open word");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        //Este runnable implementa al reloj
        Thread reloj = new Thread(new MyImplementationRunnableThread());
        reloj.start();
//        Thread reloj2 = new Thread(new MyImplementationRunnableThread());
//        reloj2.start();
//
//        Thread reloj3 = new Thread(new MyImplementationRunnableThread());
//        reloj3.start();
//
//        Thread excel = new Thread(new MyThreadExcel());
//        excel.start();

        Thread word = new Thread(new MyThreadWord());
        word.start();

    }


}
