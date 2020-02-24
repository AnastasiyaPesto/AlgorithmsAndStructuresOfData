package ru.zentsova.lesson5;

public class HashTableMain {
  public static void main(String[] args) {
    HashTableChains hashTableChains = new HashTableChains(3);
    hashTableChains.addValue(8);
    hashTableChains.addValue(13);
    hashTableChains.addValue(15);
    hashTableChains.addValue(3);
  }
}
