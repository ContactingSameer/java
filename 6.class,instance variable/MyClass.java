public class MyClass {
    private int number;
    private String text;
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.setNumber(42);
        obj.setText("Hello, World!");
        int num = obj.getNumber();
        String str = obj.getText();
        System.out.println("Number: " + num);
        System.out.println("Text: " + str);
    }
}
