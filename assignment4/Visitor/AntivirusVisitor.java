package Assignment3.assignment4.Visitor;

public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning " + textFile.getName() + " for forbidden words.");
        // Логика проверки на запрещенные слова
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning " + executableFile.getName() + " for malware.");
        // Логика проверки на вредоносный код
    }
}
