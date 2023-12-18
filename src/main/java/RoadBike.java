
public class RoadBike extends Bike {
    private Frame frame;
    private Brake brake;
    private GearShift gearShift;
    private Tire tire;

    public RoadBike(String name, Frame frame, Brake brake, GearShift gearShift,Tire tire) {
        super(name);
        this.frame = frame;
        this.brake = brake;
        this.gearShift = gearShift;
        this.tire= tire;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Typ: Rennrad");
        System.out.println("Komponenten: " + frame + ", " + brake + ", " + gearShift + ", " + tire );
    }
}

