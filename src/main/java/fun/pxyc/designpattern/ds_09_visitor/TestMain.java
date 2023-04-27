package fun.pxyc.designpattern.ds_09_visitor;

public class TestMain {

    public static void main(String[] args) {


        Computer computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
