/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include<vector>
using namespace std;

void rotate(vector <int>& arr){
	int first = arr[0];
	for(int i=1; i<arr.size(); i++){
		arr[i-1] = arr[i];
	}
	arr[arr.size()-1] = first;
}


void rotateLeft(int d, vector<int>& arr) {
	for(int i=0; i<d; i++){
		rotate(arr);
	}
}

int main()
{
    int n,d;
    cin >> n >> d;
    
    
    vector<int> arr;
    for(int i=0; i<n; i++){
        int tmp;
        cin >> tmp;
        arr.push_back(tmp);
    }
    
    rotateLeft(d,arr);
    //rotate(arr);
    for(vector<int>::iterator p = arr.begin(); p != arr.end(); p++){
    	cout << *p << endl;
    }
    
    
    return 0;
}

