package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseBallGame {
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int RANDOM_NUMBER_LENGTH = 3;
    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String PLAYER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";

    public void gameStart() {
        printStartMessage();

        while(true) {
            progress();
        }
    }

    public void progress() {
        List<Integer> computerNumbers = getRandomNumber();
        List<Integer> playerNumbers;

        while(true) {
            playerNumbers = getPlayerNumber();

        }
    }

    private List<Integer> getPlayerNumber() {
        printPlayerInputMessage();
        return inputPlayerNumber();
    }

    private List<Integer> inputPlayerNumber() {
        String playerInput = Console.readLine();
        List<Integer> playerNumbers = parseToNumberList(playerInput);

        validateInput(playerNumbers);

        return playerNumbers;
    }

    private void validateInput(List<Integer> input) {
        if(!isUniqueDigits(input) || !isValidLength(input)) {
            throw new IllegalArgumentException();
        }
    }

    private List<Integer> parseToNumberList(String convertValue) {
        if(!isNumeric(convertValue)) {
            throw new IllegalArgumentException();
        }

        return Arrays.stream(convertValue.split(""))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());
    }

    private void printPlayerInputMessage() {
        System.out.println(PLAYER_INPUT_MESSAGE);
    }

    private void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    private List<Integer> getRandomNumber() {
        Set<Integer> computerNumber = new HashSet<>();

        while(computerNumber.size() < RANDOM_NUMBER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            computerNumber.add(randomNumber);
        }

        return computerNumber.stream().toList();
    }

    private boolean isNumeric(String input) {
        for(char c : input.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    private boolean isUniqueDigits(List<Integer> numbers) {
        Set<Integer> deduplicatedNumbers = new HashSet<>(numbers);

        return deduplicatedNumbers.size() == numbers.size();
    }

    private boolean isValidLength(List<Integer> numbers) {
        return numbers.size() == RANDOM_NUMBER_LENGTH;
    }
}
