*인프런 강의 들으면서 일단 끄적끄적

스프링 부트에서 @SpringBootApplication 의 위치는 가장 최상위 패키지 아래에 생성해주는 것이 좋다
- 이유는 컴포넌트스캔 (@ComponentScan 을 하기때문) - 해당하는 패키지 이하에 있는 클래스들을 뒤져서 bean으로 등록

스프링부트에서의 의존성 이해

parent
- 최상위 parent (spring-boot-dependencies) 에서 버전 명시되어있음
- 이로인해 많은 의존성들을 직접 관리할 필요 없어짐

parent 외에도 다른 방법
- dependencyManagement 를 이용하여 선언
- 다만 parent 에는 의존성 뿐만아니라  properties 및 그 외 resource, plugin 등 여러 설정을 제공해 주므로 되도록 parent 를 사용

의존성 관리기능 활용

mvnrepository.com
- 여러 의존성들 있음 

modelmapper ?
- 도메인 객체와 DTO 와의 필드? 를 연결해줌

스프링부트에서 버전 관리하지 않는 의존성들은 버전을 명시해주는것이 좋다
스프링부트에서 버전 관리하는 의존성 중 버전을 바꿔서 관리하려면 버전을 명시하여 properties 에 버전을 오버라이딩. plugin 등 그 외 설정도 마찬가지


자동설정 이해
@SpringBootApplication 내의

@SpringBootConfiguration
- @ComponentScan 으로 읽어온 bean 등록 (@ComponentScan 이 달려있는 클래스부터 하위 패키지까지 아래 애노테이션들을 가진 클래스를 찾아서 bean 등록)
  - @Component
  - @Configuration @Repository @Service @Controller @RestController
  
@EnableAutoConfiguration 으로 읽어온 bean 등록

spring 메타파일
  - spring.factories 에 정의된 AutoConfigration 키값들이 존재
  - 위 키값들로 해당 클래스들을 bean 으로 등록
  - 다만 조건에 따라 다름 (@ConditionalOnClass, @ConditionalOnMissingBean ..... 등)
  
  

