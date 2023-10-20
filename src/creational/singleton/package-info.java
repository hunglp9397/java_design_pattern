package creational.singleton;
/*
SINGLETON PATTERN


1. Định nghĩa:
- Singleton đảm bảo duy nhất một thể hiện (instance) được tạo ra và sẽ cung cấp cho bạn duy nhất một method để có thể truy xuất được ở mọi nơi trong chương trình
- Singleton thường được dùng cho việc logging, Khởi tạo object driver , Caching và ThreadPool
- Singleton còn được dùng trong java class như là java.lang.Runtime

2. Cấu trúc
- Cần một private constructor để không cho phép khởi tạo từ bên ngoài
- Cần một biến private static để đảm bảo chỉ cho phép khởi tạo từ nội tại class
- Cần một public static method để trả ra instance của Class


3. Implement: có 3 cách
- Eager initialization: Class được khởi tạo ngay khi được gọi đến
- Static Block Initialization: Giống với Eager initialzation, chỉ khác là static block cung cấp thêm việc handle exception
- Lazy initialization : Mở rộng hơn so với 2 cách trên và hoạt động tốt trong môi trường đơn luồng
- Thread Safe Singleton: Đảm bảo tại cùng một thời điểm chỉ có duy nhất 1 luồng có thể truy cập vào hàm getInstance
- BillPugh Singleton : Tạo ra một static nested class, với vai trò 1 Helper khi muốn tách biệt chức năng cho 1 class function rõ ràng hơn



4. Trường hợp sử dụng Singleton
- Dùng trong logFactory
- Dùng trong java.lang.Runtime

5. Singleton trong Spring
- Có thể có nhiều singleton bean từ 1 class














*/