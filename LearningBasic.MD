PHP 개발자가 배워가는 Java Spring Boot


### 1. 매번 학습을 시도(?) 하지만 번번히 중도포기 하거나 hello world 찍다가 끝난다
> 원인?
1. 일단 용어가 많고 이와 같은 개념들에 대한 이해가 부족하다
2. 동작, 구동방식에 대해 깊게 알지 못한다
3. 애석하게도, Java 를 잘 모른다.



> 용어 및 개념 이해 (두서 없이 나열해 보았다)
1. POJO
    - Plain Old Java Object
    - 오래된 방식의 순수한 자바 객체?
    - 특정한 기술이나 환경에 종속적이지 않은 자바 객체 (과거의 EJB는 복잡한 기술 및 많은 종속적인 제약사항이 따랐음)
    - 이로 인해 코드가 간결해지고 테스트에 유리하며 객체지향적 설계가 자유로움
    - 이러한 POJO 기반의 프레임워크가 바로 Spring 프레임워크 (이 외에 Hibernate 도 POJO 기반 프레임워크)
    
2. Bean (여기에서는 Spring 에서의 Bean)
    - 어렵게 생각할 필요없이 일반적인 Java Object 라고 보면 될듯
    - Spring IoC Container 에 의해 관리되고 Application 의 핵심을 이루는 각 객체들을 Spring 에서 Beans 라고 부름
    - 여기서 관리라 함은, 이러한 Bean 들을 생성, 조립, 의존성 주입 하는 등의 행위

3. IoC - Inversion of Control (제어역전)
    - 객체의 생성에서부터 생명주기의 관리까지 제어권이 Container 로 넘어갔다. (Spring Container 혹은, IoC Container)
    - 이러한 IoC 의 구현 방법 중 하나가 바로 DI (Dependency Injection) 라는 것. (DL 이라고 Dependency LookUp 도 있으나 이건 생략함)

3. Bean Factory & ApplicationContext
    - Bean Factory : Spring 의 IoC 를 담당하는 컨테이너 (Bean 의 등록, 생성, 조회, 반환, 관리) 
    - ApplicationContext
    - org.springframework.context.ApplicationContext 
    
4. Container


5. Servlet

6. DI

7. IOC

8. AOP

