public class Tire {
    private String type;

    public Tire(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tire: " + type;
    }
}