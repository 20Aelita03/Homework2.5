public class Trucks extends Transport implements Competing{
    public void getMassageTrucks(){
        System.out.println( "Это грузовая машина, бренд - " + brand + ", модель - " + model + ", Объем двигателя - " + engineCapacity);
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
        System.out.println("Грузовая машина " + brand + " " + model + "Останавливается для заправки топливом и смены шин");
    }
    @Override
    public double bestLapTime(){
        double a = (Math.random()*30 );
        System.out.println("Лучшее время круга грузовика " + brand + model + " - " + a + " минут");

        return a;
    }

    @Override
    public void maximumSpeed(){
        System.out.println("Максимальная скорость грузовика " + brand + model + " - " + maxSpeed + " км/ч.");
    }
    public Trucks(String brand, String model, double engineCapacity, int maxSpeed){
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
    public void ChooseCar(CategoryC driver){
        System.out.println("Водитель " + driver.person + " управляет грузовиком " + brand + model + " и будет участвовать в заезде!");
    }
}
