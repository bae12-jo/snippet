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
* toArray(T[] a)는 파라미터로 넘어온 배열의 크기를 확인하고 리스트 크기보다 작을 때 List 크기를 기준으로 배열을 생성한다. 인자로 넘어가는 배열의 크기가 리스트의 크기보다 큰 경우에는 인자로 넘어가는 배열의 크기만큼 배열이 생성된다. 실수로 큰 값을 전달하면 배열의 크기가 커진다.
```java
String arr[] = arrList.toArray(new String[arrList.size()]); // new String[0]으로 해도 리스트 크기와 동일한 배열이 만들어진다.
```
