public class CharacterSearchExample {
    public static void main(String[] args) {
        String str = "GeeksforGeeks is a computer science portal";

                int firstIndex = str.indexOf('s');
        System.out.println("First occurrence of char 's' is found at index: " + firstIndex);

        
        int lastIndex = str.lastIndexOf('s');
        System.out.println("Last occurrence of char 's' is found at index: " + lastIndex);

                char charAtIndex = str.charAt(10);
        System.out.println("Character at index 10: " + charAtIndex);
    }
}
