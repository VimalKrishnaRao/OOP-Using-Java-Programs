class Table
{
    synchronized static void printTable (int n)
    {
            for (int i=1; i<=5; i++)
            {
                {
                    System.out.println (n*i);
                }
                try
                {
                    Thread.sleep (400);
                }
                catch (Exception e)
                {
                    System.out.println (e);
                }
            }
        
    }
}
class MyThread1 extends Thread
{
    public void run()
    {
        Table.printTable(5);
    }
}
class MyThread2 extends Thread
{
    public void run ()
    {
        Table.printTable(100);
    }
}
class Main
{
    public static void main (String args[])
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
