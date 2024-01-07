package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * DemoService
 * 2024/1/6 18:04
 *
 * @author wangke
 */
@Service
public class DemoService {

    public String demo(List<String> nameList, Integer total) {
        if (Objects.isNull(nameList) || nameList.isEmpty()) {
            return null;
        }
        if (Objects.isNull(total)) {
            return null;
        }
        if (total == 1) {
            throw new RuntimeException("error");
        }
        if (total == 2) {
            throw new RuntimeException("error");
        }
        if (total == 3) {
            throw new RuntimeException("error");
        }
        if (total == 4) {
            throw new RuntimeException("error");
        }
        if (total == 5) {
            throw new RuntimeException("error");
        }
        if (total == 6) {
            throw new RuntimeException("error");
        }
        if (total == 7) {
            throw new RuntimeException("error");
        }
        if (total == 8) {
            throw new RuntimeException("error");
        }
        if (total == 9) {
            throw new RuntimeException("error");
        }
        if (total == 10) {
            throw new RuntimeException("error");
        }
        if (total == 11) {
            throw new RuntimeException("error");
        }
        if (total == 12) {
            throw new RuntimeException("error");
        }
        if (total == 13) {
            throw new RuntimeException("error");
        }
        if (total == 14) {
            throw new RuntimeException("error");
        }
        if (total == 15) {
            throw new RuntimeException("error");
        }
        if (total == 16) {
            throw new RuntimeException("error");
        }
        return "hello world";
    }
}
