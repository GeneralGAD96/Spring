package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat1 = context.getBean("catBean", Cat.class);
        Cat cat2 = context.getBean("catBean", Cat.class);
        cat1.say();
        System.out.println(cat1 == cat2);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();


    }
}
