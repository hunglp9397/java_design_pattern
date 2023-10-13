package creational.factory_method;
/*
 -FACTORY METHOD PATTERN
 1. Định nghĩa:
    -  là một design pattern quản lý và trả về các đối tượng theo yêu cầu, giúp cho việc khởi tạo đối tượng dẽ dàng hơn
    - Tạo ra đối tượng mà không để lộ logic tạo đối tượng ở phía người dùng và tham chiếu đối tượng mới được tạo ra bằng cách sử dụng interface chung


 2. Kiến trúc:
    - Một Super Class : một supper class trong Factory Pattern, có thể là một Interface hoặc là một Abstract Class
    - Factory Class : chịu trách nhiệm khởi tạo các đối tượng theo tham số đầu vào, nên sẽ có một public static method cho việc khởi tạo đối tượng
    - Sub Class : Các Sub class sẽ implement phương thức của Super Class theo nghiệp vụ riêng của từng SubClass

  3. Ví dụ:
    - Giả sử cần thiết kế hệ thống để sử dụng dịch vụ của một ngân hàng bất kì
    - Các hệ thống ngân hàng đều có phương thức tính tiền riêng
    - Hiện tại phía client chỉ sử dụng dịch vụ của VietcomBank và TPBank,
    - Nhưng giả sử sau này cần nâng cấp thêm dịch vụ của ngân hàng khác Thì ta dễ dàng Khởi tạo và thêm vào factory là xong

  4. Lợi ích của Factory Pattern:
    - Factory Pattern giúp giảm sự phụ thuộc giữa các module (loose coupling): cung cấp 1 hướng tiếp cận với Interface thay thì các implement. Giúp chuơng trình độc lập với những lớp cụ thể mà chúng ta cần tạo 1 đối tượng, code ở phía client không bị ảnh hưởng khi thay đổi logic ở factory hay sub class.
    - Mở rộng code dễ dàng hơn: khi cần mở rộng, chỉ việc tạo ra sub class và implement thêm vào factory method.
    - Khởi tạo các Objects mà che giấu đi xử lí logic của việc khởi tạo đấy. Người dùng không biết logic thực sực được khởi tạo bên dưới phương thức factory.
    - Dễ dạng quản lý life cycle của các Object được tạo bởi Factory Pattern.
    - Thống nhất về naming convention: giúp cho các developer có thể hiểu về cấu trúc source code.


  5. Trưồng hợp sử dụng thực tế là : trong class LoggerFactory chỉ tạo ra một instance duy nhất, và java.runtime


 */
