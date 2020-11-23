public class Emit {
    public synchronized void emite(){
        notifyAll();
    }
    public synchronized void recibe(CustomThreadEscucha escucha){
        try {
            wait();
            System.out.println(escucha.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
