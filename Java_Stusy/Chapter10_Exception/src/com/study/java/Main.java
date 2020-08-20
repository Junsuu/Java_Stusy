package com.study.java;

public class Main {

    // 순서
    // 1. 각 실행예외 주석 풀면서 예외 확인
    // 2. 기본  try-catch문

    public static void main(String[] args) throws BalanceInsufficientException {

//        1. 실행예외 - nullpointerException
//	      String data = null;
//        System.out.println(data.toString());

//        2. 실행예외 - ArrayIndexOutOfBoundException
//        String data[] = {"1","2","3"};
//        for(int i = 0; i < data.length+1 ; i++){
//            System.out.println(data[i]);
//        }

//        3. 실행예외 - NumberFormatException
//        String data1 = "100";
//        String data2 = "100a";
//        int a = Integer.parseInt(data1);
//        int b = Integer.parseInt(data2);

//        4. 실행예외 - ClassCastException (저번주 추상클래스 인터페이스 예제랑 같아서 PASS)


//
//        기본 try-catch문 일반 예외처리
//        try{
//            Class classesx = Class.forName("java.lang.String2");
//        }catch (ClassNotFoundException e){
//            System.out.println("클래스 없습니다!");
//        }finally {
//            System.out.println("finally 블럭실행");
//        }

//        기본 try-catch문 RuntimeException 에외처리
//        try{
//            String data1[] = {"data1","data2"};
//
//            for(int i =0; i < data1.length+1 ; i++){
//                System.out.println(data1[i]);
//            }
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("배열 인덱스 초과 !");
//            e.printStackTrace();
//        }

//      다중 catch 예제
//        try{
//              // arrayindexoutofboundException에 대한 catch블럭으로 이동
////            String data1[] = {"1","2","3","4"};
////
////            for(int i = 0; i <data1.length + 1;i++){
////                System.out.println(data1[i]);
////            }
//            // NullpointerException에 대한 catch블럭으로 이동
//            String nullpoint = null;
//            System.out.println(nullpoint.toString());
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("배열 인데스 초과에 대한 예외처리 catch문으로 이동 ");
//        }catch (NullPointerException e){
//            System.out.println("null참조에 대한 예외처리 catch문으로 이동");
//        }

////      catch문 순서
////      잘못된 예시
//        try{
//            String data = null;
//            System.out.println(data.toString());
//        }catch (Exception e){
//            System.out.println("exception e");
//        }catch (NullPointerException e){
//            System.out.println("NullPointerException e");
//        }
//
////      올바른 예시
//        try{
//            String data = null;
//            System.out.println(data.toString());
//        }catch (NullPointerException e){
//            System.out.println("NullpointerException");
//        }catch (Exception e){
//            System.out.println("exception e");
//        }

//      MultiCatch 예제
//        try{
//            String a = null;
//            System.out.println(a.toString());
//
//            String b = "a1";
//            int bb = Integer.parseInt(b);
//        }catch (NullPointerException  | NumberFormatException e){
//            e.printStackTrace();
//            System.out.println("Null참조 혹은 숫자로 변환 불가능합니다.");
//            System.out.println("자세한건 로그참조!");
//        }

        // AutoCloseable 사용 예제 ( close먼저 호출되고 난 후 catch구문으로 이동한다.)
//        try(FileInputStream fis = new FileInputStream("file.txt")){
//            fis.read();
//            //강제로 exception 호출
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("예외처리를 위해 catch구문으로 이동");
//        }

        // 예외처리 떠넘기기
//        Main main = new Main();
//        main.method1();
//
//        Account account = new Account();
//        account.withdraw(60000);
    }
    public void method1(){
        try{
            method2();
        }catch(ClassNotFoundException e){
            System.out.println("떠넘겨진 예외처리 : ClassNotFoundException");
        }
    }
    public void method2() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}
