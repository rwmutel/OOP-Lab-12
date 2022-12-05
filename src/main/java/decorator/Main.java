package decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new CachedDocument("gs://oop-lab-12/kotyk.jpg");
        System.out.println(document.parse());


    }
}
