package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
         System.out.println(person.getSurname() + " " + person.getAge());
        System.out.println(context.isActive());
        context.close();
        System.out.println(context.isActive());

    }
}
