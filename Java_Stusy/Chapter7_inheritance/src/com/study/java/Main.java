package com.study.java;

public class Main {

    public static void main(String[] args) {
     // Chapter1_ex 기본 상속 예제
        System.out.println("============================== Chapter1_ex ==============================");
        sample1_child_smartphone smartphone = new sample1_child_smartphone("갤럭시", "파랑색",false );

        // parent 속성
        System.out.println(smartphone.color);
        System.out.println(smartphone.model);
        // child 속성
        System.out.println(smartphone.touched);

        // parent 속성
        smartphone.poweroff();
        smartphone.poweron();
        smartphone.bell();
        // child 속성
        smartphone.touchedScreen(smartphone.touched);
        smartphone.touched = true;
        smartphone.touchedScreen(smartphone.touched);

        System.out.println("============================== Chapter2_ex ==============================");
     // Chapter2_ex 부모 생성자 호출 에제
        sample2_child child = new sample2_child("string");

        System.out.println("============================== Chapter3_ex ==============================");
     // Chapter3_ex Override 예제
        sample2_child child2 = new sample2_child("test");
        child2.overrideSample1();

        System.out.println("============================== Chapter6_ex ==============================");
    // Chapter6_ex 타입변환과 다형성 예제
        // 부모타입으로 캐스팅 예시
        sample6_parent parentCast1 = new sample6_child1();
        sample6_parent parentCast2 = new sample6_child2();

        // 부모타입으로 캐스팅 이후 자식 메소드 사용 불가능(부모메소드만 호출가능)
        parentCast1.parentmethod();
        // 자식 메소드 선언시 사용 불가능
        //parentCast1.child1method();

        //오버라이드된 메소드 호출시 자식 객체의 메소드가 호출된다.
        parentCast2.parentmethod();

        // 자동 캐스팅
        sample6_child1 childCast1 = new sample6_child1();
        sample6_child2 childCast2 = new sample6_child2();
        sample6_parent autoCast1 = childCast1;
        sample6_parent autoCast2 = childCast2;

        if(childCast1 == autoCast1){
            System.out.println("같은 객체 참조");
        }else{
            System.out.println("다른 객체 참조");
        }

        //upcast
        sample6_parent upcast = (sample6_parent) childCast1;

        //downcast
        sample6_parent downcastParent = new sample6_parent();
        // 컴파일 에러는 없으나 실행시 exception 발생
        // sample6_child1 downcast = (sample6_child1)downcastParent;
        // upcast된 자식객체를 다시 down cast는 가능하다.
        //sample6_child1 childdowncast = (sample6_child1)upcast;

        //객체 타입 확인(타입 변환시 확인하고 처리해야 어플리케이션이 안죽는다.
        if(upcast instanceof sample6_child1){
            sample6_child1 childdowncast = (sample6_child1)upcast;
            System.out.println("타입캐스트 가능");
        }

        //필드 다형성
        //매개변수 다형성(매개변수에 자식객체대입)
        //개념적인 내용이라서 PASS


        System.out.println("============================== Chapter7_ex ==============================");
        // Chapter7_ex 추상클래스 예제

        // new 연산자로 추상클래스 인스턴스 생성 불가능
        // sample7_abstract abstractInc = new sample7_abstract();
        // 추상클래스 상속 내용 전부 사용가능
        sample7_real real = new sample7_real("common_field");
        real.method1();
        real.method2();
        real.method3();
        real.method4();
    }
}
