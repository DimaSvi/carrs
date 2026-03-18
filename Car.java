public class Car {

    private String brand;
    private String model;
    private int year;
    private double mileage;


    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        mileage = 0;
    }


    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Car(Car otherCar) {
        this.brand = otherCar.brand;
        this.model = otherCar.model;
        this.year = otherCar.year;
        this.mileage = otherCar.mileage;
    }

    public String getInfo() {
        return "Марка: " + brand +
                ", Модель: " + model +
                ", Рік: " + year +
                ", Пробіг: " + mileage + " км";
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Автомобіль " + brand + " " + model + " видалено з пам'яті.");
        super.finalize();
    }
}