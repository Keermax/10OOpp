package org.example;

public class Radio {
    private int minChannel = 0;
    private int stationCount = 10;
    private int maxChannel = stationCount - 1;;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int soundVolume;

    public Radio() {

    }

    public Radio(int stationCount) {
        this.maxChannel = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minChannel) {
            return;
        }
        if (newCurrentStation > maxChannel) {
            return;
        }
        currentStation = newCurrentStation;
    }



    public void next() {
        if (currentStation == maxChannel) {
            currentStation = minChannel;
            return;
        }
        currentStation++;

    }

    public void prev() {
        if (currentStation == minChannel) {
            currentStation = maxChannel;
            return;
        }
        currentStation--;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void volumePlus() {
        if (soundVolume == maxVolume) {
            soundVolume = maxVolume;
            return;
        }
        soundVolume++;
    }
    public void volumeMinus() {
        if (soundVolume == minVolume) {
            soundVolume = minVolume;
            return;
        }
        soundVolume--;

    }
}
