public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation !=9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolum) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 0) {
            return;
        }
        this.currentVolume = currentVolum;
    }

    public void nextStation() {
        if (currentStation >= 9) {
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;
        }

    public void maxCurrentStation() {
        currentStation = 9;
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = 9;
            return;
        }
        currentStation = currentStation - 1;
    }
    
}
