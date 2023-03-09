package org.example;

public class Radio {
    private int minChannelNumber;
    private int maxChannelNumber;
    private int CurrentStation;
    private int minVolume;
    private int maxVolume;

    private int soundVolume;

    public Radio() {
        maxChannelNumber = 9;
        minChannelNumber = 0;
        maxVolume = 100;
        minVolume = 0;
    }




    public int getCurrentStation() {
        return CurrentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minChannelNumber) {
            return;
        }
        if (newCurrentStation > maxChannelNumber) {
            return;
        }
        CurrentStation = newCurrentStation;
    }



    public void next() {
        if (CurrentStation == maxChannelNumber) {
            CurrentStation = minChannelNumber;
            return;
        }
        CurrentStation++;

    }

    public void prev() {
        if (CurrentStation == minChannelNumber) {
            CurrentStation = maxChannelNumber;
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
