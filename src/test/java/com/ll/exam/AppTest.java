package com.ll.exam;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

}

class HashMapTest {
    @Test
    void 클래스가_존재한다() {
        HashMap map = new HashMap();
    }
    @Test
    void 제너릭이_가능하다() {
        HashMap<String, Integer> map = new HashMap<>();
    }
    @Test
    void put() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
    }
    @Test
    void get() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        int age = ages.get("철수");

        assertEquals(22, age);
    }
    @Test
    void _2nd_get() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        ages.put("영희", 25);
        assertEquals(22, ages.get("철수"));
        assertEquals(25, ages.get("영희"));
    }
    @Test
    void put__데이터_수정() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        ages.put("영희", 25);
        ages.put("영희", 27);

        assertEquals(27, ages.get("영희"));
    }
    @Test
    void remove() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        assertEquals(1, ages.size());

        ages.put("영희", 25);
        assertEquals(2, ages.size());

        ages.remove("영희");

        assertEquals(1, ages.size());

        ages.remove("철수");
        assertEquals(0, ages.size());
    }
}

class 사람 {
    private String name;

    public 사람(String name) {
        this.name = name;
    }

    void 말하다() {
        System.out.println("사람이 말합니다.");
    }
}

class 원숭이 {
    private String name;

    public 원숭이(String name) {
        this.name = name;
    }

    void 묘기를_부리다() {
        System.out.println("원숭이가 묘기를 부립니다.");
    }
}