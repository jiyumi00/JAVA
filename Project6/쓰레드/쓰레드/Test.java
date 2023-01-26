public class Test {
    public static void main(String[] args) throws Exception {

        int sum=0;

        MyThread myThread = new MyThread(10);       
        MyThread myThread2 = new MyThread(20);
        MyThread myThread3 = new MyThread(30);


        myThread.start();
        myThread2.start();
        myThread3.start();

        for(int i=31;i<=50;i++)
            System.out.println("threa value is threa value is threa value is threa value is threa value is threa value is="+i);

        

    }
}