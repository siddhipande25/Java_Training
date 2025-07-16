class prime{
    public static void main(String[] args) {
        for(int i = 21; i <= 40; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(i > 1 && isPrime) {
                System.out.println(i);
            }
        }
    }
}