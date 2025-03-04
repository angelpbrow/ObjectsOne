package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        //new Person object with height of 10cm;
        //the person class is the blueprint for the person object in
        Person person1 = new Person(10);


    }

// Chair chair1 = new Chair(metal, gray, 4);


    }

