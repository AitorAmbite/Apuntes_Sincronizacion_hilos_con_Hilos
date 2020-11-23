import java.util.Random;

public class CustomThreadEscucha extends Thread{

    final CustomThreadEmite emite;

    public CustomThreadEscucha(CustomThreadEmite emite) {
        this.emite = emite;
    }

    @Override
    public void run() {
        Random rand = new Random();
        try {
            sleep(rand.nextInt(9000)+1000);
            emite.prueba1(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
