package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component ("personBean")
//@Scope ("prototype")
public class Person {
//    @Autowired
//    @Qualifier ("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("bean person is created");
    }
//    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("bean person is created");
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Autowired
    @Qualifier ("catBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet () {
        System.out.println("Привет моё любимое животное");
        pet.say();
    }
    @PreDestroy
    private void destroy(){
        System.out.println("Destroy method");
    }
    @PostConstruct
    private void init(){
        System.out.println("Init method");
    }

}
