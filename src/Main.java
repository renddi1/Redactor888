public class Main {

    public static void main(String[] args) {
        String value = "name";
        String[] arr = new String[10];
        Redactor redactor = new Redactor();

        System.out.println("Hello World!");
        arr = redactor.create(arr, value);
        redactor.read(arr);
    }
}