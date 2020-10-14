package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio("radio", 100, 0, 10, 0, 5, 50, 5, true);
        assertEquals("radio", radio.getName());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(10, radio.getMaxStationIndex());
        assertEquals(0, radio.getMinStationIndex());
        assertEquals(5, radio.getCurrentStation());
        assertEquals(50, radio.getCurrentVolume());
        assertEquals(5, radio.getPultStation());
        assertTrue(radio.isOn());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.getCurrentVolume();
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertFalse(radio.isOn());
    }

    @Test
    void decreaseCurrentVolume1() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentVolume(10);
        radio.decreaseCurrentVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume2() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentVolume(1);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume3() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume1() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentVolume(0);
        radio.increaseCurrentVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume2() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentVolume(99);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolume3() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void pultStation1() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.pultStation(10);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void pultStation2() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.pultStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void  pultStation3() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.pultStation(55);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void  pultStation4() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.pultStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextStation1() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void  nextStation2() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentStation(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void  nextStation3() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation1() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation2() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentStation(10);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void prevStation3() {
        Radio radio = new Radio(100, 0, 10, 0);
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }
}
