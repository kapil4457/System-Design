package Polymorphism;

interface Shape {
    double calculateArea();
}


class Circle implements Shape{
    double radius;

    Circle(double _radius){
        this.radius = _radius;
    }

    public double calculateArea(){return Math.PI * radius * radius};
}


class Rectangle implements Shape{
    double length, width;

    Rectangle(double _length, double _width){
        this.length= _length;
        this.width = _width;
    }

    public double calculateArea(){return length * width};
}






