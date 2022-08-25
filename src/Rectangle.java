public class Rectangle {

    private double width;
    private double height;

    double area;

    void setWidth(double width){
        this.width = width;
    }
    void setHeight(double height){
        this.height = height;
    }
    void setArea(double area) {
        this.area = width*height;
    }


    double getWidth() { return  width; }
    double getHeight() { return  height; }

    double getArea() { return area; }

}