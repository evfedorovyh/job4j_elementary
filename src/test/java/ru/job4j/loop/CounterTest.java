package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.job4j.calculator.Fit;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    @DisplayName("When start=0, finish=10 then sum=55")
    void whenStart0AndFinish10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("When start=3, finish=8 then sum=33")
    void whenStart3AndFinish8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("When start=1, finish=1 then sum=1")
    void whenStart1AndFinish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("When start=10, finish=5 then sum=0")
    void whenStart10AndFinish5Then0() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("sumByEven. When start=0, finish=10 then sum=30")
    void sumByEvenWhenStart0AndFinish10Then30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("sumByEven. When start=3, finish=9 then sum=18")
    void sumByEvenWhenStart3AndFinish9Then18() {
        int start = 3;
        int finish = 9;
        int expected = 18;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("sumByEven. When start=2, finish=2 then sum=2")
    void sumByEvenWhenStart2AndFinish2Then2() {
        int start = 2;
        int finish = 2;
        int expected = 2;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("sumByEven. When start=-5, finish=7 then sum=6")
    void sumByEvenWhenStartMin5AndFinish7Then6() {
        int start = -5;
        int finish = 7;
        int expected = 6;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}