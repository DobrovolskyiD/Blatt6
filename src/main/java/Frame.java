public class Frame {
    private String material;
    private String color;

    public Frame(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + material + " Rahmen";
    }
}