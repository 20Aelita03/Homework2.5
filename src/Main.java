public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, 240);
        audi.getMassageCar();
        audi.pitStop();
        audi.bestLapTime();
        audi.maximumSpeed();
        Car bmw = new Car("BMW", "Z8", 3.0, 200);
        bmw.getMassageCar();
        bmw.maximumSpeed();
        bmw.bestLapTime();
        bmw.pitStop();
        Car kia = new Car("Kia", "Sportage 4", 2.4, 220);
        kia.getMassageCar();
        kia.pitStop();
        kia.bestLapTime();
        kia.maximumSpeed();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, 260);
        hyundai.getMassageCar();
        hyundai.maximumSpeed();
        hyundai.pitStop();
        hyundai.bestLapTime();

        Bus mercedes = new Bus("Mercedes-Benz", "Conecto G", 10.7, 200);
        mercedes.getMassageBus();
        mercedes.bestLapTime();
        mercedes.maximumSpeed();
        mercedes.pitStop();
        Bus hyundaiBus = new Bus("Hyundai", "Super Aero City", 11.0, 210 );
        hyundaiBus.getMassageBus();
        hyundaiBus.pitStop();
        hyundaiBus.maximumSpeed();
        hyundaiBus.bestLapTime();
        Bus foton = new Bus("Foton", "BJ 6126", 8.9, 220);
        foton.getMassageBus();
        foton.bestLapTime();
        foton.pitStop();
        foton.maximumSpeed();
        Bus ankai = new Bus("ANKAI", "A9 BLACK", 10.4, 200);
        ankai.getMassageBus();
        ankai.maximumSpeed();
        ankai.pitStop();
        ankai.bestLapTime();

        Trucks kamaz = new Trucks("КАМАЗ", "4911-EXTREME", 17.2, 210);
        kamaz.getMassageTrucks();
        kamaz.bestLapTime();
        kamaz.maximumSpeed();
        kamaz.pitStop();
        Trucks man = new Trucks("MAN", "TGS", 26.4, 200);
        man.getMassageTrucks();
        man.bestLapTime();
        man.pitStop();
        man.maximumSpeed();
        Trucks daf = new Trucks("DAF", "XF 105", 10.8,200);
        daf.getMassageTrucks();
        daf.maximumSpeed();
        daf.pitStop();
        daf.bestLapTime();
        Trucks renault = new Trucks("RENAULT TRUCKS", "520T PUS", 12.8, 220);
        renault.getMassageTrucks();
        renault.bestLapTime();
        renault.pitStop();
        renault.maximumSpeed();

        CategoryB alex = new CategoryB("Петров Александр Павлович", "В", 3);
        alex.getMassage();
        audi.ChooseCar(alex);
        CategoryB lena = new CategoryB("Синицина Елена Львовна", "В", 7);
        lena.getMassage();
        bmw.ChooseCar(lena);
        CategoryB sonya = new CategoryB("Иванова София Кирилловна", "В", 5);
        sonya.getMassage();
        kia.ChooseCar(sonya);
        CategoryB den = new CategoryB("Кудряшов Денис Сергеевич", "В", 9);
        den.getMassage();
        hyundai.ChooseCar(den);

        CategoryC semen = new CategoryC("Лопин Семен Игоревич", "С", 12);
        semen.getMassage();
        kamaz.ChooseCar(semen);
        CategoryC dasha = new CategoryC("Лопина Дарья Игоревна", "С", 10);
        dasha.getMassage();
        man.ChooseCar(dasha);
        CategoryC lisa = new CategoryC("Совина Елизавета Евгеньевна", "С", 21);
        lisa.getMassage();
        daf.ChooseCar(lisa);
        CategoryC misha = new CategoryC("Клепин Михаил Андреевич", "С", 34);
        misha.getMassage();
        renault.ChooseCar(misha);

        CategoryD dima = new CategoryD("Лужников Дмитрий Александрович", "D", 20);
        dima.getMassage();
        mercedes.ChooseCar(dima);
        CategoryD katya = new CategoryD("Реминова Екатерина Степановна", "D", 13);
        katya.getMassage();
        hyundaiBus.ChooseCar(katya);
        CategoryD maria = new CategoryD("Дюпина Мария Вячеславовна", "D", 8);
        maria.getMassage();
        foton.ChooseCar(maria);
        CategoryD leo = new CategoryD("Рыкин Леонтий Дмитриевич", "D", 4);
        leo.getMassage();
        ankai.ChooseCar(leo);

        VinB(audi,bmw,kia,hyundai);

        VinC(kamaz, man, daf, renault);

        VinD(mercedes, hyundaiBus, foton, ankai);



    }
    public static void VinB(Car a, Car b, Car c, Car d){
        double aT = a.bestLapTime();
        double bT = b.bestLapTime();
        double cT = c.bestLapTime();
        double dT = d.bestLapTime();
        if( aT < bT && aT < cT && aT < dT){
            System.out.println("Победила машина " + a.brand + " " + a.model);
        } else if (bT < aT && bT < cT && bT < dT){
            System.out.println("Победила машина " + b.brand + " " + b.model);
        } else if (cT < aT && cT < bT && cT < dT){
            System.out.println("Победила машина " + c.brand + " " + c.model);
        } else {
            System.out.println("Победила машина " + d.brand + " " + d.model);
        }
    }
    public static void VinC(Trucks a, Trucks b, Trucks c, Trucks d){
        double aT = a.bestLapTime();
        double bT = b.bestLapTime();
        double cT = c.bestLapTime();
        double dT = d.bestLapTime();
        if( aT < bT && aT < cT && aT < dT){
            System.out.println("Победил грузовик " + a.brand + " " + a.model);
        } else if (bT < aT && bT < cT && bT < dT){
            System.out.println("Победил грузовик " + b.brand + " " + b.model);
        } else if (cT < aT && cT < bT && cT < dT){
            System.out.println("Победил грузовик " + c.brand + " " + c.model);
        } else {
            System.out.println("Победил грузовик " + d.brand + " " + d.model);
        }
    }
    public static void VinD(Bus a, Bus b, Bus c, Bus d){
        double aT = a.bestLapTime();
        double bT = b.bestLapTime();
        double cT = c.bestLapTime();
        double dT = d.bestLapTime();
        if( aT < bT && aT < cT && aT < dT){
            System.out.println("Победил автобус " + a.brand + " " + a.model);
        } else if (bT < aT && bT < cT && bT < dT){
            System.out.println("Победил автобус " + b.brand + " " + b.model);
        } else if (cT < aT && cT < bT && cT < dT){
            System.out.println("Победил автобус " + c.brand + " " + c.model);
        } else {
            System.out.println("Победил автобус " + d.brand + " " + d.model);
        }
    }
}