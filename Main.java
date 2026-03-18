public class Main {
    public static void main(String[] args) {

        // 1. Об'єкт через стандартний конструктор
        Car car1 = new Car();

        // 2. Об'єкт через параметризований конструктор
        Car car2 = new Car("Toyota", "Camry", 2018, 45000);

        // 3. Об'єкт через копіювальний конструктор
        Car car3 = new Car(car2);

        // Вивід інформації
        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());

        // Виклик "деструктора"
        car1 = null;
        car2 = null;
        car3 = null;

        System.gc(); // просимо Java очистити пам'ять
    }
}