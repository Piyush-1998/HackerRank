#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

vector <int> closestNumbers(vector <int> arr) {

	vector<int> temp_arr;

	sort(arr.begin(), arr.begin() + arr.size());

	int min_diff = abs(arr[1] - arr[0]);
	for (int i = 2; i < arr.size() - 1; i++)
	{
		if (abs(arr[i + 1] - arr[i]) < min_diff)
			min_diff = abs(arr[i + 1] - arr[i]);
	}

	for (int i = 0; i < arr.size(); i++)
	{
		if (abs(arr[i + 1] - arr[i]) == min_diff)
		{
			temp_arr.push_back(arr[i]);
			temp_arr.push_back(arr[i + 1]);
		}
	}

	sort(temp_arr.begin(), temp_arr.begin() + temp_arr.size());

	return temp_arr;
}

int main() {
	int n;
	cin >> n;
	vector<int> arr(n);
	for (int arr_i = 0; arr_i < n; arr_i++) {
		cin >> arr[arr_i];
	}
	vector <int> result = closestNumbers(arr);
	for (int i = 0; i < result.size(); i++) {
		cout << result[i] << (i != result.size() - 1 ? " " : "");
	}
	cout << endl;


	return 0;
}
