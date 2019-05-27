package ru.geekbrains.lesson3;

public class Weather {

    private WeatherString weatherString;

    Weather(WeatherString weatherString) {
        this.weatherString = weatherString;
    }

    public String getText() {
        return String.format("%s, %s, %s",
                weatherString.getCityString(),
                weatherString.getTemperatureString(),
                weatherString.getVisibilityString());
    }
}
