# TIL

📝 Today I Learned
- 좋은 개발자가 되기 위해 하루동안 학습한 내용이나 개발관련 경험들을 간단한 기록으로 남긴다.
- 기본기를 중심으로 학습하고, 나아가 기본기를 바탕으로 발전하는 개발자가 된다.
- 학습의 연속성을 유지하고, 반드시 제대로 숙독한 내용만 기록에 남긴다.
- wiki처럼 운용이 가능하도록 지향한다.

### 분류
- [블록체인](BlockChain)

<hr>

### BlockChain
- [블록체인과 Ethereum의 개념](https://github.com/yeon-hee/TIL/blob/master/BlockChain/BlockChain%20and%20Ethereum.md)

### AWS에 Docker 연동

- ec2 연결 
ssh안에 J3A103T.pem 파일 넣기
C:\Users\multicampus\.ssh 에서 git bash 실행

- ec2에 docker 연동하기 
- ec2에 docker 설치하기
	sudo apt install docker.io  
- 설치된 docker 버전 확인
docker -v 
- docker run
docker run --name mysql(별칭) -p 3306:3306 -e MYSQL_ROOT_PASSWORD=패스워드 -d emblockit/ssafy-mysql
- docker 실행
docker exec -it mysql mysql -u root -p -> 비밀번호 입력
- 사용 database 설정
use bcssafy(database 이름) 


