package slidingwindow.main01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Main03Test {

    @Test
    void 최대_매출() {
        int n = 10; // 매출 기록
        int k = 3; //일수
        int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};
        int max = 0;
        for (int i = 0; i < n-k+1; i++) {
            int tmp = 0;
            for (int j = i; j < k+i; j++) {
                tmp += arr[j];
            }
            if (tmp > max) max = tmp;
        }
        Assertions.assertThat(max).isEqualTo(56);
    }

}