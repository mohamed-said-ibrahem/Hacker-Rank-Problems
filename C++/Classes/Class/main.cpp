#include <iostream>
#include <sstream>
using namespace std;

class Student{
    private:
        int age;
        string first;
        string last;
        string str;
        int stand;
    public:
        int get_age(){
            return age;
        }
        string get_last_name(){
            return last;
        }
        int get_standard(){
            return stand;
        }
        string get_first_name(){
            return first;
        }
        void set_age(int number){
            age = number;
        }
        void set_standard(int number){
            stand = number;
        }
        void set_first_name(string name){
            first = name;
        }
        void set_last_name(string name){
            last = name;
        }
        string to_string(){
            str = std::to_string(age) + ',' + first + ',' + last + ',' + std::to_string(stand);

            return str;
        }
};

int main() {
    int age, standard;
    string first_name, last_name;

    cin >> age >> first_name >> last_name >> standard;

    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);

    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    cout << st.to_string();

    return 0;
}
