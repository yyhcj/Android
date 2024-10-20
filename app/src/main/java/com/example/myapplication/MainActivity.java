package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 启用全面屏适配
        EdgeToEdge.enable(this);
        // 设置布局文件
        setContentView(R.layout.activity_main);
        // 查找视图并设置系统栏内边距
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // 正确的初始化 ImageView 的位置
        ImageView space_station = findViewById(R.id.space_station);
        space_station.setImageResource(R.drawable.space_station_icon);
        ImageView double_arrows = findViewById(R.id.double_arrows);
        double_arrows.setImageResource(R.drawable.double_arrows);
        ImageView rocket_icon = findViewById(R.id.rocket_icon);
        rocket_icon.setImageResource(R.drawable.rocket_icon);
        ImageView rover = findViewById(R.id.rover_icon);
        rover.setImageResource(R.drawable.rover_icon);
        ImageView rocket_icon1 = findViewById(R.id.rocket_icon1);
        rocket_icon1.setImageResource(R.drawable.rocket_icon);
        ImageView galaxy=findViewById(R.id.galaxy);
        galaxy.setImageResource(R.drawable.galaxy);
    }
}