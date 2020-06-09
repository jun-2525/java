	int main()
	{
		int arr_size = 5;
		int i,j,temp;
		int arr[] = {5, 4, 12, 10, 8};
	
		for ( i = 0 ; i < arr_size; i++){
			for( j = 0 ; j < arr_size - (i+1); j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					}
				}
			}
	}
