@echo off
echo =======================================================
echo   Leafy Mobile - Android Launcher
echo   Istanbul Beykent Universitesi Bilgisayar Programciligi
echo =======================================================
echo.

if exist "release\leafy-debug-v1.0.apk" (
    echo [i] Hazir yuklenebilir APK: release\leafy-debug-v1.0.apk
    echo.
)

echo [1] Projeyi Android Studio ile ac
echo [2] Capacitor Android Sync calistir
echo [3] Cikis
echo.

set /p choice="Seciminizi yapin (1/2/3): "

if "%choice%"=="1" (
    echo.
    echo Android Studio baslatiliyor...
    npx cap open android
    pause
    exit /b
)

if "%choice%"=="2" (
    echo.
    echo Capacitor Sync calisiyor...
    npx cap sync android
    pause
    exit /b
)

exit /b
