public class Alphabet {
public Alphabet() {
for ( int i = 65; i < 91; i ++ ) {
System.out.println("Upper Case\n"+(char)i + " " + (char)(i+32));
}
}
public static void main(String [] args) {
new Alphabet();
}
}