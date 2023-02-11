public class Car extends Transport implements Competing {
    public void getMassageCar(){
        System.out.println( "Это машина, бренд - " + brand + ", модель - " + model + ", Объем двигателя - " + engineCapacity + ", Максимальная скорость - " + maxSpeed);
    }

    @Override
    protected void startMoving(){
        System.out.println("Start!");
    }
    @Override
    protected void finishTheMove(){
        System.out.println("Finish!");
    }
    @Override
    public void pitStop(){
        System.out.println("Машина " + brand + " " + model + "Останавливается для заправки топливом и смены шин");
    }
    @Override
    public double bestLapTime(){
        double a = (Math.random()*20 );
        System.out.println("Лучшее время круга машины " + brand + model + " - " + a + " минут");
        return a;
    }

    @Override
    public void maximumSpeed(){
        System.out.println("Максимальная скорость машины " + brand + model + " - " + maxSpeed + " км/ч.");
    }
    public Car(String brand, String model, double engineCapacity, int maxSpeed){
        if(brand.isEmpty() || brand.isBlank()){
            this.brand = "Бренд";
        } else {
            this.brand = brand;
        }
        if(model.isEmpty() || model.isBlank()){
            this.model = "Модель";
        } else {
            this.model = model;
        }
        if (engineCapacity >= 0){
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = Math.abs(engineCapacity);
        }
        if (maxSpeed >= 0){
            this.maxSpeed  = maxSpeed;
        } else {
            this.maxSpeed  = Math.abs(maxSpeed);
        }

    }
    public void ChooseCar(CategoryB driver){
        System.out.println("Водитель " + driver.person + " управляет автомобилем " + brand + model + " и будет участвовать в заезде!");
    }

}
