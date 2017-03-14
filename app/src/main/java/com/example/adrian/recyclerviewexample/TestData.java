package com.example.adrian.recyclerviewexample;

import com.example.adrian.recyclerviewexample.model.SampleDataViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian_Czigany on 3/14/2017.
 */

public class TestData {

    public static List<SampleDataViewModel> getTestData() {
        List<SampleDataViewModel> list = new ArrayList<SampleDataViewModel>();
        list.add(new SampleDataViewModel(1, "test1", "TEST1"));
        list.add(new SampleDataViewModel(2, "test2", "TEST2"));
        list.add(new SampleDataViewModel(3, "test3", "TEST3"));
        list.add(new SampleDataViewModel(4, "test4", "TEST4"));
        list.add(new SampleDataViewModel(5, "test5", "TEST5"));
        list.add(new SampleDataViewModel(6, "test6", "TEST6"));
        return list;
    }

}
