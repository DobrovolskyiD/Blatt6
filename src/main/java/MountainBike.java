public class MountainBike extends Bike {
    private Frame frame;
    private Brake brake;
    private GearShift gearShift;
    private Tire tire;

    public MountainBike(String name, Frame frame, Brake brake, GearShift gearShift,Tire tire) {
        super(name);
        this.frame = frame;
        this.brake = brake;
        this.gearShift = gearShift;
        this.tire= tire;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Typ: Mountainbike");
        System.out.println("Komponenten: " + frame + ", " + brake + ", " + gearShift+ ", " + tire );
    }
}
