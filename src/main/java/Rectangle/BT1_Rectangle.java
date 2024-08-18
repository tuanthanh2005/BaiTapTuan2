/*

 */
package Rectangle;

/**
 *
 * @author ADMIN
 */
public class BT1_Rectangle {

        private double length;
        private double width;

    public BT1_Rectangle() {
        length =1;
        width=2;
    }             

    public BT1_Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double findArea(){
        double kq= length*width;
        return kq;
    } 
    public double findPerimeter(){
        double kq = (length+width)*2;
        return kq;
    }
    
    }


