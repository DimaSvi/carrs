public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

        Car car2 = new Car("Toyota", "Camry", 2018, 45000);

        Car car3 = new Car(car2);

        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());

        car1 = null;
        car2 = null;
        car3 = null;

        System.gc();
    }
}
