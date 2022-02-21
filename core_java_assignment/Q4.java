public class Q4{  
    public static void main(String args[]){  
        Message obj = new Message(); 
        Writer t1 = new Writer(obj);  
        Reader t2 = new Reader(obj);  
        t1.start();  
        t2.start();  
    }  
}  

class Message{
    private String text;  
    synchronized void writeData(String str){ 
        if(!(str.equals("")))
            this.text = str;
        else {
            System.out.println("Invalid Text");
        }
    }
    
    synchronized void readData(){
        System.out.println(text);
    }
}  


  
class Writer extends Thread{  
    Message t;  
    
    Writer(Message t){  
        this.t = t;  
    }  
    
    @Override
    public void run(){  
        t.writeData("Devraj Jain");  
    }  
  
}  
class Reader extends Thread{  
    Message t;  
    
    Reader(Message t){  
        this.t = t;  
    }
    
    @Override
    public void run(){  
        t.readData();  
    }  
}  
