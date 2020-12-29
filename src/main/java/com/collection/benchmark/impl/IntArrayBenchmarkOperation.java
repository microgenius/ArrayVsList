package com.collection.benchmark.impl;

import com.collection.benchmark.ICollectionBenchmark;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 5, time = 1)
@Warmup(iterations = 5, time = 1)
@State(Scope.Benchmark)
public class IntArrayBenchmarkOperation implements ICollectionBenchmark<Integer[], Integer> {
  private Integer[] testData;

  @Setup
  public void initializeBenchmarkData() {
    this.testData = new Integer[]{1};
  }

  @Override
  @Benchmark
  public Integer[] measureForCreateCollectionWithMinSize() {
    return new Integer[1];
  }

  @Override
  @Benchmark
  public Integer[] measureForCreateCollectionWithAvgSize() {
    return new Integer[1000];
  }

  @Override
  @Benchmark
  public Integer measureForRandomAccess() {
    return this.testData[0];
  }

  @Override
  @Benchmark
  public void measureForChangeValue() {
    this.testData[0] = 2;
  }
}
