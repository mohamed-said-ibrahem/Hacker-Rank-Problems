#include <iostream>
#include <string>
using namespace std;

int main() {
    string first,second;
    int firstLength,secondLength;
    cin>>first>>second;
    firstLength = first.length();
    secondLength = second.length();
    cout<<firstLength<<" "<<secondLength<<endl;
    cout<<first+second<<endl;
    for(int i = 0;i < firstLength;i++){
        if(i==0){cout<<second[0];}
        else{cout<<first[i];}
    }
    cout<<" ";
    for(int j = 0;j < secondLength;j++){
        if(j==0){cout<<first[0];}
        else{cout<<second[j];}
    }
    return 0;
}
