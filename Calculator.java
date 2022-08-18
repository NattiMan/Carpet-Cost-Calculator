public class Calculator {
    private Floor floor;
    private Carpet carpet;
    private double totalCost;
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double gettotalCost(){
        return floor.getArea()* carpet.getCost();


    }
}
