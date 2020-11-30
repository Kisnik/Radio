package ru.netology;

public class Radio {
    private int station;
    private int volume;
    private int numOfStations;

    public Radio() {
        numOfStations = 10;

    }

    public Radio(int numOfStations){

        this.numOfStations = numOfStations;
    }

    public int getNumOfStations() {
        return numOfStations;
    }

    public void setNumOfStations(int numOfStations) {
        this.numOfStations = numOfStations;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station > this.numOfStations) {
            this.station = 0;
            return;
        }
        if (station < 0) {
            this.station = this.numOfStations;
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    //следующая станция
    public void nextStation() {
        setStation(this.station + 1);
    }

    //предыдущая станция
    public void prevStation() {
        setStation(this.station - 1);
    }

    //увеличение громкости
    public void incVolume() {
        setVolume(this.volume + 1);
    }

    //уменьшение громкости
    public void decVolume() {
        setVolume(this.volume - 1);
    }

}
