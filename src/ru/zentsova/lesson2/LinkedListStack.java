package ru.zentsova.lesson2;

/**
 * Стэк на основе односвзного списка
 */
public class LinkedListStack<T> {
  private Node<T> bottom;

  /**
   * Вставить новый элемент
   *
   * @param data элемент, который необходимо вставить
   */
  public void push(T data) {
    Node<T> node = new Node<>(data);
    node.nextNode = bottom;
    bottom = node;
  }

  /**
   * Удалить элемент
   */
  public T pop() throws Exception {
    if (bottom == null)
      throw new Exception("Stack is empty");

    Node<T> oldFirst = bottom;
    bottom = bottom.nextNode;
    return oldFirst.data;
  }

  private class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node(T data) {
      this.data = data;
      this.nextNode = null;
    }
  }

}
