#include <iostream>
#include <algorithm>
#include <vector>
#include <map>

using namespace std;

vector <int> missingNumbers(vector <int> arr, vector <int> brr) {

	vector<int> missingNumbers;

	map<int, int> count_first_arr;
	map<int, int> count_second_arr;

	for (int i = 0; i < arr.size(); i++)
		count_first_arr[arr[i]] = 0;

	for (int i = 0; i < arr.size(); i++)
		count_first_arr[arr[i]]++;

	for (int i = 0; i < brr.size(); i++)
		count_second_arr[brr[i]] = 0;

	for (int i = 0; i < brr.size(); i++)
		count_second_arr[brr[i]]++;


	for (int i = 0; i < arr.size(); i++)
	{
		if (count_first_arr[arr[i]] != count_second_arr[arr[i]])
			missingNumbers.push_back(arr[i]);
	}

	sort(missingNumbers.begin(), missingNumbers.end());

	for (int i = 0; i < missingNumbers.size() - 1; i++)
	{
		if (missingNumbers[i] == missingNumbers[i + 1])
		{
			missingNumbers.erase(missingNumbers.begin() + i);
			i--;
		}
	}

	return missingNumbers;
}

int main() {
	int n;
	cin >> n;
	vector<int> arr(n);
	for (int arr_i = 0; arr_i < n; arr_i++) {
		cin >> arr[arr_i];
	}
	int m;
	cin >> m;
	vector<int> brr(m);
	for (int brr_i = 0; brr_i < m; brr_i++) {
		cin >> brr[brr_i];
	}
	vector <int> result = missingNumbers(arr, brr);
	for (int i = 0; i < result.size(); i++) {
		cout << result[i] << (i != result.size() - 1 ? " " : "");
	}
	cout << endl;


	return 0;
}