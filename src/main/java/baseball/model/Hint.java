package baseball.model;

import baseball.constant.Config;
import baseball.view.OutputView;
import java.util.List;

public class Hint {

    private int strikeCount = 0;
    private int ballCount = 0;

    public void setHindState(Numbers computerNumbers, Numbers playerNumbers) {
        setBallCount(computerNumbers.getNumbers(), playerNumbers.getNumbers());
        setStrikeCount(computerNumbers.getNumbers(), playerNumbers.getNumbers());
    }

    public void displayHint() {
        OutputView.printHint(strikeCount, ballCount);
    }

    private void setBallCount(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        this.ballCount = 0;

        for (int i = 0; i < Config.GAME_NUMBER_LENGTH; i++) {
            int playerNumber = playerNumbers.get(i);

            if (!computerNumbers.get(i).equals(playerNumber) && computerNumbers.contains(playerNumber)) {
                this.ballCount++;
            }
        }
    }

    private void setStrikeCount(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        this.strikeCount = 0;

        for (int i = 0; i < Config.GAME_NUMBER_LENGTH; i++) {
            if (computerNumbers.get(i).equals(playerNumbers.get(i))) {
                this.strikeCount++;
            }
        }
    }

    public boolean isCorrect() {
        return strikeCount == Config.GAME_NUMBER_LENGTH;
    }
}
