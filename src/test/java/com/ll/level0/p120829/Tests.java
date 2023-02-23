package com.ll.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("70 입력시 1 반환 ")

    void t1(){
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91 입력시 3 반환")
    void t2(){
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("180 입력시 4 반환")
    void t3(){
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("90 입력시 2 반환")
    void t4(){
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }
}
