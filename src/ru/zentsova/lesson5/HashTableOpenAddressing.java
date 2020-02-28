package ru.zentsova.lesson5;

public class HashTableOpenAddressing {
  private int size;
  private int capacity;
  private Value[] hashTable;
  private static final byte DEFAULT_SIZE = 10;

  public HashTableOpenAddressing() {
    this.size = DEFAULT_SIZE;
    this.capacity = 0;
    this.hashTable =  new Value[DEFAULT_SIZE];
  }

  public HashTableOpenAddressing(int size) {
    if (size > 0) {
      this.size = size;
      this.capacity = 0;
      this.hashTable = new Value[size];
    }
  }

  private byte hashFunction(int value) {
    return (byte) ((value << 1) % size);
  }

  /**
   * Добавить элемент
   */
  public void addValue(int value) {
    byte hashIndex = hashFunction(value);
    if (capacity != size) {
      if (hashTable[hashIndex] == null && hashTable[hashIndex].isDeleted) {
        hashTable[hashIndex] = new Value(value);
        capacity++;
        return;
      }
      for (byte i = (byte) (hashIndex + 1); i < size; i++) {
        if (hashTable[i] == null && hashTable[hashIndex].isDeleted) {
          hashTable[i] = new Value(value);
          capacity++;
          return;
        }
      }
      for (byte i = 0; i < hashIndex; i++) {
        if (hashTable[i] == null && hashTable[hashIndex].isDeleted) {
          hashTable[i] = new Value(value);
          capacity++;
          return;
        }
      }
    }
  }

  /**
   * Получить индекс элемента. Ячейку пометить как удаленную.
   */
  public byte getValueIndex(int value) {
    byte hashIndex = hashFunction(value);
    Value val = hashTable[hashFunction(value)];
    if (val != null && val.val == value) {
      val.isDeleted = true;
      capacity--;
      return hashIndex;
    }
    for (byte i = (byte) (hashIndex + 1); i < size; i++) {
      val = hashTable[i];
      if (val != null && !val.isDeleted && hashTable[i].val == value) {
        val.isDeleted = true;
        capacity--;
        return i;
      }
    }
    for (byte i = 0; i < hashIndex; i++) {
      val = hashTable[i];
      if
      (val != null && !val.isDeleted && hashTable[i].val == value) {
        val.isDeleted = true;
        capacity--;
        return i;
      }
    }
    return Byte.MIN_VALUE;
  }

  private class Value {
    private int val;
    private boolean isDeleted = false;
    private Value(int val) {
      this.val = val;
    }
  }
}
