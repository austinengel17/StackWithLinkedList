public class Main {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.print();

        System.out.println(stack.pop() + "   |   ");

        stack.add(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
    }
}
