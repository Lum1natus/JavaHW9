package ru.netology.javaHW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {

    @Test
    public void shouldSetFrequency() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(3);

        int expected = 3;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequency1() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(-1);

        int expected = 0;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequency2() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(10);

        int expected = 0;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFrequencyTest() {
        Radio radio = new Radio();
        radio.nextFrequency(5);

        int expected = 6;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextUnderFrequencyTest() {
        Radio radio = new Radio();
        radio.nextFrequency(-10);

        int expected = 0;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAboveFrequencyTest() {
        Radio radio = new Radio();
        radio.nextFrequency(9);

        int expected = 0;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFrequencyTest() {
        Radio radio = new Radio();
        radio.prevFrequency(3);

        int expected = 2;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevAboveFrequencyTest() {
        Radio radio = new Radio();
        radio.prevFrequency(10);

        int expected = 9;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevUnderFrequencyTest() {
        Radio radio = new Radio();
        radio.prevFrequency(0);

        int expected = 9;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest() {
        Radio radio = new Radio();
        radio.increaseVolume(50);

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest2() {
        Radio radio = new Radio();
        radio.increaseVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAboveUpTest() {
        Radio radio = new Radio();
        radio.increaseVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest() {
        Radio radio = new Radio();
        radio.degreaseVolume(31);

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest2() {
        Radio radio = new Radio();
        radio.degreaseVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUnderDownTest() {
        Radio radio = new Radio();
        radio.degreaseVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}