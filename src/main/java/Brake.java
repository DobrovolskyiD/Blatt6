public class Brake {
    private String type;

    public Brake(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " Bremse";
    }
}