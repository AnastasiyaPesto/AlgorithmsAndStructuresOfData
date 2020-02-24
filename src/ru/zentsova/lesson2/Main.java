package ru.zentsova.lesson2;

public class Main {
  public static void main(String[] args) throws Exception {
    LinkedListStack<String> stack = new LinkedListStack<>();
    stack.push("первый");
    stack.push("второй");
    stack.push("третий");

    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
  }
}
