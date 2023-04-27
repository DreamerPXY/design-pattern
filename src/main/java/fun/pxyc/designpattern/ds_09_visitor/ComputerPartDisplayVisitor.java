package fun.pxyc.designpattern.ds_09_visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("i can visit computer...");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("i can visit mouse...");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("i can visit keyboard...");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("i can visit monitor...");
    }
}
