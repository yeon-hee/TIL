### ⭐ AWS에 Docker 연동

<br>

#### ec2 연결 
ssh안에 J3A103T.pem 파일 넣기
- C:\Users\multicampus\.ssh 에서 git bash 실행

#### ec2에 docker 연동하기 
1. ec2에 docker 설치하기
- sudo apt install docker.io  
2. 설치된 docker 버전 확인
- docker -v 
3. docker run
- docker run --name mysql(별칭) -p 3306:3306 -e MYSQL_ROOT_PASSWORD=패스워드 -d emblockit/ssafy-mysql
4. docker 실행
- docker exec -it mysql mysql -u root -p -> 비밀번호 입력
5. 사용 database 설정
- use bcssafy(database 이름) 


