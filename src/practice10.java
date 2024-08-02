public class practice10 {
public static void main(String[] args) {
        String name="Jack Parker";
    name=name.toLowerCase();
        System.out.println(name);


  //   other question
        String text="To My Friend";
    text=text.replace(" ","_");
        System.out.println(text);

        String letter="Dear <|name|>, Thanks a lot";
        letter=letter.replace("name","Rohit");
        System.out.println(letter);

        String myString="This String contains double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

    }
}
