package com.study.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample_9 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/tisquare/git/Java_Stusy/Java_Stusy");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> System.out.println(p.getFileName()));
		//p = 서브 디렉토리 또는 파일에 해당하는 Path 객체
		//p.getFileName() = 서브 디렉토리 이름 또는 파일 이름 리턴
	}
}
