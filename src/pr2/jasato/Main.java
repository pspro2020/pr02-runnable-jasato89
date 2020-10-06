package pr2.jasato;

public class Main {

    public static void main(String[] args) {

        for (double i = 1; i<=10; i++) {

            Thread newThread = new Thread(new Pow(i));

            if(i % 2 == 0) {
                newThread.setPriority(Thread.MAX_PRIORITY);
            } else {
                newThread.setPriority(Thread.MIN_PRIORITY);
            }

            newThread.start();

            }
        }
}
