package ru.zentsova.lesson2;

/**
 * Стэк на основе массива
 */
public class StackArray {
  private int[] array;
  private int topIndex;
  private int capacity;

  public StackArray(int capacity) throws Exception {
    if (capacity <= 0)
      throw new Exception("Can not create an array. Length of array must not equal zero or less than zero");

    this.array = new int[capacity];
    this.capacity = capacity;
    this.topIndex = -1;
  }

  /**
   * Вставить новый элемент
   *
   * @param element элемент, который необходимо вставить
   */
  public void push(int element) throws Exception {
    if (topIndex != capacity - 1) {
      array[++topIndex] = element;
    } else {
      throw new Exception("Stack overflow");
    }
  }

  /**
   * Удалить элемент
   */
  public int pop() throws Exception {
    if (topIndex != -1)
      return array[topIndex--];

    throw new Exception("Stack is empty");
  }

}
