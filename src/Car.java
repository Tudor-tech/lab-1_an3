public class Car implements MoveBl{

    @Override
    public void Move() {
        System.out.println("Se misca");
    }

    @Override
    public void Stop() {
        System.out.println("Se opreste");
    }

    @Override
    public void Start() {
        System.out.println("Porneste");
    }
}
