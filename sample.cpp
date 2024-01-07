#include <iostream>
#include <vector>
#include <string>

using namespace std;

string findLexicographicalMinimum(int n, string s) {
    vector<int> last(26, -1);

    for (int i = 0; i < n; i++) {
        int c = s[i] - 'a';
        if (last[c] != -1) {
            for (int j = last[c] + 1; j <= i; j++) {
                s[j] = s[last[c]];
            }
        }
        last[c] = i;
    }

    cout << "Output: " << s << endl; // Print the output
    return s;
}

int main() {
    int n = 5;
    string s = "abbbb";
    cout << findLexicographicalMinimum(n, s) << endl; // This will print and return "abbbd"
    return 0;
}