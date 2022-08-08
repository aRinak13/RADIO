public class Radio {

    //Память объекта Радио
    public int currentStation; //Текущая станция
    public int currentVolume; // Текущая громкость
    public int amountStation = 10 - 1; //Количество радиостанций

    //Конструктор кол-ва радиостанций
    public Radio(int amountStation) {
        this.amountStation = amountStation - 1;
    }

    //Конструктор
    public Radio() {
    }

    // Кол-во радиостанций
    public int getAmountStation() {

        return amountStation;
    }

    //Текущая станция
    public void setCurrentStation(int currentStation) {
        if (currentStation > amountStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    //Максимальная станция
    public void setToMaxStation() {

       currentStation = amountStation;
    }

    //Текущая громкость
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //Максимальная громкость
    public void setToMaxVolume() {

        currentVolume = 100;
    }

    //Переключение станции вперед
    public void nextStation() {
        if (currentStation < amountStation) {
            this.currentStation = currentStation + 1;
        } else this.currentStation = 0;
    }

    //Переключение станции назад
    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = amountStation;
    }

    //Увиличение громкости
    public void volumeUp() {
        if (currentVolume < 100) {
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