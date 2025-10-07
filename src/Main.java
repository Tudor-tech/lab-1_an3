public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello world ");

        Animal animal = new Dog();
        animal.sound();

        Animal cat = new Cat();
        cat.sound();

        Car car = new Car();
        car.Start();
        car.Move();
        car.Stop();
    }
}