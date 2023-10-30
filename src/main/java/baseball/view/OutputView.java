package baseball.view;

import baseball.constant.Message;

public class OutputView {

    public static void printGameStartMessage() {
        System.out.println(Message.GAME_START_MESSAGE);
    }

    public static void printGameEndMessage() {
        System.out.println(Message.GAME_END_MESSAGE);
    }

    public static void printHint(int strikeCount, int ballCount) {
        StringBuilder sb = new StringBuilder();

        if(ballCount == 0 && strikeCount == 0) {
            System.out.println(Message.NOTHING);
            return;
        }

        if(ballCount > 0) {
            sb.append(ballCount).append(Message.BALL);
            sb.append(" ");
        }

        if(strikeCount > 0) {
            sb.append(strikeCount).append(Message.STRIKE);
        }

        System.out.println(sb);
    }
}
