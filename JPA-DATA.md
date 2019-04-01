JPA DATA

* Spring Boot 가 지원하는 In-memory Database
  - H2
  - HSQL
  - Derby
  
Spring JDBC 존재시 (의존성 설정시) , 자동설정에 의해 DataSource 와 JdbcTemplate Bean 이 등록됨
  - DataSourceAutoConfiguration
  - JdbcTemplateAutoConfiguration
  
따라서, DataSource 및 JdbcTemplate 를 바로 Autowired 받아서 사용가능

별다른 JDBC 설정이 없으면, 기본적으로 In-memory Database 설정 사용
  - jdbc/DataSourceProperties 에 기본접근 설정이 존재


* Jdbc (Java DataBase Connectivity)
  - DB 에 접근 할 수 있도록 제공되는 API
  - 데이터의 쿼리 및 업데이트 등을 제공
  - 다만 쿼리실행을 위해 커넥션 생성 및 연결, 종료, 예외처리, 트랜잭션 등을 일일이 수작업(?)으로
  반복적인 코드를 입력해야한다.
  - 이러한 문제점 해결을 위해 Spring 에서는 JdbcTemplate 을 제공
  
* JdbcTemplate
  - Spring 은 JdbcTemplate 을 제공하며 (Spring 에서 제공하는 class 라 보면될듯?) 아래와 같은 일을 함
  - Connection 열기와 닫기
  - Statement 준비와 닫기
  - Statement 실행
  - ResultSet Loop처리
  - Exception 처리와 반환
  - Transaction 처리
  
  결국, 개발자는 DataSource 를 설정하고, 원하는 쿼리문을 작성 후 결과를 받기만 하면됨
  
  JdbcTemplate 은 execute, update, queryForObject, queryForList 등 다양한 메소드들을 제공함. 
  (각 메소드들에 대해서는 아직 제대로 못봤음.)
  
* Jdbc Driver
  - DBMS 가 이해 할 수있는 프로토콜로 변환해주는 어댑터가 바로 Jdbc Driver
  
* DBCP (DataBase Connection Pooling)
  - 한마디로 말하자면, 일정량의 Connection 을 미리 생성하여 저장소에 저장했다가 요청시 마다 꺼내서 제공해주는 기법
  - Connection TimeOut 및 Connection Pool size (Connection 객체를 몇개 설정해둘것인가) 등을 설정가능
  - Spring 은 기본적으로 HikariCP 를 사용
  




