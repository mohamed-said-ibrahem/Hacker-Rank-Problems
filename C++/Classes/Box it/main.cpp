#include<bits/stdc++.h>

using namespace std;


class Box{
    private:
    int l,b,h;
    public:
    Box(){
        l = 0;
        b = 0;
        h = 0;
    }
    Box(int a,int d,int c){
        l = a;
        b = d;
        h = c;
    }
    Box(Box& B){
        l = B.l;
        b = B.b;
        h = B.h;
    }
    int getLength(){
        return l;
    }
    int getBreadth(){
        return b;
    }
    int getHeight(){
        return h;
    }
    long long CalculateVolume(){
        return (long)l*b*h;
    }
    bool operator<(Box& m){
        if(l<m.getLength()||(b<m.getBreadth()&&l==m.getLength())||
           (h<m.getHeight()&&l==m.getLength()&&b==m.getBreadth())){
            return true;
        }else{
            return false;
        }
    }
    friend ostream& operator<<(ostream& os, const Box& b){
    os << b.l << " " << b.b << " " << b.h;
    return os;
    }
};

void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}
