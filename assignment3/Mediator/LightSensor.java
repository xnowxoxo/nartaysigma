package Assignment3.assignment3.Mediator;

public class LightSensor implements Sensor {
    private HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void sendData() {
        String data = "Light: 300 Lux"; // Пример данных
        System.out.println(data);
        ((HomeMediatorImpl) mediator).addReport(data);
    }
}
