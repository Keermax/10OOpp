package org.example;

public class Radio {

    public int CurrentStation;
    public int soundVolume;



    public int getCurrentStation() {
        return CurrentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        CurrentStation = newCurrentStation;
    }



    public void next() {
        if (CurrentStation == 9) {
            CurrentStation = 0;
            return;
        }
        CurrentStation++;

    }

    public void prev() {
        if (CurrentStation == 0) {
            CurrentStation = 9;
            return;
        }
        CurrentStation--;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void volumePlus() {
        if (soundVolume == 10) {
            soundVolume = 10;
            return;
        }
        soundVolume++;
    }
    public void volumeMinus() {
        if (soundVolume == 0) {
            soundVolume = 0;
            return;
        }
        soundVolume--;

    }

}
