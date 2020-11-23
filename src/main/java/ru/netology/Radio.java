package ru.netology;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station > 9) {
            station = 0;
            return;
        }
        if (station < 0) {
            station = 9;
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
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
