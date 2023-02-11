public class Bus extends Transport implements Competing {
    public void getMassageBus(){
        System.out.println( "Это автобус, бренд - " + brand + ", модель - " + model + ", Объем двигателя - " + engineCapacity);
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
        System.out.println("Автобус " + brand + " " + model + "Останавливается для заправки топливом и смены шин");
    }
    @Override
    public double bestLapTime(){
        double a = (Math.random()*30 );
        System.out.println("Лучшее время круга автобуса " + brand + model + " - " + a + " минут");

        return a;
    }

    @Override
    public void maximumSpeed(){
        System.out.println("Максимальная скорость автобуса " + brand + model + " - " +  maxSpeed + " км/ч.");
    }
     public Bus(String brand, String model, double engineCapacity, int maxSpeed){
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
    public void ChooseCar(CategoryD driver){
        System.out.println("Водитель " + driver.person + " управляет автобусом " + brand + model + " и будет участвовать в заезде!");
    }
}
