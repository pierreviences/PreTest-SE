package no7;

class Square {
    private int side;
    public void setSide (int s){ 
        this.side = s;
    }
    public int getArea(){ 
        return this.side*this.side;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        int side = 5;
        Square sq= new Square();
        sq.setSide (side);
        System.out.print(sq.getArea());
    }

    
}
