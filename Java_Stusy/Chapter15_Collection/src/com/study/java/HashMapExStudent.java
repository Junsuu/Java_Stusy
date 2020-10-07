package com.study.java;

public class HashMapExStudent {
    public int sno;
    public String name;

    public HashMapExStudent(int sno,String name){
        this.sno = sno;
        this.name = name;
    }


    // equals 메소드 재정의
    @Override
    public boolean equals(Object obj) {
        // 형변환 가능 여부 체크
        if(obj instanceof HashMapExStudent){
            HashMapExStudent hashMapExStudent = (HashMapExStudent) obj;
            return (sno == hashMapExStudent.sno) && (name.equals(hashMapExStudent.name));
        }
        return false;
    }
    // hashcode 메소드 재정의 sno,name값이 일치하면 동일 해쉬코드 리턴
    @Override
    public int hashCode() {
        return sno + name.hashCode();
    }
}
