package baseball.validation;

import baseball.constant.Config;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValidator {

    public static void validateLength(List<Integer> numbers) {
        if (numbers.size() != Config.GAME_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateUniqueDigits(List<Integer> numbers) {
        Set<Integer> deduplicatedNumbers = new HashSet<>(numbers);

        if(deduplicatedNumbers.size() != numbers.size()) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateRange(List<Integer> numbers) {
        for(Integer number : numbers) {
            if(number < Config.MIN_RANDOM_NUMBER || number > Config.MAX_RANDOM_NUMBER) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void validateInputState(String input) {
        if(!(input.equals(Config.GAME_RESTART_STATE) || input.equals(Config.GAME_END_STATE))) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkInputNumeric(String input) {
        for(char c : input.toCharArray()) {
            if(!Character.isDigit(c)) {
                throw new IllegalArgumentException();
            }
        }
    }
}
