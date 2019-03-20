# lab2_Android布局<br>
实验目的：学习ConstraintLayout, LinearLayout和TableLayout的相关内容<br>
内容一：线性布局<br>
实验截图：<br>
![image](https://github.com/wrh0619/lab2_Android/blob/master/images/%E6%8D%95%E8%8E%B7.JPG)<br>
关键代码：<br>
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="5"
            android:orientation="vertical">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1">

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="One,One" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:text="One,Two" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="One,Three" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="One,Four" />

            </LinearLayout>
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1">

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Two,One" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:text="Two,Two" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Two,Three" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Two,Four" />

            </LinearLayout>
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1">

                <Button
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Three,One" />

                <Button
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Three,Two" />

                <Button
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Three,Three" />

                <Button
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Three,Four" />

            </LinearLayout>
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1">

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="four,One" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:text="four,Two" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="four,Three" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="four,Four" />

            </LinearLayout>
        </LinearLayout>
    </LinearLayout>
</android.support.constraint.ConstraintLayout>
```
实验内容二:约束布局
实验截图：<br>
![image](https://github.com/wrh0619/lab2_Android/blob/master/images/%E6%8D%95%E8%8E%B722.JPG)<br>
关键代码：<br>
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:minHeight="0dp"
    android:background="@android:color/black"
    android:orientation="horizontal">
    <Button
        android:id="@+id/a1"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:background="@android:color/holo_red_dark"
        android:layout_marginStart="3dp"
        android:textColor="@android:color/black"
        android:text="red"/>
    <Button
        android:id="@+id/a2"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="152dp"
        android:background="@android:color/holo_orange_dark"
        android:textColor="@android:color/black"
        android:text="Orange" />
    <Button
        android:id="@+id/c"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="302dp"
        android:background="@android:color/holo_orange_light"
        android:textColor="@android:color/black"
        android:text="Yellow" />
    <Button
        android:id="@+id/d"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="80dp"
        android:layout_marginTop="100dp"
        android:background="@android:color/holo_green_light"
        android:textColor="@android:color/black"
        android:text="Green" />
    <Button
        android:id="@+id/e"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="170dp"
        android:layout_marginTop="100dp"
        android:background="@android:color/holo_blue_light"
        android:textColor="@android:color/black"
        android:text="Blue" />
    <Button
        android:id="@+id/f"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="260dp"
        android:layout_marginTop="100dp"
        android:background="@android:color/holo_purple"
        android:textColor="@android:color/black"
        android:text="Indigo" />
    <Button
        android:id="@+id/g"
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:layout_marginTop="200dp"
        android:background="@android:color/holo_red_light"
        android:textColor="@android:color/black"
        android:text="Violef" />

</RelativeLayout>
```
实验内容三：表格布局<br>
实验截图：<br>
![image](https://github.com/wrh0619/lab2_Android/blob/master/images/%E6%8D%95%E8%8E%B71.JPG)<br>
关键代码：<br>
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:stretchColumns="1"
    android:background="@android:color/black">
<TableRow>
    <TextView
        android:layout_column="1"
        android:text="Open..."
        android:padding="3dip"
        android:textColor="@android:color/darker_gray"/>
    <TextView
       android:text="Ctrl-O"
        android:gravity="right"
        android:padding="3dip"
        android:textColor="@android:color/darker_gray"/>
</TableRow>
<TableRow>
    <TextView
        android:layout_column="1"
        android:text="Save..."
        android:padding="3dip"
        android:textColor="@android:color/darker_gray"/>
    <TextView
        android:text="Ctrl-S"
        android:gravity="right"
        android:padding="3dip"
        android:textColor="@android:color/darker_gray"/>
</TableRow>
<TableRow>
    <TextView
        android:layout_column="1"
        android:text="Save As..."
        android:padding="3dip"
        android:textColor="@android:color/darker_gray"/>
    <TextView
        android:text="Ctrl-Shift-S"
        android:gravity="right"
        android:padding="3dip"
        android:textColor="@android:color/darker_gray"/>
</TableRow>
<View
android:layout_height="2dip"
android:background="@android:color/darker_gray"/>
<TableRow>
    <TextView
        android:text="X"
        android:textColor="@android:color/darker_gray"
        android:padding="3dip"/>
    <TextView
        android:text="Import..."
        android:textColor="@android:color/darker_gray"
        android:padding="3dip"/>
</TableRow>
<TableRow>
    <TextView
        android:text="X"
        android:textColor="@android:color/darker_gray"
        android:padding="3dip"/>
    <TextView android:text="Emport..."
        android:textColor="@android:color/darker_gray"
        android:padding="3dip"/>
    <TextView
        android:text="Ctrl-E"
        android:gravity="right"
        android:textColor="@android:color/darker_gray"
        android:padding="3dip"/>
</TableRow>
    <View
        android:layout_height="2dip"
        android:background="#ffffff"/>
    <TableRow> <TextView
        android:layout_column="1"
        android:textColor="#ffffff"
        android:text="Quit"
        android:padding="3dip"/>
    </TableRow>
</TableLayout>

```
