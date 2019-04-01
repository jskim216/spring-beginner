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
  - Spring 은 JdbcTemplate 을 제공하여(Spring 에서 제공하는 class 라 보면될듯?) , 아래와 같은 일을 함
  -- Connection 열기와 닫기
  -- Statement 준비와 닫기
  -- Statement 실행
  -- ResultSet Loop처리
  -- Exception 처리와 반환
  -- Transaction 처리
  
  
* DBCP (DataBase Connection Pool)


* Spring 은 기본적으로 Hikari DBCP 를 사용
