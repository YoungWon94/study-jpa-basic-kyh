# study-jpa-basic-kyh


https://www.inflearn.com/course/ORM-JPA-Basic/dashboard 강의  
실전예제3 - 다양한 연관관계 매핑

* resources/META-INF/persistence.xml 의 디비 정보 알맞게 조정  
* h2 외 다른 디비 사용시 build.gradle 에 디펜던시 추가 필요
* h2 사용시 실행환경에 맞는 h2 버전으로 build.gradle 의 h2 버전 수정 필요


인텔리제이 데이터베이스에 로컬 h2 디비 연결 해도 오류 혹은 디비/스키마가 안보일때
* 오류 메세지 : [42S02][42102] org.h2.jdbc.JdbcSQLSyntaxErrorException: Table "CATALOGS" not found; ...
* 해결 h2 url 뒤에 `;OLD_INFORMATION_SCHEMA=TRUE` 추가
* 참고 : https://github.com/JetBrains/jetbrains_guide/issues/215