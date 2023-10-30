package baseball.model;

import baseball.validation.InputValidator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;

        validateNumbers(numbers);
    }

    public Numbers(String numbers) {
        List<Integer> parsedNumbers = parseToNumber(numbers);

        validateNumbers(parsedNumbers);

        this.numbers = parsedNumbers;
    }

    public List<Integer> getNumbers() {
        if(numbers.isEmpty()) {
            return null;
        }

        return numbers;
    }

    private List<Integer> parseToNumber(String numbers) {
        validateParsed(numbers);

        return Arrays.stream(numbers.split(""))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());
    }

    private void validateParsed(String numbers) {
        InputValidator.checkInputNumeric(numbers);
    }

    private void validateNumbers(List<Integer> numbers) {
        InputValidator.validateLength(numbers);
        InputValidator.validateRange(numbers);
        InputValidator.validateUniqueDigits(numbers);
    }
}
