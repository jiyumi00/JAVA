public class MyThread extends Thread {
    private int a;

    public MyThread(int a) {
        this.a=a;
    }
    public void run() {
        for(int i=this.a-9;i<=this.a;i++)
            System.out.println("threa value is threa value is threa value is threa value is threa value is threa value is="+i);
    }
}