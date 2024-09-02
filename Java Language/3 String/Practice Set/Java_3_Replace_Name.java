// write a java program tofill in a letter template
// which looks like below :
// letter = "dear <|name|> , thanks a lot";
// replace <|name|> with a string (same name);

public class Java_3_Replace_Name {
    public static void main(String[] args) {
        String letter = "dear <|name|> , thanks a lot";
        letter = letter.replace("<|name|>", "kailash");
        System.out.println(letter);
    }
}
