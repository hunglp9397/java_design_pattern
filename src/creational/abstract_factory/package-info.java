package creational.abstract_factory;

/* ------------------------------- ABSTRACT FACTORY-------------------------
* Source : /creational/abstract-factory/

1. Định nghĩa
- Là một design pattern, tạo ra một Super-factory dùng để tạo ra các factory khác
- Là một pattern cao cấp hơn của Factory Method


2. Kiến trúc
- Abstract Factory : Là một Abstract Class hoặc Interface chứa phương thức để tạo ra đối tượng Abstract
- Abstract Product : Là một Abstract class hoặc Interface để định nghĩa đối tượng Abstract
- Concreate Factory : Xây dựng các phương thức để tạo đối tượng cụ thể
- Product : Xây dựng các đối tượng cụ thể, implement các phương thức ở Abstract Product
- Client : Đối tượng sử dụng Abstract Factory và Abstract Product


3. Ví dụ :
  - Một công ty đồ nội thất chuyên sản xuất ghế (Chair): ghế nhựa (PlasticChair) và ghế gỗ (WoodChair).
  - Với tình hình kinh doanh ngày càng thuận thợi nên công ty quyết định mở rộng thêm sản xuất bàn (Table).
  - Với lợi thế là đã có kinh nghiệm từ sản xuất ghế nên công ty vẫn giữ chất liệu là nhựa (PlasticTable) và gỗ (WoodTable) cho sản xuất bàn.
  - Tuy nhiên, quy trình sản xuất ghế/ bàn theo từng chất liệu (MaterialType) là khác nhau. Nên công ty tách ra là nhà máy (Factory): 1 cho sản xuất vật liệu bằng nhựa (PlasticFactory), 1 cho sản xuất vật liệu bằng gỗ (WoodFactory)
  - Nhưng cả 2 đều có thể sản xuất ghế và bàn (FunitureAbstractFactory)
  - Khi khách hàng cần mua một món đồ nào,  chỉ cần đến cửa hàng để mua (FunitureFactory). Khi đó ứng với từng hàng hóa và vật liệu sẽ được chuyển về phân xưởng tương ứng để sản xuất (createXXX) ra bàn (Table) và ghế (Chair).

4. Lợi ích
   - Các lợi ích của Factory Pattern cũng tương tự như Factory Method Pattern như: cung cấp hướng tiếp cận với Interface thay thì các implement, che giấu sự phức tạp của việc khởi tạo các đối tượng với người dùng (client), độc lập giữa việc khởi tạo đối tượng và hệ thống sử dụng
   - Giúp tránh được việc sử dụng điều kiện logic bên trong Factory Pattern. Khi một Factory Method lớn (có quá nhiều sử lý if-else hay switch-case), chúng ta nên sử dụng theo mô hình Abstract Factory để dễ quản lý hơn (cách phân chia có thể là gom nhóm các sub-class cùng loại vào một Factory).
   - Abstract Factory Pattern là factory của các factory, có thể dễ dạng mở rộng để chứa thêm các factory và các sub-class khác.
   - Dễ dàng xây dựng một hệ thống đóng gói (encapsulate): sử dụng được với nhiều nhóm đối tượng (factory) và tạo nhiều product khác nhau.
 */