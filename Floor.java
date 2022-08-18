//public class Floor {
//
//    private double width;
//    private double length;
//
//    public Floor(double width, double length ){
//        if(width < 0){
//            this.width=0;
//        }else{
//            this.width = width;
//        }
//        if (length < 0) {
//            this.length = 0;
//        }else {
//            this.length = length;
//        }
//    }
//    public double getArea() {
//        return this.width* this.length;
//    }
//}
public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length){
        if(width > 0 && length < 0){
            this.width = width;
            this.length = 0.0;
        }else if(width < 0 && length > 0){
            this.width = 0.0;
            this.length = length;
        }else if(width < 0 && length < 0){
            this.width = width;
            this.length = length;
        }else{
            this.width = width;
            this.length = length;
        }
    }

    public double getArea(){
        return this.width * this.length;
    }

}