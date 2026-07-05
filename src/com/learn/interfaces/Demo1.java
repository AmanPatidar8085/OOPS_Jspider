package com.learn.interfaces;

public interface Demo1 {
   void test();
    }
    class Sample1 implements Demo1{
        @Override
        public void test() {
            System.out.println("test implementation in class sample1");
        }
    }


