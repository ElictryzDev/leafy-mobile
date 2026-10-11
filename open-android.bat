@echo off
chcp 65001 >nul
echo =======================================================
echo   Leafy Mobile - Android & Gelistirme Baslaticisi
echo   Istanbul Beykent Universitesi Bilgisayar Programciligi
echo =======================================================
echo.

if exist "release\leafy-debug-v1.0.apk" (
    echo [i] Hazir yuklenebilir APK mevcut: release\leafy-debug-v1.0.apk
    echo     (Bu APK'yi telefonunuza atip dogrudan yukleyebilirsiniz!)
    echo.
)

echo [1] Proje Bagimliliklarini Yukle (npm install)
echo [2] Android Studio ile Ac (Android Studio kurulu olmalidir)
echo [3] Capacitor Android Sync Calistir
echo [4] Cikis
echo.

set /p choice="Seciminizi yapin (1/2/3/4): "

if "%choice%"=="1" (
    echo.
    echo Bagimliliklar yukleniyor (npm install)...
    call npm install
    echo.
    echo Islem tamamlandi!
    pause
    exit /b
)

if "%choice%"=="2" (
    echo.
    if not exist "node_modules" (
        echo [!] UYARI: Ilk once secenek 1'i calistirip npm paketlerini yuklemelisiniz!
        pause
        exit /b
    )
    echo Android Studio baslatiliyor...
    call npx cap open android
    if errorlevel 1 (
        echo.
        echo [!] Android Studio bulunamadi veya kurulu degil!
        echo     Not: Bilgisayarinizda sadece Android SDK/JDK var, Android Studio IDE'si kurulu degil.
        echo     APK'yi dogrudan denemek icin release\ klasorundeki hazir APK'yi kullanabilirsiniz.
    )
    pause
    exit /b
)

if "%choice%"=="3" (
    echo.
    if not exist "node_modules" (
        echo [!] UYARI: Ilk once secenek 1'i calistirip npm paketlerini yuklemelisiniz!
        pause
        exit /b
    )
    echo Capacitor Sync calisiyor...
    call npx cap sync android
    pause
    exit /b
)

exit /b
