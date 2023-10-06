package spring_introduction;

import org.springframework.stereotype.Component;

//@Component ("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean created");
    }

    private void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }

    public void say() {
        System.out.println("Meow");
    }
}
