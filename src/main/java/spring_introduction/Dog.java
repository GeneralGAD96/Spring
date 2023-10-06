package spring_introduction;

import org.springframework.stereotype.Component;

//@Component ("dogBean")
public class Dog implements Pet{
    public Dog() {
        System.out.println("dog bean created");
    }

    public void say() {
        System.out.println("Bow");

    }

}
