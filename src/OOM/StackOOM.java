package OOM;

/**
 * Jvm Args: -Xss2m
 * 很容易造成系统假死,请先做好保存再运行☺
 * Created by fqc on 6/4/16.
 */
public class StackOOM {

    private void dontStop() {
        while (true) {
        }
    }

    private void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }

    }

    public static void main(String[] args) throws Throwable {
        StackOOM stackOOM = new StackOOM();
        stackOOM.stackLeakByThread();

    }

}
