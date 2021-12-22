package TrienKhaiStackSuDungLopLinkedListTrongThuVienJavaUtil;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
    }

    public void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3 Size of stack after pop operations: " + stack.size());
    }
}
