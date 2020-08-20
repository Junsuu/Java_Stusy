package com.study.java;

// 원래는 AutoCloseable을 구햔한 리소스를 사용해야 하지만 예제니까 이렇게 만들겠습니다.
// AutoCloserable를 사용하면 close() 메소드 구현체를 만들어야 합니다!
public class FileInputStream implements AutoCloseable {
    private String file;

    public FileInputStream(String file){
        this.file = file;
    }

    public void read(){
        System.out.println(file + " 을 읽습니다");
    }

    @Override
    public void close() throws Exception {
        System.out.println("리소스 close()함수 호출됨");
    }
}
