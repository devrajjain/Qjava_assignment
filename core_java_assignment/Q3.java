public class Q3 {
    public static void main(String args[]) throws InterruptedException{
        FetchData fd = new FetchData();
        Thread pd = new Thread(new ProcessData(), "Thread-1");
        fd.setPriority(10); 
        fd.start();
        fd.join();
        pd.start();
        pd.join();
        
    }
}

class FetchData extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("FetchData thread: " + Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ProcessData implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(10000);
            System.out.println("ProcessData thread: "+ Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
