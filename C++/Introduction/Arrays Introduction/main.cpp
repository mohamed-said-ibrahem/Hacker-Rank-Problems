#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,number;
    cin>>n;
    int arr[n]={};
    for(int i = 0;i < n;i++){
       cin>>number;
        arr[i] = number;
    }
    for(int j = n-1; j >= 0; j--){
            cout<<arr[j];
        if(n!=0){
            cout<<" ";
        }
    }
    return 0;
}
