# 기능 요구 사항

## 초간단 자동차 경주 게임을 구현한다.

- [ ] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
  - [ ] 자동차는 주어진 횟수 동안 동작한다.
  - [ ] 자동차는 n대가 있다.
  - [x] 자동차는 전진할 수 있다.
  - [x] 자동차는 정지할 수 있다.
- [ ] 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
  - [x] 각 자동차는 이름을 가질 수 있다.
  - [ ] 전진하는 자동차는 이름을 전진하는 동작(-)과 함께 이름을 출력한다.
- [ ] 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다. 
  - [ ] 자동차 이름을 쉼표(,)를 기준으로 구분할 수 있다.
  - [x] 자동차 이름을 5자 이하만 가능하다.
- [ ] 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
    - [ ] 조건은 0 ~ 9 사이의 무작위 값이다.
    - [ ] 무작위 값이 4이상일 때 자동차는 전진하는 조건을 가진다.
    - [ ] 무작위 값이 3이하일 때 자동차는 정지하는 조건을 가진다.
- [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
  - [ ] 주어진 횟수를 진행하면 게임은 완료된다.
  - [ ] 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
  - [ ] 여러 명의 우승자를 쉼표(,)로 구분할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

# 입출력 요구사항

## 입력

- [x] 경주 할 자동차의 이름을 입력 받는다.
   - 예시: pobi,woni,jun  
- [x] 시도할 횟수를 입력 받는다.
  - 예시: 5


## 출력

- [x] 자동차 입력 안내 메시지를 출력한다.
  - 메시지: 경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
- [x] 시도할 횟수 입력 안내 메시지를 출력한다.
  - 메시지: 시도할 횟수는 몇 회인가요?
- [ ] 실행 결과를 출력한다.
  - [ ] 실행 결과 안내 메시지를 출력한다.
    - 메시지: 실행 결과
  - [ ] 각 차수별 실행 결과를 출력한다.
- [ ] 우승 안내문을 출력한다.
  - [ ] 단독 우승자 안내 문구
    - 최종 우승자 : pobi
  - [ ] 공동 우승자 안내 문구
    - 최종 우승자 : pobi, jun



