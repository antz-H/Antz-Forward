package com.antz.practice;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Practice1Test {

    @Test
    public void test() {

        Assertions.assertThat(Practice1.countMoney(4)).isEqualTo(10);
        Assertions.assertThat(Practice1.countMoney(10)).isEqualTo(37);
        Assertions.assertThat(Practice1.countMoney(20)).isEqualTo(96);

    }

    @Test
    public void test2() {

        Assertions.assertThat(Practice1.countMoney1(4)).isEqualTo(10);
        Assertions.assertThat(Practice1.countMoney1(10)).isEqualTo(37);
        Assertions.assertThat(Practice1.countMoney1(20)).isEqualTo(96);

    }


    @Test
    public void test3() {

        Assertions.assertThat(Practice1.countMoney2(4)).isEqualTo(10);
        Assertions.assertThat(Practice1.countMoney2(10)).isEqualTo(37);
        Assertions.assertThat(Practice1.countMoney2(20)).isEqualTo(96);

    }

    @Test
    public void test4() {

        Assertions.assertThat(Practice1.countMoney3(4)).isEqualTo(10);
        Assertions.assertThat(Practice1.countMoney3(8)).isEqualTo(30);
        Assertions.assertThat(Practice1.countMoney3(10)).isEqualTo(37);
        Assertions.assertThat(Practice1.countMoney3(20)).isEqualTo(96);

    }

    @Test
    public void test5() {

        Assertions.assertThat(Practice1.countByTailRecursion(4)).isEqualTo(10);
        Assertions.assertThat(Practice1.countByTailRecursion(8)).isEqualTo(30);
        Assertions.assertThat(Practice1.countByTailRecursion(10)).isEqualTo(37);
        Assertions.assertThat(Practice1.countByTailRecursion(20)).isEqualTo(96);

    }


    @Test
    public void test6() {

      //  Assertions.assertThat(Practice1.countByTailRecursion2(4)).isEqualTo(10);
       // Assertions.assertThat(Practice1.countByTailRecursion2(8)).isEqualTo(30);
       // Assertions.assertThat(Practice1.countByTailRecursion2(10)).isEqualTo(37);
        Assertions.assertThat(Practice1.countByTailRecursion2(20)).isEqualTo(96);

    }
}
