# Test-Coverage

## پروژه اول JSON

طبق دستور آزمایش پیش رفته و درصد پوشش را محاسبه می‌کنیم. سپس ریپورت HTML را ساخته و می‌توان خطوط پوشش‌داده‌شده را مشاهده کرد.

![image](images/3.jpg)
![image](images/1.jpg)
![image](images/2.jpg)
![image](images/4.jpg)

حال مقدار Coverage را برای پروژه بعدی نیز حساب می‌کنیم:

![image](images/5.jpg)

مشاهده می‌شود که پوشش خوبی وجود ندارد و بعضی کلاس‌ها و توابع تست نشده‌اند. حال به کلاس‌های PersonServiceTest و TrafficBehaviourServiceTest یک سری تست جدید اضافه می‌کنیم.

در رابطه با پکیج‌های models و repositoriesاصلا تستی وجود ندارد، پس از ابتدا برای آن‌ها تست می‌نویسیم. در انتها مجددا Run with Coverage را اجرا کرده و افزایش قابل توجهی در پوشش‌دهی مشاهده می‌شود.

![image](images/6.jpg)