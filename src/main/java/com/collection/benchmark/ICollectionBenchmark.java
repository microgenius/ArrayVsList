package com.collection.benchmark;

public interface ICollectionBenchmark<CollectionType, DataType> {
  CollectionType measureForCreateCollectionWithMinSize();

  CollectionType measureForCreateCollectionWithAvgSize();

  DataType measureForRandomAccess();

  void measureForChangeValue();
}
