class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,5,12,3,1};
        int large = arr[0];
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>large) {
                large = arr[i];
            }
        }
        System.out.print(large);
    }
}
