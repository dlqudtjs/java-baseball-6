package baseball.view;

import baseball.constant.Message;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputPlayerNumber() {
        System.out.print(Message.PLAYER_INPUT_MESSAGE);
        return Console.readLine();
    }

    public static String inputRestartState() {
        System.out.println(Message.GAME_RESTART_MESSAGE);
        return Console.readLine();
    }
}
