package ru.zentsova.lesson5;

public class HashTableChains {
  private byte noOfBuckets;
  private Node[] hashTable;
  private static final byte DEFAULT_CAPACITY = 10;

  public HashTableChains() {
    this.noOfBuckets = DEFAULT_CAPACITY;
    this.hashTable =  new Node[DEFAULT_CAPACITY];
  }

  public HashTableChains(byte capacity) {
    if (capacity > 0) {
      this.noOfBuckets = capacity;
      this.hashTable = new Node[capacity];
    }
  }

  public void addValue(int value) {
    byte hashIndex = hashFunction(value);
    Node elem = hashTable[hashIndex];
    if (elem == null) {
      hashTable[hashIndex] = new Node(value);
    } else if (elem.data != value) {
      elem.next = new Node(value);
    }
  }

  public int findValue(byte value) {
    byte hashIndex = hashFunction(value);
    Node elem = hashTable[hashIndex];
    while (elem != null && elem.data != value) {
      elem = elem.next;
    }
    if (elem != null) {
      return elem.data;
    }
    return Byte.MAX_VALUE;
  }

  private byte hashFunction(int value) {
    return (byte) ((value << 1) % noOfBuckets);
  }

  private class Node {
    private int data;
    private Node next = null;
    private Node(int data) {
      this.data = data;
    }
  }
}
