# ProgressImageLoader
It downloads an image from the internet using Glide and displays a progress bar on the screen until the image is loaded. All settings can be customized.

Usage:
```xml
<ImageView
    ...
    android:download="https://www.ibb.com/1111"
    .../>
```
If you want to change the progress bar style use `ProgressBarBuilder`.


Import your project:
```gradle
allprojects {
    repositories {
      maven { url 'https://jitpack.io' }
    }
}
```

```gradle
dependencies {
        implementation 'com.github.furkanbalci0:ProgressImageLoader:v0.1.0'
}
```
