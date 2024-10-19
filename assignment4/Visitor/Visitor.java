package Assignment3.assignment4.Visitor;

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
