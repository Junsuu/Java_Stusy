package com.study.java;

import com.sun.tools.javac.util.List;
import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.awt.*;
import java.util.*;
import java.util.Arrays;

public class wildcardex {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
        List<String> list = new ArrayList<String>();
        List
    }
}
