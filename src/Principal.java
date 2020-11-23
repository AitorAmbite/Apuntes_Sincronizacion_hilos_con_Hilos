public class Principal {

    public Principal() {
        CustomThreadEmite cemi = new CustomThreadEmite();
        cemi.start();
        for(int i = 0;i<5;i++){
            CustomThreadEscucha cescucha = new CustomThreadEscucha(cemi);
            cescucha.start();
        }
    }
}
