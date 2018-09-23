#include <iostream>
#include <vector>

using namespace std;

void insertionSort(int n, vector <int> arr) {

	for (int i = n - 1; i >= 0; i--)
	{
		int key = arr[i];
		int j = i - 1;
		int numberofchanges = 0;
		while (j >= 0 && arr[j] > key)
		{
			arr[j + 1] = arr[j];
			for (int i = 0; i < n; i++)
				cout << arr[i] << " ";
			cout << endl;
			j--;
			numberofchanges++;
		}
		arr[j + 1] = key;
		if (numberofchanges != 0)
		{
			for (int i = 0; i < n; i++)
				cout << arr[i] << " ";
			cout << endl;
		}
	}
}

int main() {
	int n;
	cin >> n;
	vector<int> arr(n);
	for (int arr_i = 0; arr_i < n; arr_i++) {
		cin >> arr[arr_i];
	}
	insertionSort(n, arr);
	return 0;
}


