package Assignment3.assignment4.Template;

public abstract class QualityCheck {
    public final void checkQuality() {
        checkAppearance(); // Шаг 1: Проверка внешнего вида
        checkSpecifics();  // Шаг 2: Проверка специфических характеристик
        generateReport();   // Шаг 3: Заключительный отчёт
    }

    private void checkAppearance() {
        System.out.println("Проверка внешнего вида продукта...");
    }

    protected abstract void checkSpecifics(); // Шаг 2: Специфическая проверка

    private void generateReport() {
        System.out.println("Генерация заключительного отчёта...");
    }
}
