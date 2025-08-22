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
    public void shouldSetUnderFrequency() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(-1);

        int expected = 0;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveFrequency() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(10);

        int expected = 0;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFrequencyTest() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(5);
        radio.nextFrequency();

        int expected = 6;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAboveFrequencyTest() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(9);
        radio.nextFrequency();

        int expected = 0;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFrequencyTest() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(3);
        radio.prevFrequency();

        int expected = 2;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevAboveFrequencyTest() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(10);
        radio.prevFrequency();

        int expected = 9;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevUnderFrequencyTest() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(0);
        radio.prevFrequency();

        int expected = 9;
        int actual = radio.getCurrentFrequency();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAboveUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(31);
        radio.degreaseVolume();

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUnderDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.degreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}