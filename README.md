# MVP
MVP 패턴 사용

- 모든 Model 이나 View를 변경할 때 Presenter을 거쳐야 변경 가능하다.
- Model이 View 를 직접적으로 Control 할 수 없다.
- MVC에서 Controller가 인터페이스로 바뀌고 Presenter 안에 View와 Model이 있다.
- Model이 View를 직접적으로 제어할 수 없게 만드는 패턴

장점
- 비슷한 종료의 activity가 생겼을 때 손쉽게 이식 가능
