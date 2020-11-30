package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    int actual;
    int expected;

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
        radio.setVolume(100);
        radio.incVolume();
        int actual = radio.getVolume();
        int expected = 100;
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
        Radio radio = new Radio(20);
        radio.setStation(20);
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
        Radio radio = new Radio(30);
        radio.setStation(0);
        radio.prevStation();
        int actual = radio.getStation();
        int expected = 30;
        assertEquals(expected, actual);
    }

    //создание радиостанции с количеством станций по умолчанию
    @Test
    public void numOfStationsDefault() {
        Radio radio = new Radio();
        actual = radio.getNumOfStations();
        int expected = 10;
        assertEquals(expected, actual);
    }

    //создание радиостанции с произвольным количеством станций через конструктор
    @Test
    public void numOfStationsCobstructor() {
        Radio radio = new Radio(22);
        actual = radio.getNumOfStations();
        expected = 22;
        assertEquals(expected, actual);
    }

    //создание радиостанции с произвольным количеством станций вручную
    @Test
    public void numOfStations() {
        Radio radio = new Radio();
        radio.setNumOfStations(22);
        actual = radio.getNumOfStations();
        expected = 22;
        assertEquals(expected, actual);
    }

    //проверка выставления номера станции в пределах заданного диапазона
    @Test
    public void checkSetStation() {
        Radio radio = new Radio(35);
        radio.setStation(25);
        actual = radio.getStation();
        expected = 25;
        assertEquals(expected, actual);

    }







}
