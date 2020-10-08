package ru.netology;

public class Radio {
    private String name;
    private int maxVolume;
    private int minVolume;
    private int maxStaionIndex;
    private int minStationIndex;
    private int currentStation;
    private int currentVolume;
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

    public int getMaxStaionIndex(int i) {
        return maxStaionIndex;
    }

    public void setMaxStaionIndex(int maxStaionIndex) {
        this.maxStaionIndex = maxStaionIndex;
    }

    public int getMinStationIndex(int i) {
        return minStationIndex;
    }

    public void setMinStationIndex(int minStationIndex) {
        this.minStationIndex = minStationIndex;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setCurrentStation1(int currentStation) {
        if (currentStation < maxStaionIndex) {
            this.currentStation = currentStation;
        }
        if (currentStation <= maxStaionIndex) {
            return;
        }
    }

    public void setCurrentStation2(int currentStation) {
        if (currentStation > minStationIndex) {
            this.currentStation = currentStation;
        }
        if (currentStation == minStationIndex) {
            this.currentStation = 10;
        }
    }

    public void nextStation() {
        int nextStation = getCurrentStation() + 1;
        if (nextStation <= maxStaionIndex) {
            this.currentStation = nextStation;
        }
        if (nextStation > maxStaionIndex) {
            this.currentStation = 0;
        }
    }

    public void prevStation() {
        int prevStation = getCurrentStation() - 1;
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
        if (pultStation <= maxStaionIndex) {
            this.currentStation = pultStation;
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
