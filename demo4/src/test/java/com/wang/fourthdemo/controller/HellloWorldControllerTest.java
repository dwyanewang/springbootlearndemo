package com.wang.fourthdemo.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class HellloWorldControllerTest {

    @Test
    public void say() {
        assertEquals("hello world!!!",new HellloWorldController().say());
    }
}