class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,5,12,7,1};
        int val= 12;
        
        for(int i=0;i<arr.length;i++) {
            if(val == arr[i]) System.out.print(val+ " is present");
            else System.out.print(val+ " not present");
        }
    }
}
