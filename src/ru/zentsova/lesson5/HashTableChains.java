package ru.zentsova.lesson5;

public class HashTableChains {
  private int noOfBuckets;
  private Node[] hashTable;
  private static final int DEFAULT_CAPACITY = 10;

  public HashTableChains() {
    this.noOfBuckets = DEFAULT_CAPACITY;
    this.hashTable = (Node[]) new Object[DEFAULT_CAPACITY];
  }

  public HashTableChains(int capacity) {
    if (capacity > 0) {
      this.noOfBuckets = capacity;
      this.hashTable = new Node[capacity];
    }
  }

  public void addValue(int value) {
    int hashIndex = hashFunction(value);
    Node elem = hashTable[hashIndex];
    if (elem == null) {
      hashTable[hashIndex] = new Node(value);
    } else if (elem.data != value) {
      elem.next = new Node(value);
    }
  }

  public int findValue(int value) {
    int hashIndex = hashFunction(value);
    Node elem = hashTable[hashIndex];
    while (elem != null && elem.data != value) {
      elem = elem.next;
    }
    if (elem != null) {
      return elem.data;
    }
    return Integer.MAX_VALUE;
  }

  private int hashFunction(int value) {
    return value % noOfBuckets;
  }

  private class Node {
    private int data;
    private Node next = null;

    private Node(int data) {
      this.data = data;
    }
  }
}
