class SearchAnElementInArray {

    // N is a Length of arr.
    // X is a number which you want to search in arr.
	
    static int search(int arr[], int N, int X) {
        for(int i=0; i<N; i++){
  	    if(X==arr[i]){
            return i;
        }
    }
    return -1;
}