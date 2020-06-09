int main()
2.{
3. int N = 5; //배열의 길이
4. int i, j, temp;
5. int data[] = { 5, 3, 7, 9, 1 };
6.
7. // Bubble Sort
8. for (i = 0; i < N; i++) {
9. for (j = 0; j < N-(i+1); j++) {
10. if (data[j] > data[j+1]) {
11. // 자리교환
12. temp = data[j+1];
13. data[j+1] = data[j];
14. data[j] = temp;
15. }
16. }
17. }
18.}

출처: https://bowbowbow.tistory.com/10 [멍멍멍]
