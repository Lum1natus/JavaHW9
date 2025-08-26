package ru.netology.javaHW9;

public class Radio {

    private int currentFrequency;
    private int currentVolume;

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentFrequency(int newCurrentFrequency) {
        if (newCurrentFrequency < 0) {
            return;
        }
        if (newCurrentFrequency > 9) {
            return;
        }
        currentFrequency = newCurrentFrequency;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextFrequency() {
        if (currentFrequency < 9) {
            currentFrequency = currentFrequency + 1;
        } else {
            currentFrequency = 0;
        }
    }

    public void prevFrequency() {
        if (currentFrequency > 0) {
            currentFrequency = currentFrequency - 1;
        } else {
            currentFrequency = 9;
        }


    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void degreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;
        }
    }
}
