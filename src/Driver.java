import java.util.Objects;

public class Driver {
    String person;
    String thePresenceOfADriversLicense;
    int experience;


    public void startMovingD(){
        System.out.println("Включаю зажигание, нажимаю на педаль, поехали!" );
    }
    public void stop(){
        System.out.println("Жму на педаль, Останавливаюсь!");
    }
    public void refuelTheCar(){
        System.out.println("Останавливаюсь, заправляюсь, снова еду!");
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String isThePresenceOfADriversLicense() {
        return thePresenceOfADriversLicense;
    }

    public void setThePresenceOfADriversLicense(String thePresenceOfADriversLicense) {
        this.thePresenceOfADriversLicense = thePresenceOfADriversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return thePresenceOfADriversLicense == driver.thePresenceOfADriversLicense && experience == driver.experience && Objects.equals(person, driver.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, thePresenceOfADriversLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "person='" + person + '\'' +
                ", thePresenceOfADriversLicense=" + thePresenceOfADriversLicense +
                ", experience=" + experience +
                '}';
    }
}
