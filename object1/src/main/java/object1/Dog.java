package object1;

public class Dog {
    private String name;
    private String breed;
    private int size;


    //construct
    public Dog(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    //getters and setters

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbreed(){
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
