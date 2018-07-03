# spring boot gradle 과 각 view 들 연결하기

1. JSP
  > spring boot 는 기본적으로 템플릿을 이용하기에, JSP 를 사용할 경우 약간의 설정이 필요하다.
  - build.gradle 설정
  > dependencies 에 아래와 같이 추가
  
<pre><code>
dependencies {
  .....
  compile('javax.servlet:jstl:1.2')
  compile('org.apache.tomcat.embed:tomcat-embed-jasper')
  .....
}
</code></pre>
  > src/main/resources 아래의 application.properties 에 아래와 같이 추가. /WEB-INF/ 이하 경로에 맞게 설정.
<pre><code>
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp
</code></pre>
2. Thymeleaf
> dependencies 에 아래와 같이 추가. src/main/resources/templates/  아래에 .html 형태로 작성
<pre><code>
dependencies {
  .....
  compile('org.springframework.boot:spring-boot-starter-thymeleaf')
  .....
}
</code></pre>

  > JSP 와는 다르게 표현식이 다소 생소하다. 아래는 예시.
