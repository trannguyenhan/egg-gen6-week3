package ex1;

public class Triangle extends Shape{
    public Triangle(){
        this(0.0, 0.0, 0.0);
    }

    public Triangle(Double edge1, Double edge2, Double edge3){
        super();
        this.edges.add(edge1);
        this.edges.add(edge2);
        this.edges.add(edge3);
    }

    @Override
    public Double calcCircuit() {
        if(this.edges.size() < 3){
            return 0.0;
        }

        return this.edges.get(0) + this.edges.get(1) + this.edges.get(2);
    }

    @Override
    public Double calcArea() {
        Double s = this.calcCircuit() / 2;
        if(s == 0){
            return 0.0;
        }

        return Math.sqrt(s * (s - this.edges.get(0)) * (s - this.edges.get(1)) * (s - this.edges.get(2)));
    }
}
