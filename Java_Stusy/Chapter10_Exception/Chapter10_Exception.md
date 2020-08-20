## Chapter10. Excetion

> 예외란 사용자가 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류 
>
> 예외 , 오류(하드웨어,응용프로그램상에 오류) 둘다 발생시 프로그램이 곧바로 종료되기 때문에 예외처리(Exception Handling)을 통해서 프로그램을 종료하지 않고 실행상태가 유지되게 해야 한다.



### 예외 

1. 일반 예외(Exception)

> 컴파일러 체크 예외라고도 하며 자바 소스를 컴파일 하는 과정에서 검사된다.
>
> 필요한 예외처리 코드가 없을시 컴파일 오류가 발생한다.

2. 실행 예외(Runtime Exception)

> 실행예외는 컴파일하는 과정에서 예외 처리 코드를 검사 하지 않는 예외



자바에서는 예외를 클래스로 관리하며 JVM프로그램은 실행 도중 예외가 발생하면 해당 에외 클래스로 객체를 생성하며 예외처리 코드에서 예외 객체를 사용할수 있도록 한다. 자바의 모든 예외 클래스들은 `java.lang.Exception` 클래스를 상속 받는다.

- java.lang.Exception

  1. 일반 예외

  - java.lang.ClassNotFoundException
  - Java.lang.InterruptedException 
  - ....

  2. 실행예외

  - java.lang.RuntimeException

  - - Java.lang.NullPointerException
    - java.lang.ClassCastException
    - java.lang.NumberFormatException
    - ....

    

  구별법

  일반예외 : Exception을 상속받지만 RuntimeException을 상속받지 않는 클래스

  실행예외 : RuntimeException을 상속받는 클래스(실행예외도 Exception을 상속받지만 JVM은 RuntimeException을 상속 받는지 여부를 check)

  

  ### 실행예외 

  > 실행 예외는 자바 컴파일러가 체크하지 않기 때문에 개발자의 경험에 의한 예외처리가 되어야한다. 예외처리 안할 시 런타임 오류 발생.

  

  ####  1. NullPointerException

  > 가장 빈번하게 발생하는 실행예외로서 객체가 참조하는 값이 없을때(Null) 발생한다.

  

  #### 2. ArrayIndexOutOfBoundsException

  > 배열에서 인덱스 범위를 초과하여 사용할 경우 예외 발생 (배열값을 탐색하기 전에 인덱스 길이 체크 필요!)

  

  #### 3. NumberFormatException

  > 문자열로 되어 있는 데이터를 숫자로 변경하는 경우 발생 (문자열 -> 숫자 변환)
  >
  > Ex ) 1. Integer.parseInt(String s).               2. Double.parseDouble(String s)

  이러한 Wrapper 클래스를 사용하여 String 숫자를 원시타입 숫자로 변경할때 String값이 숫자로 변환될 수 없는 문자가 포함되어 있을 경우 Exception 발생

  

  #### 4. ClassCastException

  > 타입변환은 상위클래스와 하위클래스 사이 발생하고 구현클래스와 인터페이스 간에 발생하는데 이러한 관계가 아닌 관계에서 억지로 타입 변환을 시도 할 경우 발생

  타입 변환전 ClassCastException을 체크하기 위해서 `instanceof` 연산자를 통해서 확인하고 결과값이 true일때 타입 변환을 하는 것이 바람직 하다.

  

  ### 예외 처리 코드

  > 프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고, 정상 실행을 유지할 수 있도록 처리하는 코드를 예외 처리 코드라고 한다. 일반 예외가 발생할 가능성이 있는 코드는 컴파일러가 체크해주지만 실행예외는 컴파일러가 발견해주지 않기 때문에 개발자가 프로그램이 죽지 않도록 `try - catch - finally` 블록을 이용하여 생성자 내부 및 메소드 안에서 일반예외와 실행예외에 대한 예외처리가 필요하다.

  

  ```java
  try {
    //예외 발생 가능 코드
  }catch(예외클래스 e) {
    //예외에 대한 처리 (예외 발생하지 않으면 실행되지 않는다)
  }finally {
    //예외와 별계로 항상 실행되는 코드
  }
  ```

  

  ### 예외 종류에 따른 처리 코드

  #### 1. 다중 catch

  > 다중 catch문을 통해서 try 블록 내부에서 발생하는 다양한 종류의 예외별로 다르게 예외처리가 가능하다.
  >
  > 동시 다발적으로 예외가 발생될 수 없기 때문에 try문에서 특정 예외가 발생했을때 해당 예외에 대한 catch 구문으로 이동한다.

  ```java
  try {
    // ArrayIndexOutOfBoundException 발생
    // NumberformatException 발생
    // NullpointerException 발생
  }catch(ArrayIndexOutOfBoundException e){
    // Array 인덱스 초과에 대한 예외처리
  }catch(NumberformatException e){
    // 숫자 캐스팅 오류에 대한 예외처리 
  }catch(NullpointerExcepton e){
  	// Null값 참조에 대한 오류 예외처리
  }
  ```

  

  #### 2. catch 순서

  > 다중 catch블록 작성시 주의사항으로  *상위 예외 클래스가 하위 예외 클래스 보다 아래쪽에 위치 해야한다.*
  >
  > Try 블록에서 예외가 발생했을 때, 예외를 처리해줄 catch 블록은 위에서 차례대로 검색되기 때문에 하위 클래스가 위쪽에 위치하고 상위클래스가 아래쪽에 위치해야 한다.

  ex ) Exception e 는 항상 제일 마지막 catch문에서 실행 !

  

  #### 3. multi catch

  > 하나의 catch 구문에서 여러개의 예외처리를 할 수 있는 멀티 catch 기능.

  ```java
  try {
    // 예외가 발생하는 try구문
  }catch(ArrayIndexOutOfBoundException | NullPointerException){
    // 처리할 Exception에 대해서 | 로 연결해서 사용
  }catch(Exception e){
    // 모든 exception에 대한 예외처리
  }
  ```

  

  #### 4. 자동 리소스 닫기

  > `try-catch-resource` 구문을 사용하면 예외 발생 여부와 상관없이 사용했던 리소스 객체(입출력 스트림, 서버 소켓, 소켓, 채널 등)에 대하여 `close()`메소드를 호출하여 안전하게 리소스를 닫아준다.

  Ex) FileInputStream / FileOutputStream / Socet 등등

  

  기존에는 finally{} 구문 속에서 다시 try-catch 구문을 사용하여 리소스를 닫아줘야했지만 resource 를 사용하면 예외발새시 자동적으로 리소스에 대하여 close가 실행된다.

  ```java
  try(FileInputStream fis = new FileInputStream("file.txt")){
  	// try 구문에 리소스가 들어가고 예외발생시 close() 실행후 catch문으로 이동
  	// try 구문안에 리소스 여러개 들어갈 수 있다.
  }catch(IOException e){
  	
  }
  ```

   But 조건 : 리소스 객체는 AutoCloserable 인터페이스를 구현하고 있어야 한다.

  

  #### 5. 예외 떠넘기기

  > 일반적으로 예외는 메소드 내부에서 처리하지만 메소드를 호출한 곳으로 예외를 떠 넘기는것이 가능하다. 이때 사용하는 키워드가 `throws` 이다. 메소드 명 뒤에 throws 키워드를 작성하고 뒤에 예외클래스 작성

  ```java
  리턴타입 메소드명 (매개변수) throws 예외클래스1, 예외클래스2 {
    
  }
  ```

  throws 키워드가 붙어있는 매소드는 반드시 try 블록 내에서 호출되어야 하며 그 메소드에 대해서 catch 구문에서 예외처리를 해주어야 한다.

  자바 API 도큐먼트를 보면 클래스 생성자와 메소드 선언부에 throws키워드가 붙어있는 것들이 많이 볼수있다. 이러한 생성자 및 메소드는 반드시 try-catch 블록에서 예외처리 해주어야 한다. 

  

  #### 6. 사용자 정의 예외와 예외발생

  > 자바 표준 API에서 제공하는 예외 클래스만으로 다양한 종류의 예외처리를 전부 표현이 불가능하기 때문에 사용자가 직접 정의해서 만들어 처리해야 한다.  Ex) 은행 프로그램에서 잔고를 초과하는 출금 요청이 있을경우 !

  사용자 정의 예외는 실행예외, 일반 예외 둘다 선언이 가능하며 Exception / RuntimeException 을 필요에 따라 상속하면 된다. 

  ```java
  public class XXXException extend [ Exception | RuntimeException ] {
    public XXXException(){}
    public XXXException(String message){super(message);}
  }
  ```

  가급적 사용자 정의 예외는 Exception으로 끝나는 것이 좋으며 필드, 생성자, 메소드 선언 모두 포함가능하지만 일반적으로 생성자 선언만 포함한다. 또한 2개의 생성자를 보통 선언하고 하나는 매개변수가 없는타입, 다른하나는 예외 발생 원인 메세지 전달용 생성자를 선언한다.

  

  - 예외 발생시키는 방법

  Throw new xxxException();   OR.  Throw new xxxException("메세지");

  만들었던 생성자 호출을 통해서 !

  

  #### 7. 예외 정보 얻기

  > Try블록에서 예외가 발생되면 예외 객체는 catch 블록의 매개변수에서 참조하게 되어 매개변수를 이용하면 예외 객체의 정보를 알수있다. 모든 예외객체는 excetpion 클래스를 상속하기 때문에 Exception이 가지고 있는 메소드들은 모든 예외 객체에서 호출 가능하다.

  빈번하게 사용되는 메소드

  1. getMessage() : 예외가 가진 메세지 얻어오기
  2. printStackTrace() : 예외 발생 코드를 모두 추적해서 콘솔에 출력