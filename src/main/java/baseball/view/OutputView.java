package baseball.view;

import baseball.constant.Message;

public class OutputView {

    public static void printGameStartMessage() {
        System.out.println(Message.GAME_START_MESSAGE);
    }

    public static void printGameEndMessage() {
        System.out.println(Message.GAME_END_MESSAGE);
    }
}
