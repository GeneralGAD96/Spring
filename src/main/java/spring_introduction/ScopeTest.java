package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person1 = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);
        System.out.println(person1 == person2);
        System.out.println(person1);
        System.out.println(person2);
        context.close();
    }
}
