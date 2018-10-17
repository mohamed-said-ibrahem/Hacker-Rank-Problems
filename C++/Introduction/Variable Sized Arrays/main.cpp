#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    vector<int> arr[100000];
    int n,q,k,number,a,b;
    cin>>n>>q;
    for(int i = 0; i < n; i++){
        cin>>k;
        for(int j=0; j < k; j++){
            cin>>number;
         arr[i].push_back(number);
        }
    }
    for(int k = 0; k < q; k++){
        cin>>a>>b;
        cout<<arr[a][b]<<endl;
    }
    return 0;
}
