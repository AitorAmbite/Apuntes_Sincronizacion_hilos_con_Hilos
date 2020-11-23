public class CustomThreadEmite extends Thread{
    Emit emit = new Emit();
    @Override
    public void run() {

        try {
            sleep(5000);
            System.out.println("voy a emitir");
            emit.emite();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void prueba1(CustomThreadEscucha custom){
        emit.recibe(custom);
    }
}
