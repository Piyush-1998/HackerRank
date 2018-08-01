#include <iostream>
#include <string>

using namespace std;

string super_reduced_string(string s) {

	for (int i = 0; i < s.size() - 1; i++)
	{
		if (s[i] == s[i + 1])
		{
			s.erase(s.begin() + i);
			s.erase(s.begin() + i);
			i = -1;
		}
		if (s.size() == 0)
			return "Empty String";
	}

	return s;
}

int main() {
	string s;
	cin >> s;
	string result = super_reduced_string(s);
	cout << result << endl;
	return 0;
}

