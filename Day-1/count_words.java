class count_words{
    public static void main(String[] args){
        String str="hello world this is a test";
        int count=0;
        String word []=str.trim().split("\\s+"); 
        for(int i=0;i<word.length;i++){ 
            if(!word[i].isEmpty()) {
                count++;
            }
        } 
        System.out.println("Number of words in the string: " + count);

        char ch =str.charAt(0);
        System.out.println(str.replace(ch, Character.toUpperCase(ch)));

        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
        System.out.println("String length: " + str.length());
        System.out.println("Starts with 'hello': " + str.startsWith("hello"));
        System.out.println("Ends with 'test': " + str.endsWith("test"));
        System.out.println("Index of 'world': " + str.indexOf("world"));
        System.out.println("Last index of 'is': " + str.lastIndexOf("is"));
        System.out.println("Contains 'this': " + str.contains("this"));
        System.out.println("is digit: " + Character.isDigit(ch));
        System.out.println("is letter: " + Character.isLetter(ch));
        System.out.println("is whitespace: " + Character.isWhitespace(ch));
        System.out.println("is uppercase: " + Character.isUpperCase(ch));
        System.out.println("is lowercase: " + Character.isLowerCase(ch));   
        System.out.println("is alphabetic: " + Character.isAlphabetic(ch));
        System.out.println("is letter or digit: " + Character.isLetterOrDigit(ch));
        System.out.println("is space: " + Character.isSpaceChar(ch));
        System.out.println("is title case: " + Character.isTitleCase(ch));
        System.out.println("concatenated string: " + str.concat(" - additional text"));
    }
}