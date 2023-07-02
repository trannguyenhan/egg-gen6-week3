package ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected List<Double> edges;

    public Shape(){
        this.edges = new ArrayList<>();
    }


    public abstract Double calcCircuit();
    public abstract Double calcArea();

    public List<Double> getEdges() {
        return edges;
    }

    public void setEdges(List<Double> edges) {
        this.edges = edges;
    }
}
