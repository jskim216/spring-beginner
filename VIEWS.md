# spring boot gradle 과 각 view 의 사용

1. JSP
  > spring boot 는 기본적으로 템플릿을 이용하기에, JSP 를 사용할 경우 약간의 설정이 필요하다.
  - build.gradle 설정
  > dependencies 에 아래와 같이 추가
  
````
dependencies {
  .....
  compile('javax.servlet:jstl:1.2')
  compile('org.apache.tomcat.embed:tomcat-embed-jasper')
  .....
}
````
  > src/main/resources 아래의 application.properties 에 아래와 같이 추가. /WEB-INF/ 이하 경로에 맞게 설정.
````
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp
````
2. Thymeleaf
> dependencies 에 아래와 같이 추가. src/main/resources/templates/  아래에 .html 형태로 작성
````
dependencies {
  .....
  compile('org.springframework.boot:spring-boot-starter-thymeleaf')
  .....
}
````

  > JSP 와는 다르게 표현식이 다소 생소하다. 아래는 예시.
```html
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<meta charset="UTF-8"/>
<title>Index: ORM learning programming</title>
</head>
<body>
	<h1>Made by honeymon</h1>
	<div>
		<div>Very simple!</div>
		<!-- SpEl: Spring Expression Language 사용 -->
		<div th:text="${greeting}">Greeting</div>
	</div>
</body>
</html>
```
> thymeleaf document link
https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html
3. Freemarker
> 마찬가지로 dependencies 에 아래와 같이 추가. src/main/resources/templates/  아래에 .ftl 형태로 작성
````
dependencies {
  .....
  compile('org.springframework.boot:spring-boot-starter-freemarker')
  .....
}
````

# Webjars
> https://www.webjars.org/ 에서 프론트 라이브러리들을 jar 파일로 패키징하여 제공. 각 빌드에 맞는 의존체를 확인/추가하여 사용
````
dependencies {
  .....
  compile('org.webjars:jquery:3.3.1-1')
  compile('org.webjars:bootstrap:4.1.1')
  .....
}
````
위와 같이 추가하고 gradle 을 refreash 후 package explorer 의 의존체 목록에서 해당 jar 들을 확인 할 수 있다.
