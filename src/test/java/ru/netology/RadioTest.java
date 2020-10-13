package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldInitFields() {

        assertEquals("noname", radio.getName());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(10, radio.getMaxStationIndex());
        assertEquals(0, radio.getMinStationIndex());
    }

    @Test
    void setCurrentVolume() {
        radio.getCurrentVolume();
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertFalse(radio.isOn());
    }

    @Test
    void decreaseCurrentVolume1() {
        radio.getMinVolume();
        radio.getMaxVolume();
        radio.setCurrentVolume(100);
        radio.decreaseCurrentVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume2() {
        radio.getMinVolume();
        radio.getMaxVolume();
        radio.setCurrentVolume(1);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume3() {
        radio.getMinVolume();
        radio.getMaxVolume();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume1() {
        radio.getMinVolume();
        radio.getMaxVolume();
        radio.setCurrentVolume(0);
        radio.increaseCurrentVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume2() {
        radio.getMinVolume();
        radio.getMaxVolume();
        radio.setCurrentVolume(99);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume3() {
        radio.getMinVolume();
        radio.getMaxVolume();
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void pultStation1() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.pultStation(10);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void pultStation2() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.pultStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void  pultStation3() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.pultStation(55);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void  pultStation4() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.pultStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextStation1() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void  nextStation2() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.setCurrentStation(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void  nextStation3() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation1() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.setCurrentStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation2() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.setCurrentStation(10);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void prevStation3() {
        radio.getMinStationIndex();
        radio.getMaxStationIndex();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }
}
