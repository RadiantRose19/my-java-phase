class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,5,12,3,1};
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                System.out.println("even: "+arr[i]);
            }
            else if(arr[i]%2!=0) {
                System.out.println("odd: "+arr[i]);
            }
        }
    }
}
