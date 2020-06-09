    int arr[SIZE] = {3, 6, 2, 8, 1};
    int max, min;
    int i;

    max = arr[0];
    min = arr[0];

    for (i = 0; i < SIZE; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }

    printf("max = %d\n", max); // max = 
      printf("min = %d\n", min); // min = 1
