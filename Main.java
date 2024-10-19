package Assignment3;

import Assignment3.assignment3.Chain.*;
import Assignment3.assignment3.Command.*;
import Assignment3.assignment3.Iterator.*;
import Assignment3.assignment3.Mediator.*;
import Assignment3.assignment3.Memento.*;
import Assignment3.assignment4.Observer.*;
import Assignment3.assignment4.State.*;
import Assignment3.assignment4.Strategy.*;
import Assignment3.assignment4.Template.*;
import Assignment3.assignment4.Visitor.*;

public class Main {
    public static void main(String[] args) {
        // Chain
        PaymentHandler paymentMethods = new PaymentA();
        paymentMethods.setNext(new PaymentB()).setNext(new PaymentC());
        paymentMethods.handle(210);

        System.out.println();

        // Command
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

        // Iterator
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Inception")
                .addMovie("The Matrix")
                .addMovie("Interstellar");

        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(3);
        arrayCollection.addMovie("The Godfather")
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

        // Mediator
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

        System.out.println();

        // Observer
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю
        newsPublisher.addSubscriber(smartphoneSubscriber);
        newsPublisher.addSubscriber(laptopSubscriber);
        newsPublisher.addSubscriber(tabletSubscriber);

        // Публикуем несколько новостей
        newsPublisher.publishNews("Спорт", "Новая статья о футбольном матче.");
        newsPublisher.publishNews("Наука", "Исследование о новых IT технологиях.");
        newsPublisher.publishNews("Общие", "Обновление на портале новостей.");

        System.out.println();

        // State
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();

        System.out.println();

        // Strategy
        Order order1 = new Order(9999, new CardPaymentStrategy());
        System.out.println("Card Payment: " + order1.calculateFinalPrice());

        Order order2 = new Order(9999, new WalletPaymentStrategy());
        System.out.println("Wallet Payment: " + order2.calculateFinalPrice());

        Order order3 = new Order(9999, new CashOnDeliveryStrategy());
        System.out.println("Cash on Delivery: " + order3.calculateFinalPrice());

        System.out.println();

        // Template Method
        QualityCheck foodCheck = new FoodQualityCheck();
        foodCheck.checkQuality();  // Проверка качества продуктов питания

        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        electronicsCheck.checkQuality();  // Проверка качества электроники

        System.out.println();

        // Visitor
        File textFile = new TextFile("document.txt");
        File executableFile = new ExecutableFile("program.exe");

        Visitor antivirusVisitor = new AntivirusVisitor();
        textFile.accept(antivirusVisitor);
        executableFile.accept(antivirusVisitor);

        System.out.println();

        Visitor reportVisitor = new ReportVisitor();
        textFile.accept(reportVisitor);
        executableFile.accept(reportVisitor);
    }
}
