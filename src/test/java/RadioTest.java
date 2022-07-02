import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void maxValueStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.currentStation;

        assertEquals(expected, actual);

    }

    @Test
    public void switchStationForwardAtMaxValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtCurrentValue8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtMinValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtMaxValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtCurrentValue8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtMinValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void switchStationBackAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void maxValueVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);

    }

    @Test
    public void switchVolumeForwardAtMaxValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.volumeUp();

        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtCurrentValue9() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.volumeUp();

        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtMinValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeUp();

        int expected = 1;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeForwardAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeUp();

        int expected = 2;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtMaxValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.volumeDown();

        int expected = 9;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtCurrentValue8() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.volumeDown();

        int expected = 8;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtMinValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void switchVolumeBackAtCurrentValue1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void minValueStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

    @Test
    public void minValueVoluem() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
}