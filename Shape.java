class Shape {
    int getCorner() {
        return 4;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 0;
    }

    int getCornerParent() {
        return super.getCorner();
    }
}
