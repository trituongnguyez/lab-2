package iuh.cntt.ktpm;
/**
 * @description: Lop nay mo ta hinh chu nhat voi chieu dai va chieu rong, cung cap cac phuong thuc tinh dien tich va chu vi.
 * @author: Nguyễn Trí Tường
 * @version: 1.0
 * @created: 03-Sep-2025 1:09:00 PM
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải >= 0");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật: chiều dài = " + length + ", chiều rộng = " + width +
               ", chu vi = " + getPerimeter() + ", diện tích = " + getArea();
    }
}


