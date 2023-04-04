package ex1;

public class Matematica {
    public static int soma(int v1, int v2){
        return v1+v2;
    }
    public static int soma(double v1, int v2){
        return (int) v1 + v2;
    }
    public static int soma(int v1, double v2){
        return v1 + (int) v2;
    }

}
