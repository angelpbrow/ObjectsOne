package object1;

public class Chair {
    private String material;
    private String color;
    private int legs;

    //constructor
    public Chair(String material, String color, int legs) {
        this.material = material;
        this.color = color;
        this.legs = legs;
    }

    //getters and setters
    public String getMaterial(){
        return material;
    }

    public void setMaterial(){
        this.material = material;
    }

    public String setColor() {
        return color;
    }

    public void getColor() {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
