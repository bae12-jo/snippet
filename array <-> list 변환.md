Integer형 리스트를 배열로 변환
* 이때 primitive 배열로는 바꿀 수 없음, Integer만 가능
```java
Integer[] answer = tmp.toArray(new Integer[tmp.size()]); 
```

int 배열을 리스트로 변환
```java
// 반복문을 이용한 방법
for(int i: arr) intList.add(e);

// stream을 이용한 방법
List<Integer> intList = Arrays.stream(arr)
                              .boxed()
                              .collect(Collectors.toList());
```

String 배열을 String 리스트로
* `asList` 사용
```java
String[] arr = {"A", "B", "C"};
List<String> list = Arrays.asList(arr); // 이렇게 하면 고정 길이의 list를 반환하므로 값 추가가 안 됨
List<String> list = new ArrayList<>(Arrays.asList(arr)); // Arrays.asList()로 변환한 List로 새로운 ArrayList 객체를 생성해서 사용 가능
arr[0]="D";
list.set(0, "D");
```

String 리스트를 String 배열로
* `toArray` 사용
```java
String arr[] = arrList.toArray(new String[arrList.size()]);
```
