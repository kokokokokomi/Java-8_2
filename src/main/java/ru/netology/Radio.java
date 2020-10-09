package ru.netology;

public class Radio {
    private String name;
    private int maxVolume;
    private int minVolume;
    private int maxStationIndex;
    private int minStationIndex;
    private int currentStation;
    private int currentVolume;
    private int pultStation;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume(int i) {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public  int getMinVolume(int i) {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void setMaxStationIndex(int maxStaionIndex) {
        this.maxStationIndex = maxStaionIndex;
    }


    public void setMinStationIndex(int minStationIndex) {
        this.minStationIndex = minStationIndex;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) { this.currentStation = currentStation; }

    public boolean isOn() {
        return on;
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
            this.currentStation = 9;
        }
    }

    public void pultStation(int pultStation) {
        if (pultStation >= minStationIndex) {
            this.currentStation = pultStation;
        }
        if (pultStation <= maxStationIndex) {
            this.currentStation = pultStation;
        }
        if (pultStation > maxStationIndex) {
            this.currentStation = 0;
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
