package Assignment3.assignment3.Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void sendData() {
        String data = "Temperature: 22°C"; // Пример данных
        System.out.println(data);
        ((HomeMediatorImpl) mediator).addReport(data);
    }
}
