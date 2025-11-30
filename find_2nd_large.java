class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,5,12,7,1};
        int fir_large = arr[0];
        int sec_large = arr[1];
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>fir_large) {
                sec_large = fir_large;
                fir_large = arr[i];
            }
            else if(arr[i]>sec_large && arr[i]<fir_large) {
                sec_large = arr[i];
            }
        }
        System.out.print("sec largest: "+sec_large);
    }
}
