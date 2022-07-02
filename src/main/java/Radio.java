public class Radio {

    //Память объекта
    public int currentStation; //Текущая станция
    public int currentVolume; // Текущая громкость

    //Текущая станция
    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    //Максимальная станция
    public void setToMaxStation() {
        currentStation = 9;
    }

    //Текущая громкость
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //Максимальная громкость
    public void setToMaxVolume() {
        currentVolume = 10;
    }

    //Переключение станции вперед
    public void nextStation() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        } else this.currentStation = 0;
    }

    //Переключение станции назад
    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = 9;
    }

    //Увиличение громкости
    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    //Уменьшение громкости
    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}