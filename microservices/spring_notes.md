
### Spring Notes ###

@SpringBootApplication -> convenience annotation that adds all of the following
    - @Configuration 
    - @EnableAutoConfiguration -> tells spring boot to start adding beans based on classpath settings,
    - @EnableWebMvc -> Flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet
    
    
    
@Controller vs @RestController
@RestController is a convenience annotation that combines @Controller w/ @RequestBody annotation


@Transcactinal