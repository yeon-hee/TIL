### :blush: 의미있는 이름
<br>

- [의도를 분명히 밝혀라](#의도를-분명히-밝혀라)
- [그릇된 정보를 피하라](#그릇된-정보를-피하라)
- [의미 있게 구분하라](#의미-있게-구분하라)
- [발음하기 쉬운 이름을 사용하라](#발음하기-쉬운-이름을-사용하라)
- [검색하기 쉬운 이름을 사용하라](#검색하기-쉬운-이름을-사용하라)
- [인코딩을 피하라](#인코딩을-피하라)
- [자신의 기억력을 자랑하지 마라](#자신의-기억력을-자랑하지-마라)
- [클래스 이름](#클래스-이름)
- [메서드 이름](#메서드-이름)
- [기발한 이름은 피하라](#기발한-이름은-피하라)
- [한 개념에 한 단어를 사용하라](#한-개념에-한-단어를-사용하라)
- [말장난을 하지 마라](#말장난을-하지-마라)
- [해법 영역에서 가져온 이름을 사용하라](#해법-영역에서-가져온-이름을-사용하라)
- [문제 영역에서 가져온 이름을 사용하라](#문제-영역에서-가져온-이름을-사용하라)
- [의미 있는 맥락을 추가하라](#의미-있는-맥락을-추가하라)
- [불필요한 맥락을 없애라](#불필요한-맥락을-없애라)
<br>
<hr>
<br>

#### 의도를 분명히 밝혀라 
<br>

- 좋은 이름을 지으려면 시간이 걸리지만 좋은 이름으로 절약하는 시간이 훨씬 더 많다.

- 변수나 함수, 클래스 이름은 다음과 같은 굵직한 질문에 모두 답해야 한다.
  - 변수(혹은 함수나 클래스)의 존재 이유는?
  - 수행 기능은?
  - 사용 방법은?
  
- 따로 주석이 필요하다면 의도를 분명히 드러내지 못했다는 말이다.


```java
int d; // 경과 시간(단위: 날짜)
```

이름 d는 아무 의미도 드러나지 않는다.

```java
int elapsedTimeInDays;
int daysSinceCreation;
int daysSinceModification;
int fileAgeInDays;
```

의도가 드러나는 이름을 사용하면 코드 이해와 변경이 쉬워진다.
<br>
<br>


#### **지뢰찾기 예시**
<br>

```java
public List<int[]> getThem() {
  List<int[]> list1 = new ArrayList<int[]>();
  for (int[] x : theList) {
    if (x[0] == 4)
      list1.add(x);
  }
  return list1;
}
```

위의 코드는 복잡한 문장도 없고 간단한 코드지만 무슨 일을 하는 것인지 짐작하기 어렵다. 문제는 코드의 단순성이 아니라 코드의 **함축성**이다.

만약 위의 코드가 지뢰찾기 게임을 위한 코드였고, theList가 게임판, 배열에서 0번째 값은 칸 상태를, 값 4는 깃발이 꽂힌 상태를 가리킨다. 아래와 같이 바꿔보자.

```java
public List<int[]> getFlaggedCells() {
  List<int[]> flaggedCells = new ArrayList<int[]>();
  for (int[] cell : gameBoard) {
      if (cell[STATUS_VALUE] == FLAGGED)
      flaggedCells.add(x);
  }
  return flaggedCells;
}
```

코드의 단순성은 동일하나 어떤 동작을 하는 코드인지 명확해졌다.int 배열을 사용하는 대신, 칸을 간단한 클래스로, isFlagged라는 명시적인 함수를 사용해 FLAGGED라는 상수를 감출수도 있겠다.

```java
public List<Cell> getFlaggedCells() {
  List<Cell> flaggedCells = new ArrayList<Cell>();
  for (Cell cell : gameBoard) {
      if (cell.isFlagged())
      flaggedCells.add(x);
  }
  return flaggedCells;
}
```

<br>

#### 그릇된 정보를 피하라

- 프로그래머는 코드에 그릇된 단서를 남겨서는 안된다.
  - 여러 계정을 그룹으로 묶을 때, 실제 List가 아니라면, accountList라 명명하지 않는다. 프로그래머에게 List라는 단어는 특수한 의미이다. 그러므로 accountGroup 아니면 단순히 Accounts라 명명한다.
  
- 서로 흡사한 이름을 사용하지 않도록 주의한다.
  - 유사한 개념은 유사한 표기법을 사용한다. 일관성이 떨어지는 표기법은 그릇된 정보이다.





