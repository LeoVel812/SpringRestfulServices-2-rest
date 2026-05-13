package com.lv.rest.filtering;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public SomeBean filtering() {
        return new SomeBean("val1", "val2", "val3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> filteringList() {
        return List.of(new SomeBean("val1", "val2", "val3"),
                new SomeBean("val11", "val22", "val33"),
                new SomeBean("val111", "val222", "val333"));
    }

    @GetMapping("/filtering-with-view")
    @JsonView(View.View1.class)//field1, field3
    public SomeBean filteringWithView() {
        return new SomeBean("val1", "val2", "val3");
    }

    @GetMapping("/filtering-list-with-view")
    @JsonView(View.View2.class)//field2, field3
    public List<SomeBean> filteringListWithView() {
        return List.of(new SomeBean("val1", "val2", "val3"),
                new SomeBean("val11", "val22", "val33"),
                new SomeBean("val111", "val222", "val333"));
    }
}
