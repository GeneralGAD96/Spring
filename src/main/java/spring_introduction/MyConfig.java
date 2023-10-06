package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan ("spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope ("singleton")
//    @Scope ("prototype")
    public Cat catBean() {
      return new Cat();
    }

    @Bean
    @Scope ("singleton")
    public Person personBean() {
        return new Person(catBean());
    }


}
