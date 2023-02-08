import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Trucks;
import Transport.enums.BodyTypes;
import Transport.enums.CapacityType;
import Transport.enums.LoadType;
import Transport.exception.TransportTypeException;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        DriverB driverB = new DriverB("Иван ИВанов Иванович", true, 15);

        Car carAudi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                driverB,
                BodyTypes.SEDAN);

        Car carBmw = new Car(
                "BMW",
                "Z8",
                3.0,
                driverB,
                BodyTypes.COUPE);

        Car carKia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                driverB,
                BodyTypes.SUV);

        Car carHyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                driverB,
                null);

        printInfo(carAudi);
        printInfo(carBmw);
        printInfo(carKia);
        printInfo(carHyundai);
        System.out.println();

        DriverD driverD = new DriverD("Фёдор Фёдорович Колесников", true, 10);

        Bus busDaewoo = new Bus(
                "Daewoo",
                "BS 106",
                6.5,
                driverD,
                null);

        Bus busHiger = new Bus(
                "Higer",
                "KLQ 6122B",
                10,
                driverD,
                CapacityType.BIG);

        Bus busSetra = new Bus(
                "Setra",
                "S215 HD",
                8,
                driverD,
                CapacityType.GREAT);

        Bus busVolvo = new Bus(
                "Volvo",
                "9500",
                7.7,
                driverD,
                CapacityType.LITTLE);

        printInfo(busDaewoo);
        printInfo(busHiger);
        printInfo(busSetra);
        printInfo(busVolvo);
        System.out.println();

        DriverC driverC = new DriverC("Антон Антонович Антонов", true, 17);

        Trucks trucksMan = new Trucks(
                "Man",
                "TGX",
                12.4,
                driverC,
                LoadType.N1);

        Trucks trucksScania = new Trucks(
                "Scania",
                "XT",
                16,
                driverC,
                null);

        Trucks trucksTatra = new Trucks(
                "Tatra",
                "T815",
                12.7,
                driverC,
                LoadType.N2);

        Trucks trucksRenault = new Trucks(
                "Renault",
                "Magnum",
                12.8,
                driverC,
                LoadType.N3);

        printInfo(trucksMan);
        printInfo(trucksScania);
        printInfo(trucksTatra);
        printInfo(trucksRenault);
        System.out.println();

        carAudi.printType();
        carBmw.printType();
        carKia.printType();
        carHyundai.printType();
        System.out.println();

        busDaewoo.printType();
        busHiger.printType();
        busSetra.printType();
        busVolvo.printType();
        System.out.println();

        trucksMan.printType();
        trucksScania.printType();
        trucksTatra.printType();
        trucksRenault.printType();
        System.out.println();

        carAudi.passDiagnostics();
        carBmw.passDiagnostics();
        carKia.passDiagnostics();
        carHyundai.passDiagnostics();
        System.out.println();

        trucksMan.passDiagnostics();
        trucksScania.passDiagnostics();
        trucksTatra.passDiagnostics();
        trucksRenault.passDiagnostics();

        try {busDaewoo.passDiagnostics();
             busHiger.passDiagnostics();
             busSetra.passDiagnostics();
             busVolvo.passDiagnostics();
        }
        catch (TransportTypeException e) {
            System.err.println("Автобусы диагностику проходить не должны.");
        }



        System.out.println();
    }

    public static void printInfo(Transport<?> transport){
        System.out.println("Водитель с категорией B " + transport.getDriver().getFIO() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет учавствовать в заезде");
    }
}
