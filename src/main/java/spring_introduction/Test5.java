package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat = context.getBean("myPet", Cat.class);
        cat.say();
        Cat cat1 = context.getBean("myPet", Cat.class);
        cat1.say();
        cat.destroy();
        cat1.destroy();
        context.close();

    }
}
