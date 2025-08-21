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

    public void nextFrequency(int newNextFrequency) {
        if (newNextFrequency < 0) {
           currentFrequency = 0;
        }
        if (newNextFrequency < 9 && newNextFrequency >= 0) {
            currentFrequency = newNextFrequency + 1;
        }
        if (newNextFrequency >= 9) {
            currentFrequency = 0;
        }
    }

    public void prevFrequency(int newPrevFrequency) {
        if (newPrevFrequency > 9) {
            currentFrequency = 9;
        }
        if (newPrevFrequency >= 1 && newPrevFrequency <= 9) {
            currentFrequency = newPrevFrequency - 1;
        }
        if (newPrevFrequency <= 0) {
            currentFrequency = 9;
        }
    }

    public void increaseVolume(int newVolumeUp) {
        if (newVolumeUp < 0) {
            currentVolume = 0;
        }
        if (newVolumeUp < 100 && newVolumeUp > 0) {
            currentVolume = newVolumeUp + 1;
        }
        if (newVolumeUp >= 100) {
            currentVolume = 100;
        }
    }

    public void degreaseVolume(int newVolumeDown) {
        if (newVolumeDown > 100) {
            currentVolume = 100;
        }
        if (newVolumeDown > 0 && newVolumeDown <= 100) {
            currentVolume = newVolumeDown -1;
        }
        if (newVolumeDown <= 0) {
            currentVolume = 0;
        }
    }
}
