package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat myCat = context.getBean("myPet", Cat.class);
        Cat yourCat = context.getBean("myPet", Cat.class);

        System.out.println("Преременные ссылаются на один объект?");
        System.out.println(myCat == yourCat);
        System.out.println(myCat);
        System.out.println(yourCat);
        context.close();



    }
}
