package Assignment3.Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors = new ArrayList<>();
    private StringBuilder report = new StringBuilder();

    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public void collectData() {
        report.setLength(0); // Сбросить отчет
        for (Sensor sensor : sensors) {
            sensor.sendData();
        }
    }

    @Override
    public void printReport() {
        System.out.println("Sensor Report: ");
        System.out.println(report.toString());
    }

    public void addReport(String data) {
        report.append(data).append("\n");
    }
}
