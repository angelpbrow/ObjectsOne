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

    public void setMaterial(String material){
        this.material = material;
    }

    public String setColor(String color) {
        this.color = color;

        return color;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

    public int setLegs(int legs) {
        this.legs = legs;
        return legs;
    }
}
