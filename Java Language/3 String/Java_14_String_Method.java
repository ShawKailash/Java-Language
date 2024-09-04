public class Java_14_String_Method {
    public static void main(String[] args) {
        String name = "kailash";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nontrimmedString="       kailash         ";
        System.out.println(nontrimmedString);
        System.out.println(nontrimmedString.trim());
        String trimmedString = nontrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(4));
        System.out.println(name.substring(1));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('k', 'm'));
        System.out.println(name.replace("kailash", "madhu"));
        System.out.println(name.startsWith("ka"));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("la",3));
        System.out.println(name.lastIndexOf("il"));
        System.out.println(name.lastIndexOf("sh",6));
        System.out.println(name.equals("kailash"));
        System.out.println(name.equals("Kailash"));
        System.out.println(name.equalsIgnoreCase("kailash"));
        System.out.println(name.equalsIgnoreCase("Kailash"));
        System.out.println("i am \" kailash");
        System.out.println("i am \\ kailash");
        System.out.println("i am \t kailash");
        System.out.println("i am \n kailash");
    }
}
