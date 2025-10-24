#include <iostream>
using namespace std;
class Shape
{
public:
    virtual void draw() {}
};
class Circle : public Shape
{

public:
    void draw()
    {
        cout << "Circle";
    }

    static double area(double radius)
    {
        return 3.1416 * radius * radius;
    }
    static int area(int radius)
    {
        return 3.1416 * radius * radius;
    }
};
int main()
{
    Shape *s = new Shape();
    s->draw();
    s = new Circle();
    s->draw();
    cout<<Circle::area(24.489);
}