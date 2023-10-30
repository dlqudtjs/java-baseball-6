package baseball.constant;

import static baseball.constant.Config.GAME_END_STATE;
import static baseball.constant.Config.GAME_RESTART_STATE;

public class Message {

    public static final String NOTHING = "낫싱";
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";
    public static final String PLAYER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String GAME_RESTART_MESSAGE = "게임을 새로 시작하려면 " + GAME_RESTART_STATE +
            ", 종료하려면 " + GAME_END_STATE + "를 입력하세요.";
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
}
