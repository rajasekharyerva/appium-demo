# Appium
### Install node, appium, android sdk, device manager
    npm install -g appium
    npm install -g adb
    npm install -g appium-uiautomator2-driver
    appium --version
    adb --version
    adb devices
**Export path in zshrc**
```    
export ANDROID_HOME=$HOME/Library/Android/sdk
export ANDROID_SDK_ROOT=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools::$ANDROID_HOME/emulator
```

## appium-inspector
[Appium Inspector](https://github.com/appium/appium-inspector/releases)
```
Provide Capabilities
Attach Session
```