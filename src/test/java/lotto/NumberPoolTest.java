package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class NumberPoolTest {

    @Test
    @DisplayName("NumberPool에서 6개 숫자가 생성되는지 테스트")
    void countNumberTest() {
        assertThat(NumberPool.getInstance().getRandomNumbers().size()).isEqualTo(NumberPool.BALL_COUNT);
    }
}