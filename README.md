# snippet

## 속도 향상
(1) [출력] StringBuilder 사용하기
* 내부 버퍼에 문자열을 저장해뒀다가 한 번에 출력하기 때문에 System.out.print() 보다 속도가 빠름
```java
for(int p: parent){
  sb.append(p).append("\n");
}
System.out.println(sb);
```

(2) [입력] BufferedReader 사용하기
* 정규표현식 검증이 없어서 Sanner보다 빠름
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine());
for(int i=0; i<n; i++){
  StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	int first = Integer.parseInt(st.nextToken());
  int second = Integer.parseInt(st.nextToken());
}
```

(3) [입력] read() 사용하기
* 정수 리터럴 입력 받을 때 BufferedReader보다 속도 빠름
```java
private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if (isNegative) n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return isNegative ? ~n + 1 : n;
}
```
## 형변환
(1) 문자 -> 정수
```java
int num = ch-'0';
int capital = ch-'A';
int small = ch-'a';
```

(2) StringBuilder -> 문자 배열
```java
char[] charArray = new char[sb.length()];
sb.getChars(0, sb.length(), charArray, 0);
```
