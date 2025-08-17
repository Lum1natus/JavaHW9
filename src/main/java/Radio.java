public class Radio {

    public int currentFrequency;
    public int currentVolume;

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int degreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        return currentVolume;
    }

    public int nextFrequency() {
        if (currentFrequency < 9) {
            currentFrequency++;
        } else {
            currentFrequency = 0;
        }
        return currentFrequency;
    }


    public int prevFrequency() {
        if (currentFrequency > 0) {
            currentFrequency--;
        } else {
            currentFrequency = 9;
        }
        return currentFrequency;
    }

}
