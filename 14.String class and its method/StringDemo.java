public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String result = str1 + " " + str2;
        System.out.println(result); // Output: Hello World
        
        // Length
        int len = result.length();
        System.out.println(len); // Output: 11
        
        // Substring
        String subStr = result.substring(6);
        System.out.println(subStr); // Output: World
        
        // IndexOf
        int index = result.indexOf('o');
        System.out.println(index); // Output: 4
        
        // Equals
        boolean isEqual = str1.equals("hello");
        System.out.println(isEqual); // Output: false
        
        // ToUpperCase
        String upperCase = result.toUpperCase();
        System.out.println(upperCase); // Output: HELLO WORLD
        
        // ToLowerCase
        String lowerCase = result.toLowerCase();
        System.out.println(lowerCase); // Output: hello world
    }
}
