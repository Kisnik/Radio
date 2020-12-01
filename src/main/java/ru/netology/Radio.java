package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int station;
    private int volume;
    private int numOfStations = 10;


    public Radio(int numOfStations) {

        this.numOfStations = numOfStations;
    }

    /*
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
    }*/

    //следующая станция
    public void nextStation() {
        if (this.station == this.numOfStations) {
            setStation(0);
        } else {
            setStation(this.station + 1);
        }
    }

    //предыдущая станция
    public void prevStation() {
        if (this.station == 0) {
            setStation(this.numOfStations);
        } else {
            setStation(this.station - 1);
        }
    }

    //увеличение громкости
    public void incVolume() {
        if (this.volume == 100) {
            return;
        }
        setVolume(this.volume + 1);
    }

    //уменьшение громкости
    public void decVolume() {
        if (this.volume == 0) {
            return;
        }
        setVolume(this.volume - 1);
    }

}
