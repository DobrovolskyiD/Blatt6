public class Main {
    public static void main(String[] args) {
        // Fahrräder erstellen
        RoadBike redRoadBike = new RoadBike("Rotes Rennrad",
                new Frame("Carbon", "Rot"), new Brake("Felgenbremse"), new GearShift("Kettenschaltung"),new Tire(""));
        MountainBike emountainBike = new MountainBike("Schwarzes E-Mountainbike",
                new Frame("Alu", "Schwarz"), new Brake("Scheibenbremse"), new GearShift("Kettenschaltung"),new Tire(""));

        CityBike ecityBike = new CityBike("Weißes E-Stadtfahrrad ",
                new Frame("Alu", "Weiß"), new Brake("Trommelbremse"), new GearShift("Nabenschaltung"),new Tire(""));

        // Elektrofahrräder erstellen
        emountainBike.setElectricAssist(true);
        emountainBike.printDescription();
        System.out.println();

        ecityBike.setElectricAssist(true);
        ecityBike.printDescription();
        System.out.println();

        redRoadBike.printDescription();
        System.out.println();
    }
}