# Bài 1. Những thứ cơ bản nhất

## I. Câu lệnh huyền thoại "Hello world!".
code: `Main.java`

Để bắt đầu hiểu được về lập trình, tôi cần biết khi tôi lệnh nào đó thì máy tính sẽ làm gì và cho output gì.
Ở `Main.java` là cấu trúc chung của 1 chương trình java và lệnh để cho biết máy tính thực hiện gì là:
```java
IO.println("Hello world!");
```
tôi đang sử dụng JDK 25 nên syntax có thể hơi khác so với phiên bản cũ hơn:
```java
System.out.println("Hello world!");
```
Tất cả các lệnh kết thúc bằng dấu `;`. \
Cần đảm bảo tên file đặt giống tên class.

## II. Kiểu dữ liệu (Data Types)
Có $2$ loại chính: kiểu dữ liệu cơ bản/nguyên thuỷ (primitive) aà kiểu đối tượng/tham chiếu (objects/reference).

- Về kiểu `primitive` gồm:
  - số nguyên: `byte` ➜ `short` ➜ `int` ➜ `long`
  - số thực: `float` ➜ `double`
  - ký tự: `char`
  - lý luận: `boolean`

- Về kiểu `objects/reference` là các đối tượng chứa tham chiếu đến các giá trị hoặc đối tượng khác. Ví dụ `String`
- `null` là giá trị đặc biệt để biểu thị sự vắng mặt của giá trị.

**Các kiểu dữ liệu cơ bản (Primitive Data Types)**

|Type|Size (bits)| Minimum      | Maximum                | Example       |
|---|---|--------------|------------------------|---------------|
|byte|8| $-2^7$       | $2^7 – 1$              | byte b = 100; |
|short|16| $-2^{15}$    | $2^{15}– 1$            | short s = 30_000;|
|int|32| $-2^{31}$    | $2^{31}– 1$            | int i = 100_000_000;|
|long|64| $-2^{63}$    | $2^{63}-1$             | long l = 100_000_000_000_000;|
|float|32| $-2^{-149}$  | $(2-2^{-23})·2^{127}$  | float f = 1.456f;|
|double|64| $-2^{-1074}$ | $(2-2^{-52})·2^{1023}$ | double f = 1.456789012345678;|
|char|16| $0$          | $2^{16}– 1$            | char c = ‘c’;|
|boolean|1| –            | –                      | boolean b = true;|

## III. Khai báo biến (Declaring Variables)
code: `Data_types.java`
### 1. Đặt tên biến
Tuân theo quy tắc chung của mọi ngôn ngữ lập trình:
- Bắt đầu bằng chữ cái `a` ➜ `z` và `A` ➜ `Z` và 2 kí tự `_` `$`
- Trong tên biến không có chứa kí tự đặc biệt, ví dụ: `!` `@` `#` `$` ...
- Khác với các từ khoá dành riêng, ví dụ: `int`, `String`, `public`, `static`, `class`, `main`, `new`, `instanceof`, ...
- Nên đặt tên có ý nghĩa cho mục đích sử dụng

### 2. Cách khai báo
- Chỉ định tên (định danh) và kiểu dữ liệu của biến đó.
```java
int heigh;
float weight;
```
- Sử dụng **toán tử gán** `=` để khởi tạo giá trị.
```java
int age = 23;
```

### 3. Chú ý
- `char` sử dụng cặp dấu nháy đơn `''`
- `string` sử dụng cặp dấu nháy đôi `""`
- `boolean` chỉ có 2 giá trị là `true` và `false`

## IV. Mảng (Arrays)
code: `Arrays.java`

Mảng là một kiểu tham chiếu có thể lưu trữ một tập hợp các giá trị thuộc một kiểu cụ thể.
```java
int[] numbers = new int[100]; // mảng có thể chứa tối đa 100 số nguyên
```

Đặt giá trị cho vị trí bằng cách sử dụng toán tử gán `=` giữa chỉ mục và giá trị.
```java
numbers[0] = 1;
numbers[2] = 3;
```

Tham chiếu phần tử bằng cách sử dụng tên biến và chỉ mục của nó.
```java
int first_element = numbers[0];
```

Lấy độ dài của mảng bằng cách gọi `numbers.length`
```java
int length_numbers = numbers.length;
```

*Chú ý:*
- Chỉ số mảng bắt đầu từ 0

## V. Toán tử (Operators)
code: `Operators.java`
### 1. Toán tử số học (Arithmetic)
- `+`: cộng
- `–`: trừ
- `*`: nhân
- `/`: chia
- `%`: chia lấy dư

*Phép `+` sử dụng trong chuỗi dùng để nối chuỗi lại với nhau*

### 2. Toán tử logic (Logical)
- `&&`: và
- `||`: hoặc
- `!`: không

*Thường dùng cho việc kiểm tra nhiều điều kiện*

### 3. Toán tử so sánh (Comparison)
- `<`: nhỏ hơn
- `<=`: nhỏ hơn hoặc bằng
- `>`: lớn hơn
- `>=`: lớn hơn hoặc bằng
- `==`: bằng
- `!=`: không bằng

## VI. Cấu trúc chương trình
- Đơn vị cơ bản của một chương trình Java là một  Lớp `class`. Một Lớp  có thể có một hoặc nhiều thuộc tính (fields/properties), phương thức (methods) và thậm chí các Lớp khác được gọi là lớp bên trong.
- Để một lớp có thể thực thi được, nó phải có  phương thức `main`.  Phương thức main biểu thị điểm vào của chương trình.
- Đoạn mã nằm giữa dấu ngoặc nhọn mở và đóng `{}` được gọi là khối mã.
- Mã nguồn của một chương trình Java được lưu trữ trong một tệp có phần mở rộng là  `*.java`

Ý nghĩa của từng từ khóa trong chữ ký phương thức thông thường:
- `public` – từ khóa truy cập, có nghĩa là phạm vi toàn cục
- `static` – phương thức có thể được truy cập trực tiếp từ lớp, chúng ta không cần phải tạo một đối tượng để có tham chiếu và sử dụng nó
- `void` – có nghĩa là phương thức này không trả về giá trị
- `main` – tên của phương thức, đó là định danh mà JVM tìm kiếm khi thực thi một chương trình Java

Còn tham số `args` đại diện cho các giá trị mà phương thức nhận được. Đây là cách chúng ta truyền các tham số cho chương trình khi khởi chạy lần đầu.

## VII. Biên dịch và thực thi chương trình

`File` ──biên dịch──➜ `tệp nhị phân .class` ──thực thi trên JRE──➜ output

