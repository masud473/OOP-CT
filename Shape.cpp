
#include <iostream>
using namespace std;
class A
{
public:

   virtual void Show()
    {
        std::cout << "A:Show()\n";
    }
};

class B : public A
{
public:
    void Show()
    {
        std::cout << "B:Show()\n";
    }
};

class C : public B
{
public:
    void Show()
    {
        std::cout << "C:Show()\n";
    }
};

int main()
{
    A *a=new C();
    a->Show();

    return 0;
}
