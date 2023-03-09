package org.example;

public class Radio {
    private int minChannel;
    private int maxChannel;
    private int CurrentStation;
    private int minVolume;
    private int maxVolume;

    private int soundVolume;

    public Radio() {
        maxChannel = 9;
        minChannel = 0;
        maxVolume = 100;
        minVolume = 0;
    }

    public int getCurrentStation() {
        return CurrentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minChannel) {
            return;
        }
        if (newCurrentStation > maxChannel) {
            return;
        }
        CurrentStation = newCurrentStation;
    }



    public void next() {
        if (CurrentStation == maxChannel) {
            CurrentStation = minChannel;
            return;
        }
        CurrentStation++;

    }

    public void prev() {
        if (CurrentStation == minChannel) {
            CurrentStation = maxChannel;
            return;
        }
        CurrentStation--;
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
