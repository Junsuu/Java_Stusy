## Chapter13 Generic

> #### Why use Generic ??
>
> 1. **컴파일시 강한 타입 체크 가능**  : 실행시 발생하는 타입에러를 사전에 컴파일 과정에서 강한 타입 체크를 통해서 사전에 예방 
> 2. **불필요한 타입변환 제거** : 선언 시 지정된 타입으로 국한되기 때문에 컬렉션 요소에서 값을 가져올때 불필요한 타입 변환이 없어짐
>
> Ex ) 
>
> ~~~java
> // 비 제네릭 코드
>  List list = new ArrayList();
>  list.add("스트링");
>  String str = (String)list.get(0); // 불필요한 타입변환 발생
>  
>  
>  // 제네릭 코드
>  List<String> list = new ArrayList<String>();
>  list.add("스트링");
>  String str = list.get(0);				//컬렉션에 제네릭을 선언함으로서 불필요한 타입 캐스팅 제거
> ~~~



### 1. Generic Type( class< T > , interface< T >)

> 타입을 파라미터로 가지는 클래스와 인터페이스
>
> `public class 클래스명<T> { ... }`
>
> `public interface 인터페이스명<T>{ ... }`

1. 일반적으로 타입 파라미터는 대문자 알파벳 한글자로 표현

2. 제네릭 타입을 실제 코드에 사용할 때는 타입 파라미터에 구체적인 타입을 지정

ex)

```java
// 비 제네릭
public class Box {
  private Object object;	// 필드타입 모든 자바 클래스의 최상위 조상 클래스 Object 모든 종류의 객체 저장
  
  public void set(Object object){
    this.object = object;
  }
  
  public Object get(){
    return object;
  }
}

//사용
Box box = new Box();
box.set("스트링");	// String -> Object 자동 타입 캐스팅
String str = (String)box.get(); // Object -> String 강제 타입 캐스팅
```

-> Object 타입 사용시 Java의 모든 객체를 저장 할 수 있지만, 저장할때 타입 변환이 발생하고, 읽어 올때 타입 변환이 발생

-> 이러한 타입변환이 계속하여 발생하면 전체 프로그램의 성능 저하 

**그래서 제네릭을 사용하여 타입 변환 줄이기!!**

Ex)

```java
// 제네릭
public class Box<T>{
  private T t;			//Object -> T ( 객체 생성시 구체적인 타입으로 변경)
  
  public void set(T t){
    this.t = t;
  }
  
  public T get(){
    return t;
  }
}

// 사용
Box<String>box = new Box<String>();
box.set("스트링");				// 타입 변환 발생 X
String str = box.get();
```

-> 제네릭을 사용하여 클래스 설계시 구체적인 타입을 명시하지 않고, 타입파라미터로 대체 했다가, 실제 클래스가 사용될 때 구체적인 타입을 지정함으로써 타입 변환을 최소화!

### 2. 멀티 타입 파라미터 

> 제네릭 타입은 두 개 이상의 멀티 타입 파라미터 사용 가능 하며 각 타입 파라미터를 콤마로 구분
>
> `class<K,V>  , Interface<K,V> 형태`



**product class **

```java
public class Product<T,M>{
  private T kind;
  private M model;
  
  public T getKind(){
    return this.kind;
  }
  public M getModel(){
    return this.model;
  }
  
  public void setKind(T kind){
    this.kind = kind;
  }
  public void setModel(M model){
    this.model = model;
  }
}
```



**실행클래스**

```java
public class Main{
  public static void main(String [] args){
    Product<Tv,String> product1 = new Product<Tv,String>();
    product1.setKind(new Tv());
    product1.setModel("스마트TV");
    Tv tv = new Tv();
    tv = product1.getKind();
    String tvModel = product1.getModel();
  }
}
```



**자바 7 이상부터 다이아몬드 연산자`<>`를 통해서 자바 컴파일러가 타입 파라미터 부분에 선언해둔 타입을 체크하고 자동으로 설정 해주어 생략가능**

ex) 

자바 7 이하 : `Product<Tv,String> product = new Product<Tv,String>`

자바 7 이상 : `Product<Tv,String> product = new Product<>();`



### 3. 제네릭 메소드

> 제네릭 메소드는 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드로 리턴타입 앞에 `<타입파라미터> ` 를 기술하고 리턴타입과 매개 타입으로 타입 파라미터를 사용
>
> `public <타입파라미터 T, ...> 리턴타입 메소드명(매개변수) {}`



##### 3.1 제네릭 메소드 호출 방법

1. 코드에서 명시적으로 타입 파라미터의 구체적인 타입을 지정

>  `리턴타입 변수 = <구체적인 타입> 메소드명(매개값);`

2. 컴파일러가 매개값의 타입을 보고 구체적 타입을 추정하도록 선언 (생략해서..)

> `리턴타입 변수 = 메소드명(매개값)`

Ex) 

```java
1. Box<Integer> box = <Integer>boxing(100);
2. Box<Integer> box = boxing(100);
```



Util class

```java
public class Util{
  public static <T> Box<T> boxing(T t){
    Box<T> box = new Box<T>();
    box.set(t);
    return box;
  }
}
```

사용 클래스

```java
public class main{
	public static void main(String [] args){
    Box<Integer> box1 = Util.<Integer>boxing(100);
    int intVal = box1.get();
    
    Box<String> box2 = Util.<String>boxing("홍길동");
    String str = box2.get();
  }
}
```



### 4. 제한된 타입 파라미터

> 타입 파라미터에 지정되는 구체적인 타입을 제한할 필요가 있을때(숫자만 or  문자만) 제한된 타입 파라미터(bounded type parameter)가 필요하다. 타입의 제한을 위해서는 타입 파라미터 뒤에 `extends` 키워드를 붙이고 상위타입을 명시
>
> 상위타입은 클래스, 인터페이스 선언이가능하고 주의 할 점으로 인터페이스라고 `implement` 키워드를 사용하지 않는다.
>
> `public <T extends 상위타입> 리턴타입 메소드(메개변수) {}`

**주의사항**

메소드 블럭안에서 타입 파라미터 변수로 사용 가능한 것은 상위타입의 멤버(필드, 메소드로 제한)

하위타입에만 있는 필드와 메소드는 사용이 불가능하다 

``` java
public<T extends Number> int compare(T t1, T t2){
  double v1 = t1.doubleValue(); // Number의 double 관련 메소드
  double v2 = t2.doubleValue();
  
  return Double.compare(v1,b2);
}
```



### 5. 와일드카드 타입

> ?(와일드카드)를 통해 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 구체적인 타입 대신에 와일드 카드 이용가능
>
> 1. 제네릭타입<?> : 제한없음 -> 모든 클래스 인터페이스 타입 가능
> 2. 제네릭타입<?  extends 상위타입> -> 상위 클래스 제한 
> 3. 제네릭타입<? Super 하위타입> -> 하위 클래스 제한

예제 참조

person - Worker

​			   -Student - HighStudent



Course<?> => 모든 타입 (person,worker,student,highstudent)

Course<? Extends Student> => 상위타입 제한 (Student,Highstudent)

Course<? Super Worker> => 하위타입 제한(worker,person)



### 6. 제네릭 타입의 상속과 구현

> 제네릭 타입도 부모 클래스로 활용 가능 
>
> 형식은 기존과 동일

예제 참조

