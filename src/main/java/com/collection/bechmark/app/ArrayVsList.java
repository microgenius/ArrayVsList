package com.collection.bechmark.app;

import com.collection.benchmark.impl.IntArrayBenchmarkOperation;
import com.collection.benchmark.impl.IntListBenchmarkOperation;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class ArrayVsList {
    public static void main(String[] args) throws RunnerException {
        final Options benchmarkOptions = new OptionsBuilder()
            .include(IntListBenchmarkOperation.class.getSimpleName())
            .include(IntArrayBenchmarkOperation.class.getSimpleName())
            .forks(1)
            .build();

        new Runner(benchmarkOptions).run();
    }
}
