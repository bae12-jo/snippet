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
