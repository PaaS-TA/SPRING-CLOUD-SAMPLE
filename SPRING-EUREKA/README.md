# PAAS-TA-PORTAL-REGISTRATION

## Eureka Server
Eureka 란? Spring Cloud에서 제공하는 서비스이다.
Eureka는 스몰 DNS 서버의 의미로 생각할 수 있는 서비스이다. 
application 이름으로 등록 Eureka에 등록을 할 경우 다른 application 들도(Eureka등록이 되어 있어야함) 그이름으로 특정 서비스를 찾을 수 있다.

장점
- 서버가 새롭게 추가되면, Config를 수정없이 다른 Application들이 찾아서 사용할 수 있다.
- 서버가 종료되면, 자동으로 목록에서 삭제하여 별도의 수정없이 연결을 제한할 수 있다.
- 로드밸런싱을 제공한다.

## 유의사항

개발 정보
- gradle 2.14 버전
- java 1.8 버전


