스프링 외부설정


application.properties
  - 애플리케이션 관련 프로퍼티를 key = value 형태로 설정가능

Command Line argument
  - jar 파일 실행시 넘기는 argument 로 정의
  
* 설정 우선순위
  - 유저 홈 디렉토리에 있는 spring-boot-dev-tools.properties
  - 테스트에 있는 @TestPropertySource
  - @SpringBootTest 애노테이션의 properties 애트리뷰트
  - 커맨드 라인 아규먼트
  - SPRING_APPLICATION_JSON (환경 변수 또는 시스템 프로티) 에 들어있는 프로퍼티
  - ServletConfig 파라미터
  - ServletContext 파라미터
  - java:comp/env JNDI 애트리뷰트
  - System.getProperties() 자바 시스템 프로퍼티
  - OS 환경 변수
  - JAR 밖에 있는 특정 프로파일용 application properties
  - JAR 안에 있는 특정 프로파일용 application properties
  - JAR 밖에 있는 application properties
  - JAR 안에 있는 application properties
  - @PropertySource
  - 기본 프로퍼티 (SpringApplication.setDefaultProperties)

* application.properties 우선 순위 (높은게 낮은걸 덮어 씁니다.)
  - file:./config/
  - file:./
  - classpath:/config/
  - classpath:/
  
RandomValuePropertySource
  - ${Random.int}
  - ....

플레이스 홀더
  - jskim216.name = JongSung
  - jskim216.age = ${random.int}
  - jskim216.fullname = ${jskim216.name}} Kim
  


