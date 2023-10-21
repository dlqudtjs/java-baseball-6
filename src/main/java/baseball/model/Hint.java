package baseball.model;

import java.util.List;

public class Hint {

    private static final int RANDOM_NUMBER_LENGTH = 3;

    public Hint() {
    }

    private int getBallCount(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        int ballCount = 0;

        for(int i = 0; i < RANDOM_NUMBER_LENGTH; i++) {
            int playerNumber = playerNumbers.get(i);

            if (!computerNumbers.get(i).equals(playerNumber) && computerNumbers.contains(playerNumber)) {
                ballCount++;
            }
        }

        return ballCount;
    }
}
