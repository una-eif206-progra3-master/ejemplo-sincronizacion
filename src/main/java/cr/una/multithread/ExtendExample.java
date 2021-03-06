package cr.una.multithread;

public class ExtendExample extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    public ExtendExample(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        PD.printCount();
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

}
