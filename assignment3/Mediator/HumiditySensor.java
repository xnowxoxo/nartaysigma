package Assignment3.assignment3.Mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void sendData() {
        String data = "Humidity: 55%"; // Пример данных
        System.out.println(data);
        ((HomeMediatorImpl) mediator).addReport(data);
    }
}
