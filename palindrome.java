class Main {
    public static void main(String[] args) {
        int val = 121;
        int rev = 0;
        int temp = val;
        
        while (val>0) {
            int dig = val%10;
            rev = rev*10+dig;
            val = val/10;
        }
        if(temp==rev) System.out.print("palidrome");
        else System.out.print("not palidrome");
        
    }
}
