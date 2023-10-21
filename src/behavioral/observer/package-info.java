package behavioral.observer;


/*
    ============================ Observer Pattern =================================

1. Định nghĩa :
- Observer Pattern định nghĩa mối phụ thuộc 1 - nhiều giữa các đối tượng để khi mà một đối tượng có sự thay đổi trạng thái thì các thành phần phụ thuộc của nó sẽ được thông báo và cập nhật một cách tự động
-

2. Các thành phần:
- Quan trọng : Sự tương tác  giữa subject và Observer như sau:
  + Mỗi khi subject có sự thay đổi trạng thái, nó sẽ duyệt qua các danh sách observer của nó và gọi phương thức cập nhật trạng thái của từng observer

- Subject : Là một list chứa các Observer, cung cấp phương thức để thêm hoặc loại bỏ observer
- Concrete Subject: Cài đặt các phương thức của Subject, Lưu trữ trạng thái của list ConcreateObserver, gửi thông báo đến các observer của nó khi có sự thay đổi trạng thái
- Observer : định nghĩa một phương thức update() cho các đối tượng sẽ được subject thông báo đến khi có sự thay đổi trạng thái
- Concrete Observer : Cài đặt các phương thức của Observer, lưu trữ trạng thái của subject, thực thi việc cập nhật để giữ cho trạng thái đồng nhất vơ subject gửi thông báo đến


3. Apply
- Bài toán:
  + Giả sử hệ thống cần theo dõi tài khoản của người dùng. Mọi thao tác của người dùng đều cần được ghi log lại
  + Khi có một event nào đó như : tài khoản hết hạn -> Gửi mail thông báo cho người dùng, Thực hiện chặn người dùng nếu truy cập không hợp lệ

- Các thành phần trong bài toán:
  + Subject : Cung cấp các phương thức để thêm, loại bỏ Observer
  + AccountService : Đóng vai trò là Concreate Subject, sẽ thông báo tới tất cả các observers khác, bất cứ khi nào có thao tác
  của người dùng
  + Observer : Định nghĩa một phương thức update() cho câc đối tượng sẽ được subject thông báo khi có sự thay đổi trạng thái
  + Logger, Mailer, Protector : là các Concreate Observer. Sau khi nhận đc thông báo rằng có các thao tác với user và gọi phương thức update(). Thì các concreate Observer này  sẽ sử dụng subject state để xử lí


4. Lợi ích của Observer Pattern
- Dễ dàng mở rộng với ít sự thay đổi, nghĩa là : Code subject và Observer thay đổi độc lập
- Sự thay đổi trạng thái của 1 đối tượng sẽ được thông báo tới đối tượng khác mà không giữ liên kết quá chặt chẽ

5. Khi nào sử dụng
- Nên dùng khi có mối quan hệ 1 - N giữa các object với nhau
- Một đối tượng muốn thông báo tới tất cả các object liên quan về sự thay đổi
- Quản lý event








*/