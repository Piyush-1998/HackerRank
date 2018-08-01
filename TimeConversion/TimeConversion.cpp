#include<iostream>
#include <vector>
#include <string>

using namespace std;


void timeConversion(string s) {

	int hour = (s[0] - '0') * 10 + (s[1] - '0');

	if (s[8] == 'A')
	{
		if (hour == 12)
		{
			cout << "00";
			for (int i = 2; i < 8; i++)
				cout << s[i];
		}

		else {
			for (int i = 0; i < 8; i++)
				cout << s[i];
		}
	}
	else if (s[8] == 'P')
	{
		if (hour == 12)
		{
			cout << "12";
			for (int i = 2; i < 8; i++)
				cout << s[i];
		}
		else {
			hour = hour + 12;
			cout << hour;
			for (int i = 2; i < 8; i++)
				cout << s[i];
		}
	}
}

int main() {
	string s;
	cin >> s;
	timeConversion(s);
	return 0;
}



