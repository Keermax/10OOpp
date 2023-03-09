import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetFirstStation() {
        Radio station = new Radio();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldLastStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMax() {
        Radio station = new Radio();

        station.setCurrentStation(11);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMin() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldValidStations() {
        Radio station = new Radio();

        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldAfterLastStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationPlus() {
        Radio station = new Radio();

        station.setCurrentStation(8);
        station.next();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMinus() {
        Radio station = new Radio();

        station.setCurrentStation(7);
        station.prev();

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchStation() {
        Radio station = new Radio();
        for (int i = 0; i < 5; i++) {
            station.next();
        }

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextStation() {
        Radio station = new Radio();

        station.next();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeforeFirstStation() {
        Radio station = new Radio();

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMinVolume() {
        Radio volume = new Radio();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPlusVolume() {
        Radio volume = new Radio();

        volume.volumePlus();

        int expected = 1;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeValid() {
        Radio volume = new Radio();

        for (int i = 0; i < 5; i++) {
            volume.volumePlus();
        }

        int expected = 5;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeMaxLimit() {
        Radio volume = new Radio();

        for (int i = 0; i < 10; i++) {
            volume.volumePlus();
        }

        int expected = 10;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotPlusVolumeOverLimit() {
        Radio volume = new Radio();

        for (int i = 0; i < 101; i++) {
            volume.volumePlus();
        }

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusSoundVolume() {
        Radio volume = new Radio();

        volume.volumeMinus();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolumeValid() {
        Radio volume = new Radio();

        for (int i = 0; i < 3; i++) {
            volume.volumePlus();
        }
        for (int i = 0; i < 2; i++) {
            volume.volumeMinus();
        }

        int expected = 1;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
