public class ABC {

    public static void main(String[] args) {
        System.out.println("test 1 br");
        ABC abc = new ABC();

        System.out.println(abc.toString());

        int i = 0;

        while (i < 1000) {
            try {
                Thread.sleep(1000);
                System.out.println("Slept ... in branch  " + "[" + i++ + "]");
                doSomething();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void doSomething() {
        System.out.println("Doing additional work ...");
    }


}