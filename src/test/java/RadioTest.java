import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void parametersRadio() {
        Radio radio = new Radio(13);

        assertEquals(12, radio.getAmountStation());
    }

    @Test
    public void maxValueStationYesC() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(radio.getAmountStation());

        radio.setToMaxStation();

        int expected = 12;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void maxValueStationNoC() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getAmountStation());

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchStationForwardAtMaxValueYesC() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(radio.getAmountStation());

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtMaxValueNoC() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getAmountStation());

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtCurrentValue8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtCurrentValue11() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(11);

        radio.nextStation();

        int expected = 12;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtMinValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtMaxValueYesC() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(radio.getAmountStation());

        radio.prevStation();

        int expected = 11;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtMaxValueNoC() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getAmountStation());

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtCurrentValue8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtCurrentValue11() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(11);

        radio.prevStation();

        int expected = 10;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtMinValueNoC() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtMinValueYesC() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 12;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxValueVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void switchVolumeForwardAtMaxValue100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtCurrentValue99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtCurrentValue98() {
        Radio radio = new Radio();

        radio.setCurrentVolume(98);

        radio.volumeUp();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtCurrentValue50() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        radio.volumeUp();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtMinValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeUp();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtMaxValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeDown();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtCurrentValue99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.volumeDown();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtMinValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minValueStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void minValueVoluem() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}