package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * DemoController
 * 2024/1/6 18:04
 *
 * @author wangke
 */
//@AllArgsConstructor
@RestController
public class DemoController {

    private final static String NAME = "name";
    private static final String CONFIG = "config";

    @Autowired
    private DemoService demoService;
//    private final DemoService demoService;

    @GetMapping
    public String demo() {
        var name = NAME;
        var nameList = IntStream.range(1, 10).boxed()
                .map(i -> name + 1)
                .toList();
        var total = IntStream.range(1, 10).boxed()
                .reduce(0, (i1, i2) -> i1 + i2);
        return demoService.demo(nameList, total);
    }
}
