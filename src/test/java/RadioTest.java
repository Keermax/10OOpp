import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio station = new Radio();
    Radio volume = new Radio();
    @Test
    public void shouldSetFirstStation() {

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldLastStation() {

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMax() {

        station.setCurrentStation(11);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMin() {

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldValidStations() {

        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldAfterLastStation() {

        station.setCurrentStation(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationPlus() {

        station.setCurrentStation(8);
        station.next();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMinus() {

        station.setCurrentStation(7);
        station.prev();

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchStation() {
        for (int i = 0; i < 5; i++) {
            station.next();
        }

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextStation() {

        station.next();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeforeFirstStation() {

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMinVolume() {

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPlusVolume() {

        volume.volumePlus();

        int expected = 1;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeValid() {

        for (int i = 0; i < 5; i++) {
            volume.volumePlus();
        }

        int expected = 5;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeMaxLimit() {

        for (int i = 0; i < 100; i++) {
            volume.volumePlus();
        }

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotPlusVolumeOverLimit() {

        for (int i = 0; i < 101; i++) {
            volume.volumePlus();
        }

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusSoundVolume() {

        volume.volumeMinus();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolumeValid() {

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
