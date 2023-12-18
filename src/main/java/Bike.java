public class Bike {
    private String name;
    private boolean electricAssist;

    public Bike(String name) {
        this.name = name;
        this.electricAssist = false;
    }
    public void setElectricAssist(boolean electricAssist) {
        this.electricAssist = electricAssist;
    }

    public void printDescription() {
        System.out.println("Fahrrad: " + name);
        System.out.println("E-Bike: " + (electricAssist ? "Ja" : "Nein"));
    }
}

