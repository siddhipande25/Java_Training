class vowels{
    public static void main(String[] args) {
        String str = "Siddhi";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i'|| ch =='o'|| ch == 'u'||
            ch == 'A' || ch == 'E' || ch =='I'|| ch =='O'|| ch == 'U') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}