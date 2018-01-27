package Observer;

public class App {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,60,30);
        weatherData.setMeasurements(80,6999,200);

    }
}
