
Spring Boot 활용

* Application Events and Listeners


ApplicationStartingEvent

  - 이벤트 발생 시점
  - ApplicationContext 가 만들어 진 이후에 발생하는 이벤트들은 해당 리스너가 Bean 이면 등록됨
  - ApplicationContext 가 만들어지기 전은?
    - ApplicationStartingEvent 가 그것 ApplicationContext 가 만들어지기 전에 실행하는 놈이라서 해당 리스너는 동작을 안함
    - 이럴 경우에는 SpringApplication run 전에 .addListener() 에서 직접 등록해줘야한다.
    - 이럴땐 Bean 으로 등록이 의미없음

ApplicationStartedEvent
  - ApplicationContext 가 만들어진 이후에 발생하는 이벤트 리스너는 그냥 Bean 등록 하면됨

setWebApplicationType 설정
  - NONE, SERVLET, REACTIVE
  - 기본적으로 Spring web-MVC 가 들어있으면 SERVLET
  - WebFlux 가 있으면 REACTIVE
  - 다만 둘다 있을때 우선순위는 SERVLET
  - 필요에 따라 타입 설정하여 사용
  
ApplicationArguments
  - jvm options (-D)는 ApplicationArguments 로 받지않는다
  - (--) 로 받은 program arguments 로만 받음
  
ApplicationRunner & CommandLineRunner
  - Application 실행 후 실행 시켜야 할 것이 있을때 사용 (주로 ApplicationRunner)
  - @Order(n) 으로 순서지정 가능 (내림차순)
