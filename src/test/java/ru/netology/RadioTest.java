package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //увеличение громкости без достижения максимального значения
    @Test
    public void incVolumeNotMax() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.incVolume();
        int actual = radio.getVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    //увеличение свыше максимальной громкости
    @Test
    public void incVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.incVolume();
        int actual = radio.getVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    //уменьшение громкости без достижения минимального значения
    @Test
    public void decVolumeNotMin() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.decVolume();
        int actual = radio.getVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    //уменьшение ниже минимальной громкости
    @Test
    public void incVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decVolume();
        int actual = radio.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    //переключение на следующую станцию без перехода от последней к первой
    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();
        int actual = radio.getStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    //переключение на следующую станцию с переходом от последней к первой
    @Test
    public void nextStationMax() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        int actual = radio.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    //переключение на предыдущую станцию без перехода от первой к последней
    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.prevStation();
        int actual = radio.getStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    //переключение на предыдущую станцию с переходом от первой к последней
    @Test
    public void prevStationMin() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();
        int actual = radio.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }


}