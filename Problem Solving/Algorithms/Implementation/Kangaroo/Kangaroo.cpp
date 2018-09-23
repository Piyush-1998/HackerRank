#include <iostream>
#include <string>

using namespace std;

string kangaroo(int x1, int v1, int x2, int v2) {

	int first_kang = x1;
	int sec_kang = x2;


	int prev_diff = abs(first_kang - sec_kang);
	int next_diff = -1;
	while (next_diff < prev_diff)
	{
		first_kang = first_kang + v1;
		sec_kang = sec_kang + v2;
		next_diff = abs(first_kang - sec_kang);
		if (next_diff == 0)
			return "YES";
	}
	return "NO";
}

int main() {
	int x1;
	int v1;
	int x2;
	int v2;
	cin >> x1 >> v1 >> x2 >> v2;
	string result = kangaroo(x1, v1, x2, v2);
	cout << result << endl;
	return 0;
}

