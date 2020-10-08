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
}
