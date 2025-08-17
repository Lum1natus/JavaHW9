import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {
    Radio radio = new Radio();

    @Test
    void nextFrequencyTest() {

        radio.currentFrequency = 1;
        int expected = 2;

        int actual = radio.nextFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void overNextFrequencyTest() {

        radio.currentFrequency = 9;
        int expected = 0;

        int actual = radio.nextFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevFrequencyTest() {

        radio.currentFrequency = 5;
        int expected = 4;

        int actual = radio.prevFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void overPrevFrequencyTest() {

        radio.currentFrequency = 0;
        int expected = 9;

        int actual = radio.prevFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeTest() {

        radio.currentVolume = 1;
        int expected = 2;

        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void overIncreaseVolumeTest() {

        radio.currentVolume = 100;
        int expected = 100;

        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void degreaseVolume() {

        radio.currentVolume = 99;
        int expected = 98;

        int actual = radio.degreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void overDegreaseVolume() {

        radio.currentVolume = 0;
        int expected = 0;

        int actual = radio.degreaseVolume();
        Assertions.assertEquals(expected, actual);
    }


}