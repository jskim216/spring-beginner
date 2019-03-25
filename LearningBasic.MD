PHP 개발자가 배워가는 Java Spring Boot


### 1. 매번 학습을 시도(?) 하지만 번번히 중도포기 하거나 hello world 만 찍다가 끝난다
> 원인?
1. 일단 용어가 많고 이와 같은 개념들에 대한 이해가 부족하다
2. 동작, 구동방식에 대해 깊게 알지 못한다
3. 애석하게도, Java 를 잘 모른다. (이젠 좀 알려나...?)


> 용어 및 개념 이해 (두서 없이 나열해 보았다)
##### 1. POJO
    - Plain Old Java Object
    - 오래된 방식의 순수한 자바 객체?
    - 특정한 기술이나 환경에 종속적이지 않은 자바 객체 (EJB는 복잡한 기술 및 많은 종속적인 제약사항이 따랐음)
    - 이로 인해 코드가 간결해지고 테스트에 유리하며 객체지향적 설계가 자유로움
    - 이러한 POJO 기반의 프레임워크가 바로 Spring 프레임워크 (이 외에 Hibernate 도 POJO 기반 프레임워크)
    
##### 2. Bean (여기에서는 Spring 에서의 Bean)
    - 어렵게 생각할 필요없이 일반적인 Java Object 라고 보면 될듯
    - Spring IoC Container 에 의해 관리되고 Application 의 핵심을 이루는 각 객체들을 Spring 에서 Beans 라고 부름
    - 여기서 관리라 함은, 이러한 Bean 들을 생성, 조립, 의존성 주입 하는 등의 행위

##### 3. IoC - Inversion of Control (제어역전)
    - 객체의 생성에서부터 생명주기의 관리까지 제어권이 Container 로 넘어감. (Spring Container 혹은, IoC Container)
    - 적절한 설정 (xml, annotaion 등) 에 따라 Container 가 알아서 처리한다 라고 이해하면 되려나?
    - 이러한 IoC 의 구현 방법 중 하나가 바로 DI (Dependency Injection) 라는 것. (DL 이라고 Dependency LookUp 도 있으나 이건 생략함)
    
##### 4. DI (Dependency Injection)
    - 객체간의 결합을 느슨하게 (결합도를 낮추도록) 설계된 패턴
    - 종속성이 감소하고, 재사용성이 용이함
    - 코드가 간결해짐

##### 5. Bean Factory & ApplicationContext
    - Bean Factory : Spring 의 IoC 를 담당하는 컨테이너 (Bean 의 등록, 생성, 조회, 반환, 관리)
    - 일반적으로는 이 Bean Factory 를 확장한 개념(인터페이스)인 ApplicationContext 를 사용한다.
    - ApplicationContext : Bean Factory 의 기본기능에 추가적으로 여러 컨테이너 기능들을 제공해준다고 한다.
    - Spring 문서에 따르면 특별한 경우가 아니면 ApplicationContext 을 사용하라고 나와있다.
    
###### 5-1. 아래와 같은 차이점이 있다고 한다.
|Feature|BeanFactory|ApplicationContext|
|---|---|---|
|Bean instantiation/wiring|Yes|Yes|
|Automatic BeanPostProcessor registration|No|Yes|
|Automatic BeanFactoryPostProcessor registration|No|Yes|
|Convenient MessageSource access (for i18n)|No|Yes|
|ApplicationEvent publication|No|Yes|
    
##### 6. Container
    - 인스턴스의 생명주기 관리, 생성된 인스턴스에 추가적인 기능을 제공
    - 작성한 코드의 처리과정을 위임받은 독립적인 것으로, 객체의 생성 소멸 등을 컨트롤
    - 에를 들자면, Servlet 컨테이너는 Servlet 의 생성, 초기화, 실행과 소멸 등 모든 권한을 가지고 스스로 컨트롤 한다.

##### 7. Servlet 과 Servlet Container, 그리고 Dispatcher-Servlet
    - Servlet : Servlet Container 위에서 작동하는 웹서비스용 자바 인터페이스(javax.servlet.Servlet)의 객체
    - Servlet Container 에 의해 생성, 호출, 소멸됨
    - Servlet Container : Servlet 을 관리하고 Servlet 의 생명주기 관리, HTTP 요청의 해석 등 (예, 아파치 톰캣, 제티 등)
    - Dispatcher-Servlet : Servlet Container에서 HTTP프로토콜을 통해 들어오는 모든 요청을 프레젠테이션 계층의 제일앞에 둬서 중앙집중식으로 처리해주는 프론트 컨트롤러(Front Controller)

![dispatcher_servlet](http://guruble.com/wp-content/uploads/2014/09/dispatcher_servlet.png)
![spring-boot-act](https://i.imgur.com/BJUx5fJ.jpg)
    
##### 8. AOP
