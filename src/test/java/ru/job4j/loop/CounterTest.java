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

}