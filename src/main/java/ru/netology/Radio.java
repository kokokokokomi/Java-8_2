package ru.netology;

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

    public Radio() {
    }

    public Radio(String name, int maxVolume, int minVolume, int maxStationIndex, int minStationIndex, int currentStation, int currentVolume, int pultStation, boolean on) {
        this.name = name;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxStationIndex = maxStationIndex;
        this.minStationIndex = minStationIndex;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.pultStation = pultStation;
        this.on = on;
    }

    public Radio(int maxVolume, int minVolume, int maxStationIndex, int minStationIndex) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxStationIndex = maxStationIndex;
        this.minStationIndex = minStationIndex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public void setMinVolume(int minVolume) { this.minVolume = minVolume; }
    public int getMaxStationIndex() {
        return maxStationIndex;
    }
    public void setMaxStationIndex(int maxStationIndex) {
        this.maxStationIndex = maxStationIndex;
    }
    public int getMinStationIndex() {
        return minStationIndex;
    }
    public void setMinStationIndex(int minStationIndex) {
        this.minStationIndex = minStationIndex;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
    public int getPultStation() {
        return pultStation;
    }
    public void setPultStation(int pultStation) {
        this.pultStation = pultStation;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }


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
