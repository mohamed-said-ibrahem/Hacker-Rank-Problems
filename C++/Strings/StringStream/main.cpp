#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
    vector<int> test;
    string word;
    char ch;
    stringstream ss(str);
    int length = str.length();
    int counter = 0;
    for(int i = 0 ;i < length;i++){
        if(str.at(i)==','){
            counter++;
        }
    }
    counter++;
    for(int j = 0;j <counter;j++){
        int change;
        ss>>change;
        test.push_back(change);
        if(j!=(counter-1)){
            ss>>ch;
        }
    }
    return test;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }

    return 0;
}
