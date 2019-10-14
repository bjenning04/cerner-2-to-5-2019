// cerner_2^5_2019
// Simple example in C++
#include <iostream>
using namespace std;

class Rectangle {
private:
    int width;
    int height;
public:
    Rectangle(int x, int y): width(x), height(y) {};
    int area();
};

int Rectangle::area() {
    return width * height;
}

int main(int argc, const char * argv[]) {
    Rectangle *rect = new Rectangle(3, 4);
    cout << "area: " << rect->area() << "\n";
    return 0;
}