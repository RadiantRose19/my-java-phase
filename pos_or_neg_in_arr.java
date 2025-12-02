class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,5, -2,-5, 0, 10};
        int zero = 0;
        int positive = zero;
        int negative = zero;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0) positive++;
            else if(arr[i]<0) negative++;
             else if (arr[i]==0) zero++;
        }
        System.out.println("+ve: "+positive);
        System.out.println("-ve: "+negative);
        System.out.println("zero: "+zero);
        
    }
}
