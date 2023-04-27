package fun.pxyc.designpattern.ds_09_visitor;

public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
