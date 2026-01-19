
public class sentence
{
    public static void main(String[] args) {
        String sentence ;
        
        sentence = new String("Java is powerful language.");
        System.out.println(sentence);
        
        System.out.println(sentence.substring(8,16));
        
        System.out.println(sentence.replace("Java","Python"));
        
        System.out.println(sentence.startsWith("Java"));
        
        System.out.println(sentence.endsWith("."));
    }
}