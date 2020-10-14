package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private String name = "noname";
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStationIndex = 10;
    private int minStationIndex = 0;
    private int currentStation;
    private int currentVolume;
    private int pultStation;
    private boolean on;


    public void nextStation() {
        int nextStation = getCurrentStation() +1;
        if (nextStation <= maxStationIndex) {
            this.currentStation = nextStation;
        }
        if (nextStation > maxStationIndex) {
            this.currentStation = 0;
        }
    }

    public void prevStation() {
        int prevStation = getCurrentStation() -1;
        if (prevStation >= minStationIndex) {
            this.currentStation = prevStation;
        }
        if (prevStation < minStationIndex) {
            this.currentStation = 10;
        }
    }

    public void pultStation(int pultStation) {
        if (pultStation >= minStationIndex) {
            this.currentStation = pultStation;
        }
        if (pultStation > maxStationIndex) {      // Т.к. на пульте можно из двух цифр набрать "10", то можно предположить, что можно набрать и любое другое двузначное число //
            this.currentStation = 10;
        }
        if (pultStation < minStationIndex) {
            this.currentStation = 0;
        }
    }

    public void increaseCurrentVolume() {
        int increasedVolume = getCurrentVolume() +1;
        if (increasedVolume <= maxVolume) {
            this.currentVolume = increasedVolume;
        }
        if (increasedVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseCurrentVolume() {
        int decreasedVolume = getCurrentVolume() -1;
        if (decreasedVolume >= minVolume) {
            this.currentVolume = decreasedVolume;
        }
        if (decreasedVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }
}
