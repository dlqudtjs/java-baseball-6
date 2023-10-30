package baseball.model;

import baseball.constant.Config;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class Computer {
    private Numbers numbers;

    public Numbers getNumbers() {
        return numbers;
    }

    public void setRandomNumbers() {
        Set<Integer> computerNumber = new HashSet<>();

        while(computerNumber.size() < Config.GAME_NUMBER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(Config.MIN_RANDOM_NUMBER, Config.MAX_RANDOM_NUMBER);

            computerNumber.add(randomNumber);
        }

        this.numbers = new Numbers(computerNumber.stream().toList());
    }
}
