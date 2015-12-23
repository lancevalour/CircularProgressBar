# CircularProgressBar
Yet another Circular Progres Bar.

## Installation
```
compile 'com.zyceeit.android.circularprogressbar:circularprogressbar:0.1.0'
```
## Usage
```xml
  <com.zyceeit.android.circularprogressbar.CircularProgressBar
      android:id="@+id/circularProgressBar"
      android:layout_width="200dp"
      android:layout_height="200dp"
      android:layout_centerInParent="true"
      app:progressBarColor="#f44336"
      app:progressBarThickness="10dp" />
```

```java
  CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.circularProgressBar);
  circularProgressBar.setProgressWithAnimation(100);
```


## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## History

TODO: Write history

## Credits

TODO: Write credits

## License

TODO: Write license
