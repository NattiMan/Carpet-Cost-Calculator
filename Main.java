public class Main{
    public static void main(String[] args) {
        Floor F1= new Floor(4,5);
        Carpet C1= new Carpet(1.25);
        Calculator home1= new Calculator(F1,C1);
        System.out.println("the total price of the house carpet coverage is given by "+ home1.gettotalCost());

        Floor F2= new Floor(6,9);
        Carpet C2= new Carpet(1.353);
        Calculator home2= new Calculator(F2,C2);
        System.out.println("the total price of the house carpet coverage is given by "+ home2.gettotalCost());



    }
}