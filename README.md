# BÀI TẬP TUẦN 1 - LẬP TRÌNH THIẾT BỊ DI ĐỘNG
## Yêu cầu hệ thống
- Android Studio phiên bản mới nhất (khuyến nghị Hedgehog 2023.1.1 trở lên).
- JDK 17 trở lên.
- Android SDK với API Level 33+ (khuyến nghị API 35).
- Máy ảo (Emulator) Pixel 7/Pixel 8 hoặc thiết bị Android thật.
## Thông tin sinh viên

- **Họ tên:** Trần Hữu Thịnh
- **MSSV:** 072206009901
- **Môn học:** Lập trình thiết bị di động
- **Công cụ:** Android Studio
- **Ngôn ngữ:** Kotlin
- **Giao diện:** XML

---

## Câu 1: Mong muốn và định hướng sau khi học xong môn học

Sau khi học xong môn **Lập trình thiết bị di động**, em mong muốn:

- Hiểu được cách xây dựng một ứng dụng mobile cơ bản bằng Android Studio.
- Tự thiết kế giao diện, xử lý các sự kiện và kết nối ứng dụng với API hoặc cơ sở dữ liệu.
- Phát triển thêm kỹ năng lập trình mobile để hỗ trợ cho mục tiêu trở thành **Full-Stack Developer** trong tương lai.
---

## Câu 2: Lập trình di động có phát triển trong 10 năm tới không?

Theo em, trong 10 năm tới lập trình di động vẫn sẽ tiếp tục phát triển mạnh mẽ. Lý do:

- Điện thoại thông minh ngày càng phổ biến và được sử dụng trong nhiều lĩnh vực như học tập, mua sắm, ngân hàng, giải trí và làm việc.
- Các công nghệ như AI, Cloud và IoT ngày càng phát triển và có thể được tích hợp vào các ứng dụng mobile.
- Nhu cầu phát triển ứng dụng di động vẫn sẽ còn rất lớn trong tương lai.
---

## Câu 3: Xây dựng giao diện hồ sơ sinh viên

### Các thành phần sử dụng

- ConstraintLayout
- ImageButton
- ImageView
- TextView
- Kotlin
- XML

### Chức năng

- ✅ Nút quay lại (`btnBack`)
- ✅ Nút chỉnh sửa (`btnEdit`)
- ✅ Hiển thị ảnh đại diện
- ✅ Hiển thị họ tên
- ✅ Hiển thị mã sinh viên
- ✅ Hiển thị ngành học
- ✅ Hiển thị trường học

## Video hướng dẫn
Link Git: https://github.com/Thinhth06/bai_tap_tuan1.git
Link video:

### Cấu trúc project
```text

bai_tap_tuan1
│
├── .gradle
├── .idea
│
├── app  
│   │
│   └── src
│       │
│       └── main
│           │
│           ├── java
│           │   └── com.example.bai_tap_tuan1
│           │       ├── ui.theme
│           │       └── MainActivity.kt        
│           │
│           ├── res
│           │   │
│           │   ├── drawable
│           │   │   ├── avatar.jpg             
│           │   │   ├── circle_avatar.xml       
│           │   │   ├── ic_arrow_back.xml       
│           │   │   ├── ic_edit.xml             
│           │   │   ├── ic_launcher_background.xml
│           │   │   └── ic_launcher_foreground.xml
│           │   │
│           │   ├── layout
│           │   │   └── activity_main.xml      
│           │   │
│           │   ├── mipmap-...
│           │   ├── values
│           │   ├── values-night
│           │   └── xml
│           │
│           └── AndroidManifest.xml
├── tailieu/               # Tài liệu, hình ảnh minh họa
│   └── HinhAnh/
│       └── screenshot.png
│
├── README.md                                    
└── ...
