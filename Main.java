import Assignment3.assignment3.Chain.*;
import Assignment3.assignment3.Command.*;
import Assignment3.assignment3.Iterator.*;
import Assignment3.assignment3.Mediator.*;
import Assignment3.assignment3.Memento.*;

public class Main {
    public static void main(String[] args) {
        // Chain
        PaymentHandler paymentMethods = new PaymentA();
        paymentMethods  .setNext(new PaymentB())
                        .setNext(new PaymentC());

        paymentMethods.handle(210);

        System.out.println();
        //Command
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand("TurnOn", new TurnOnCommand(television));
        remoteControl.setCommand("TurnOff", new TurnOffCommand(television));
        remoteControl.setCommand("VolumeUp", new VolumeUpCommand(television));
        remoteControl.setCommand("VolumeDown", new VolumeDownCommand(television));
        remoteControl.setCommand("NextChannel", new NextChannelCommand(television));
        remoteControl.setCommand("PrevChannel", new PreviousChannelCommand(television));

        remoteControl.buttonPressed("TurnOn");
        remoteControl.buttonPressed("VolumeUp");
        remoteControl.buttonPressed("NextChannel");
        remoteControl.buttonPressed("VolumeDown");
        remoteControl.buttonPressed("PrevChannel");
        remoteControl.buttonPressed("TurnOff");
        remoteControl.buttonPressed("Unknown Command");

        System.out.println();

        //Iterator
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection  .addMovie("Inception")
                        .addMovie("The Matrix")
                        .addMovie("Interstellar");

        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(3);
        arrayCollection .addMovie("The Godfather")
                        .addMovie("Pulp Fiction")
                        .addMovie("The Dark Knight");

        Iterator<String> listIterator = listCollection.createIterator();
        System.out.println("Movies from List:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        Iterator<String> arrayIterator = arrayCollection.createIterator();
        System.out.println("\nMovies from Array:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        System.out.println();

        //Mediator

        HomeMediator mediator = new HomeMediatorImpl();

        Sensor temperatureSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        temperatureSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        mediator.printReport();

        System.out.println();

        // Memento

        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.addText("Hello, world!");
        editor.showText();

        caretaker.save(editor);

        editor.addText(" sharshadym");
        editor.showText();

        caretaker.restore(editor);
        editor.showText();
    }
}