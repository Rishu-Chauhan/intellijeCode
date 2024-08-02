public class practice09 {
    public static void main(String[] args) {
        String name="Rishu";
        System.out.println(name);
        int value=name.length();
        System.out.println(value);

        String lString=name.toLowerCase();
        System.out.println(lString);

        String uString=name.toUpperCase();
        System.out.println(uString);

        String nonTrimmedString="  Rishu  ";
        System.out.println(nonTrimmedString);
        String trimmedString=nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,3));

        System.out.println(name.replace('u','i'));

        System.out.println(name.startsWith("Ri"));

        System.out.println(name.startsWith("hu"));
    }
}
