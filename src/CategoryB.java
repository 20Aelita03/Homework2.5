public class CategoryB extends Driver {
   public CategoryB(String person, String thePresenceOfADriversLicense, int experience){
       if(person.isEmpty() || person.isBlank()){
           this.person = "Водитель";
       } else {
           this.person = person;
       }
       if(thePresenceOfADriversLicense.isEmpty() || thePresenceOfADriversLicense.isBlank()){
           this.thePresenceOfADriversLicense = "Нет прав";
       } else {
           this.thePresenceOfADriversLicense = thePresenceOfADriversLicense;
       }
       if (experience >= 0){
           this.experience  = experience;
       } else {
           this.experience  = Math.abs(experience);
       }

   }
   public void getMassage(){
       System.out.println("Это водитель категории В - " + person + ". Категория прав - " + thePresenceOfADriversLicense
               + ". Водительский стаж в годах - " + experience );
   }
   @Override
   public void startMovingD(){
       System.out.println("Включаю зажигание, нажимаю на педаль, поехали!" );
   }
   @Override
   public void stop(){
       System.out.println("Жму на педаль, Останавливаюсь!");
   }
   @Override
   public void refuelTheCar(){
       System.out.println("Останавливаюсь, заправляюсь, снова еду!");
   }
}
