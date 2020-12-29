package com.collection.benchmark.impl;

import com.collection.benchmark.ICollectionBenchmark;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 5, time = 1)
@Warmup(iterations = 5, time = 1)
@State(Scope.Benchmark)
public class IntListBenchmarkOperation implements ICollectionBenchmark<List<Integer>, Integer> {
  private List<Integer> testData;

  @Setup
  public void initializeTestData() {
    this.testData = new ArrayList<>();
    this.testData.add(1);
  }

  @Override
  @Benchmark
  public List<Integer> measureForCreateCollectionWithMinSize() {
    return new ArrayList<>(0);
  }

  @Override
  @Benchmark
  public List<Integer> measureForCreateCollectionWithAvgSize() {
    return new ArrayList<>(1000);
  }

  @Override
  @Benchmark
  public Integer measureForRandomAccess() {
    return this.testData.get(0);
  }

  @Override
  @Benchmark
  public void measureForChangeValue() {
    this.testData.set(0, 2);
  }
}
