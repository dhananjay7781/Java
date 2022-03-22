class mythread implements Runnable {
    public void run(){
        System.out.println("Run method");
    }
}
class Runnablethread {
     public static void main(String[] args) {
        mythread mt = new mythread();
        Thread t  = new Thread(mt);
        t.start();
    }
}
