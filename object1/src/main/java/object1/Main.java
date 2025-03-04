package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        //new Person object with height of 10cm;
        //the person class is the blueprint for the person object in
        Person person1 = new Person(10);


        //two new people in the people array
        Person[] people = new Person[10];
        Person person2 = new Person(25);
        Person person3 = new Person(30);

        people[0] = person2;
        people[1] = person3;

        //two new chairs in a musical chair game
        Chair[] musicalChairGame = new Chair[5];
        Chair chair1 = new Chair("metal", "gray",4);
        Chair chair2 = new Chair("reeds","brown",3);

        musicalChairGame[0] = chair1;
        musicalChairGame[1] = chair2;

        //two new dogs in the shelter
        Dog[] shelter = new Dog[8];
        Dog dog1 = new Dog("Spunky","Beagle",10);
        Dog dog2 = new Dog("Dill","Pug",4);

        //two new cars at the car dealership
        Car[] carDealership = new Car[30];
        Car car1 = new Car("uhh","what",2003,300);
        Car car2 = new Car("nope","cheese",1993,500);

    }

// Chair chair1 = new Chair(metal, gray, 4);


    }

