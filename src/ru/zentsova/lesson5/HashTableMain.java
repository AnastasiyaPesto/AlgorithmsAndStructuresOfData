package ru.zentsova.lesson5;

public class HashTableMain {
  public static void main(String[] args) {
    HashTableOpenAddressing hashTable = new HashTableOpenAddressing(4);
    hashTable.addValue(7);
    hashTable.addValue(8);
    hashTable.addValue(9);
    hashTable.addValue(9);
    hashTable.addValue(10);

    hashTable.getValueIndex(7);
    hashTable.getValueIndex(9);
  }
}
