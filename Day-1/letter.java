class letter {
    public static void main(String[] args) {
        String str = "sidDhI123 ";
        int count = 0;
        try {
            for (int i = 0; ; i++) {
                char ch = str.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') && (ch != '0' && ch != '9')) {
                    count++;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Loop terminates when the end of the string is reached.
        }
        System.out.println("Number of letters and numbers in the string: " + count);
    }
}
