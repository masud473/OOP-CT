#include <iostream>
using namespace std;
class A
{
public:
    void info()
    {
        cout << "Class A" << endl;
    }
};
class B
{
public:
    A *a = NULL;
    void info()
    {
        cout << "Class B" << endl;
    }
};
int main(int argc, char const *argv[])
{

    A a;

    {
        B b;
        b.a = &a;
        b.a->info();
    }
    a.info();
    return 0;
}
