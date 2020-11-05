## Git으로 협업하기

- branch에서 작업한 후 원격 develop에 merge하기

```java
git add 수정한 파일
```

```java
git commit -m "커밋 메시지"
```

```java
git push origin 브랜치
```

```java
git checkout develop
```

여기서 작업한 목록들을 모두 add안하고 남겨놨을 경우, 브랜치를 바꾸지 못할때는 git stash를 통해 기존에 작업하던 것을 저장한 후 브랜치를 이동한다.

최근 원격 develop를 pull 한다.
```java
git pull
```
<br>

작업하던 브랜치를 로컬 develop에 merge한다.
```java
git merge 브랜치
```
<br>

로컬 develop를 원격 develop로 push한다.
```java
git push
```
<br>

```java
git check 브랜치
```
새로 작업할 브랜치를 생성하거나, 기존 브랜치로 돌아와 이전에 stash를 해주었다면 git stash pop을 한 후, 작업을 진행한다.
