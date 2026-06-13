package ThreadConcept;

class Class1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try { Thread.sleep(1000); } catch(Exception e){}
        }
    }
}

class Class2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try { Thread.sleep(1000); } catch(Exception e){}
        }
    }
}

public class RunnableClass
{
    public static void main(String[] args)
    {
        Runnable obj1 = new Class1();
        Runnable obj2 = new Class2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        try { Thread.sleep(10); } catch(Exception e){}
        t2.start();
    }
}
