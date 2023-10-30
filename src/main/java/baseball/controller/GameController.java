package baseball.controller;

import static baseball.constant.Config.GAME_RESTART_STATE;

import baseball.model.Computer;
import baseball.model.Hint;
import baseball.model.Numbers;
import baseball.model.Player;
import baseball.validation.InputValidator;
import baseball.view.InputView;
import baseball.view.OutputView;


public class GameController {
    private final Computer computer;
    private final Player player;
    private final Hint hint;

    public GameController() {
        this.computer = new Computer();
        this.player = new Player();
        this.hint = new Hint();
    }

    public void gameStart() {
        OutputView.printGameStartMessage();

        do {
            progress();
        } while (isRestartState());
    }

    private void progress() {
        setComputerNumbers();
        Numbers computerNumbers = computer.getNumbers();

        while(true) {
            setPlayerNumbers();
            Numbers playerNumbers = player.getNumbers();

            if(compareNumbers(computerNumbers, playerNumbers)) {
                break;
            }
        }

        OutputView.printGameEndMessage();
    }

    private boolean isRestartState() {
        String input = InputView.inputRestartState();

        InputValidator.validateInputState(input);

        return input.equals(GAME_RESTART_STATE);
    }

    private boolean compareNumbers(Numbers computerNumbers, Numbers playerNumbers) {
        hint.setHindState(computerNumbers, playerNumbers);
        hint.displayHint();

        return hint.isCorrect();
    }

    private void setComputerNumbers() {
        computer.setRandomNumbers();
    }

    private void setPlayerNumbers() {
        String input = InputView.inputPlayerNumber();
        player.setPlayerNumbers(new Numbers(input));
    }
}
