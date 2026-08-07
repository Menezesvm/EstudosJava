package Entities;

public class Retangulo {

    public double Weidth;
    public double Height;

    public double Area(){
        return Weidth * Height;
    }
    public double Perimeter(){
        return 2 * (Weidth + Height);
    }

    public double Diagonal(){
        return Math.sqrt(Height * Height + Weidth * Weidth);
    }
}
