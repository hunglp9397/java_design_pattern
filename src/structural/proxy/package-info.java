package structural.proxy;
/* PROXY PATTERN

1. Định nghĩa
- Proxy pattern là 1 pattern mà tất cả các truy cập trực tiếp đến một đối tượng no đó sẽ được chuyển hướng vào một đối tượng trung gian, thực thi các phương thức
- Các phương thức trung gian có thể sẽ được thay đổi cho phù hợp vơ mục đích suwr dụng
- Hiểu đơn giản là HTTP Proxy, Là 1 gatewary trung gian giữa client và server, HTTP proxy giúp nâng cao trải nghiệm người dùng, lưu cacche...



2. Các loại proxy
- Virtual Proxy
- Protection Proxy
- Remote Proxy
- Monitor PRoxy
- Firewall Proxy
- Cache Proxy
- Smart Reference Proxy
- Synchronization Proxy

3. Thành phần của Proxy

- Subject : interface định nghĩa các phương thức giao tiếp với client
- Proxy :
- RealSubject : 1 Class Service sẽ thực hiện các thao tác
- Client : Đô tượng cần sử dụng RealSubject Nhưng thông qua proxy

4. Lợi ích của Proxy Pattern
- Cải thiện Performance thông qua lazy loading, chỉ tải các tài nguyên khi chúng được yêu cầu.
- Cung cấp sự bảo vệ cho đối tượng thực từ thế giới bên ngoài.
- Giảm chi phí khi có nhiều truy cập vào đối tượng có chi phí khởi tạo ban đầu lớn.
- Dễ nâng cấp, bảo trì.


5. Ví dụ

- Trường hợp hay dung nhất là annotation @Transactional trong Spring
- Lúc này Proxy sẽ thực hiện các action :
  + Mở transaction
  + Gọi đến method tác động DB :  create, update, delete ...
  + Thực hiện trigger Commit hoặc Rollback.







*/