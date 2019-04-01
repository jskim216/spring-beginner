JPA DATA

* Spring Boot 가 지원하는 In-memory Database
  - H2
  - HSQL
  - Derby
  
Spring JDBC 존재시 (의존성 설정시) , 자동설정에 의해 DataSource 와 JdbcTemplate Bean 이 등록됨
  - DataSourceAutoConfiguration
  - JdbcTemplateAutoConfiguration
  
따라서, DataSource 를 바로 Autowired 받아서 사용가능

별다른 JDBC 설정이 없으면, 기본적으로 In-memory Database 설정 사용
  - jdbc/DataSourceProperties 에 기본접근 설정이 존재


