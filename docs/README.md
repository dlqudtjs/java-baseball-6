# 미션 - 숫자 야구

## 기능 목록

- 사용자 값 확인 (올바르지 않을 경우, IllegalArgumentException 발생 후 종료)
    - 입력이 수로 이루어져 있는 지 확인
    - 입력이 서로 다른 수로 이루어져 있는 지 확인
    - 입력이 3자리가 맞는 지 확인

- Set을 활용하여 컴퓨터의 난수 생성

- 사용자가 입력한 문자열을 숫자로 변환하는 기능

- 사용자가 입력한 수와 컴퓨터의 난수를 비교
    - 입력한 수와 컴퓨터의 난수가 일치하는 지 확인 (맞다면 게임 종료)
    - 스트라이크 개수 확인
    - 볼 개수 확인
    - 스트라이크, 볼 둘 다 카운트가 0이라면 낫싱

- 게임 종료 후 재시작 여부 확인

### 처리
- IllegalArgumentException 발생 후 종료
