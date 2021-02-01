#include <iostream>

using namespace std;

int main()
{
    int n;
  cin>>n;

    for( int i = 1 ; i <=n; i++ )
    {
        for( int j = 1 ; j <=n; j++ )
            std::cout << i + (j == 1+((n-1)*(i%2))) ?  (i%2)*1 : 0;

        std::cout << "\n";
    }

    return 0;
}