package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetLimitCurrentChannel() {

        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        int expected = 7;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetOverLimitCurrentChannel() {

        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUnderLimitCurrentChannel() {

        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetLowerRangeCurrentChannel() {

        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUpperRangeCurrentChannel() {

        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetLimitNextChannel() {

        Radio radio = new Radio();

        radio.setCurrentChannel(2);

        radio.nextChannel();

        int expected = 3;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);

    }

    @Test
    void shouldSetOverNextChannel() {

        Radio radio = new Radio();

        radio.setCurrentChannel(9);

        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);

    }

    @Test
    void shouldSetLimitPrevChannel() {

        Radio radio = new Radio();

        radio.setCurrentChannel(9);

        radio.prevChannel();

        int expected = 8;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUnderLimitPrevChannel() {

        Radio radio = new Radio();

        radio.setCurrentChannel(0);

        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetLimitCurrentVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetOverLimitCurrentVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(12);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUnderLimitCurrentVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInLimit() {

        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverLimit() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInLimit() {

        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}