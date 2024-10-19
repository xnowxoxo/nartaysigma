package Assignment3.assignment4.Visitor;

public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for " + textFile.getName());
        // Логика генерации отчета
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for " + executableFile.getName());
        // Логика генерации отчета
    }
}
