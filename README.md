# 📱 BÀI TẬP TUẦN 1 - LẬP TRÌNH THIẾT BỊ DI ĐỘNG

> **Sinh viên:** Trần Hữu Thịnh — MSSV: 072206009901  
> **Môn học:** Lập trình thiết bị di động  
> **Công cụ:** Android Studio · Kotlin · XML

---

## 📋 Yêu cầu hệ thống

- Android Studio phiên bản mới nhất (khuyến nghị Hedgehog 2023.1.1 trở lên)
- JDK 17 trở lên
- Android SDK API Level 33+ (khuyến nghị API 35)
- Máy ảo Pixel 7 / Pixel 8 hoặc thiết bị Android thật

---

# 🎯 PHẦN A: BÀI TẬP LÝ THUYẾT

## Câu 1: Mong muốn và định hướng sau khi hoàn thành môn học

### 🌱 Mục tiêu trước mắt

Nắm vững kiến trúc ứng dụng và quy trình xây dựng một ứng dụng hoàn chỉnh:

`UI Design → Application Logic → Backend → Testing → APK / AAB`

Hiểu và vận dụng được:

- Kiến trúc ứng dụng Android
- Quản lý trạng thái
- Mô hình **MVVM**
- Kết nối **RESTful API**
- Lưu trữ và quản lý dữ liệu

### 🚀 Mục tiêu sau khi kết thúc môn học

> Không chỉ hoàn thành một ứng dụng để nộp bài, mà có thể tự xây dựng một sản phẩm giải quyết vấn đề thực tế.

Sau khi kết thúc môn học, tôi muốn có khả năng tự hoàn thiện một ứng dụng:

- Giải quyết một **pain point** thực tế
- Kết nối RESTful API
- Hỗ trợ lưu trữ dữ liệu offline bằng local caching
- Có UI/UX mượt mà
- Quản lý tốt tài nguyên thiết bị
- Có thể đóng gói thành APK/AAB hoàn chỉnh

### 🧭 Định hướng dài hạn

Xây dựng nền tảng vững chắc về **Native Mobile Development**, tiến tới hiểu cách thiết kế một client chất lượng trong một hệ thống phần mềm hoàn chỉnh.

**🧰 Công nghệ mục tiêu:** Android · Kotlin · MVVM · REST API · Git

---

## Câu 2: Lập trình di động có phát triển trong 10 năm tới không?

Theo em, lập trình di động **vẫn sẽ phát triển mạnh**, nhưng bản chất công việc sẽ thay đổi rõ rệt:

| Yếu tố | Sự thay đổi | Ý nghĩa |
| :--- | :--- | :--- |
| 📱 Phần cứng | Smartphone → Wearable → Spatial Computing → Smart Car | Mobile trở thành trung tâm hệ sinh thái thiết bị |
| 🧠 Công nghệ | API-centric → On-device AI | AI xử lý trực tiếp trên thiết bị |
| 👨‍💻 Developer | CRUD → Performance, Security, Edge Computing | Lập trình viên phải hiểu hệ thống sâu hơn |

**Lý do:**

- Điện thoại thông minh ngày càng phổ biến, gắn với mọi lĩnh vực đời sống.
- AI, Cloud, IoT ngày càng được tích hợp sâu vào ứng dụng mobile.
- Nhu cầu xây dựng sản phẩm di động vẫn rất lớn trong tương lai.

> **Personal Takeaway:** Điều em muốn đạt được không chỉ là viết được một app Android, mà là tư duy:  
> Hiểu vấn đề → Thiết kế giải pháp → Xây dựng sản phẩm → Tối ưu trải nghiệm.

---

## Câu 3: Mô hình giáo dục của HAA

**HAA là gì?** Mô hình giáo dục mới cho thế hệ trẻ thời AI, theo triết lý **Learning by Building** — học qua việc thực sự tạo ra sản phẩm.

**3 thành phần chính:**

| Thành phần | Ý nghĩa |
| :--- | :--- |
| 🛠️ Pursuits | Dự án, ý tưởng startup hoặc vấn đề sinh viên chủ động theo đuổi |
| 📚 Courses | Khóa học ngắn, chuyên sâu, hướng dẫn bởi người có kinh nghiệm thực tế |
| 🏢 Co-ops | Cơ hội làm việc thực tế tại các công ty công nghệ |

**Luồng tư duy:** `Learn → Build → Fail → Improve → Ship`

**Ưu điểm:**

- Tính ứng dụng cao, biến kiến thức thành sản phẩm cụ thể.
- Tiếp cận công nghệ mới nhanh, thích nghi tốt với AI.
- Phát triển tính tự chủ, chủ động xác định vấn đề.
- Gắn kết thực tế qua Co-op, mentor và doanh nghiệp.

**Nhược điểm:**

- Dễ yếu kiến thức nền tảng (CTDL, HĐH, kiến trúc máy tính, mạng).
- Đòi hỏi tính tự giác, khả năng tự nghiên cứu rất cao.

**Góc nhìn:** Không phải bỏ lý thuyết, mà là **dùng lý thuyết để xây dựng thứ thực sự hoạt động**.

---

## Câu 4: Internet và AI thay đổi cách tiếp cận tri thức

| Tiêu chí | Trước Internet | Thời Internet | Thời AI |
| :--- | :--- | :--- | :--- |
| **Tìm kiếm** | Thư viện, sách | Google, website | ChatGPT, Gemini |
| **Ghi nhớ** | Học thuộc lòng | Lưu file, bookmark | AI trả lời ngay |
| **Vận dụng** | Tự suy luận | Tra cứu, xem video | AI gợi ý, viết code |
| **Tốc độ** | Chậm | Nhanh hơn | Cực nhanh |
| **Độ chính xác** | Phụ thuộc sách | Phụ thuộc nguồn tin | Có thể sai, cần kiểm chứng |

**Liên hệ Mobile:**

- **Trước Internet:** nhớ API, phương thức.
- **Internet Era:** `Problem → Google → Docs → Implement`
- **AI Era:** `Problem → Context → AI Generate → Review → Test → Improve`

**Nhận xét:** Tri thức ngày càng dễ tiếp cận, nhưng người học dễ bị phụ thuộc và lười tư duy. AI làm giảm giá trị của việc nhớ cú pháp, nhưng tăng giá trị của việc hiểu hệ thống.

---

## Câu 5: Học gì khi AI làm được gần như mọi thứ?

**Từ Syntax sang Thinking** — biết code nào nên viết, tại sao, và làm sao biết nó đúng.

- **Tư duy phản biện & Code Review:** AI có thể tạo bug logic, lỗ hổng bảo mật, memory leak. Developer là **Quality Gate** cuối cùng.
- **System Architecture:** Hiểu cách kết nối UI → ViewModel → Repository → REST API / Room DB để hệ thống ổn định khi mở rộng.
- **UX & Domain Empathy:** AI không cầm điện thoại ngoài nắng, không dùng app một tay, không chờ load.
  > **Good Code ≠ Good Product.**
- **Problem Formulation:** Chia bài toán lớn thành vấn đề nhỏ, cung cấp đúng context cho AI, đánh giá kết quả.
- **Đạo đức & trách nhiệm:** AI không có đạo đức, con người phải chịu trách nhiệm.
- **Học cách học:** Tự học để thích nghi với công nghệ thay đổi.

| Giai đoạn | Vai trò Developer |
| :--- | :--- |
| **Past** | Write Code |
| **Internet Era** | Search + Write Code |
| **AI Era** | Think + Design + Direct + Review + Build |

> **Learn · Build · Understand · Improve**

---

## Câu 6: Năng lực cần phát triển trong thời đại AI

| Năng lực | Vì sao quan trọng? |
| :--- | :--- |
| **Tư duy phản biện** | AI có thể trả lời sai, cần kiểm chứng |
| **Sáng tạo** | AI tạo ra dựa trên dữ liệu cũ |
| **Giao tiếp** | AI không có cảm xúc |
| **Làm việc nhóm** | AI không phối hợp được con người |
| **Tự học** | Công nghệ thay đổi nhanh |
| **Đạo đức** | AI không có đạo đức |
| **Quản lý thời gian** | Biết ưu tiên công việc |

---

# 💻 PHẦN B: BÀI TẬP THỰC HÀNH

## Câu 3: Xây dựng giao diện hồ sơ sinh viên

### 🛠 Các thành phần sử dụng

- ConstraintLayout
- ImageButton
- ImageView
- TextView
- Kotlin
- XML

### ⚙️ Chức năng

- ✅ Nút quay lại (`btnBack`)
- ✅ Nút chỉnh sửa (`btnEdit`)
- ✅ Hiển thị ảnh đại diện
- ✅ Hiển thị họ tên
- ✅ Hiển thị mã sinh viên
- ✅ Hiển thị ngành học
- ✅ Hiển thị trường học

---
## 📁 Cấu trúc project

```text
bai_tap_tuan1
│
├── app
│   └── src
│       └── main
│           ├── java/com.example.bai_tap_tuan1
│           │   ├── ui.theme
│           │   └── MainActivity.kt
│           ├── res
│           │   ├── drawable
│           │   │   ├── avatar.jpg
│           │   │   ├── circle_avatar.xml
│           │   │   ├── ic_arrow_back.xml
│           │   │   ├── ic_edit.xml
│           │   │   ├── ic_launcher_background.xml
│           │   │   └── ic_launcher_foreground.xml
│           │   ├── layout
│           │   │   └── activity_main.xml
│           │   └── values
│           └── AndroidManifest.xml
├── tailieu/
│   └── HinhAnh/
│       └── screenshot.png
├── README.md
└── ...