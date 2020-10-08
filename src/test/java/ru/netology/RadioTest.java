package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldGetandSet() {
        Radio radio = new Radio();
        String expected = "бумбокс";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();

        radio.getCurrentVolume();
        assertEquals(0, radio.getMaxVolume(10));
        assertEquals(0, radio.getMinVolume(0));
        assertFalse(radio.isOn());
    }

    @Test
    void decreaseCurrentVolume1() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume2() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(1);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume3() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume1() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);
        radio.increaseCurrentVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume2() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume3() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void pultStation1() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        int pultStation = 0;
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void pultStation2() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        int pultStation = 5;
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void  pultStation3() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        int pultStation = 9;
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void nextStation1() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        radio.setCurrentStation1(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void  nextStation2() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        radio.setCurrentStation1(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void  nextStation3() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        radio.setCurrentStation1(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevStation1() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        radio.setCurrentStation2(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation2() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        radio.setCurrentStation2(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void prevStation3() {
        Radio radio = new Radio();

        radio.setMinStationIndex(0);
        radio.setMaxStationIndex(9);
        radio.setCurrentStation2(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
}
