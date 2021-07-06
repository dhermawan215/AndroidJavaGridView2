package com.example.gridview2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewImageTextActivity extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Android Studio", "Kotlin", "React Native",
            "Android Studio", "Kotlin", "React Native",
            "Android Studio", "Kotlin", "React Native",
    };

    int[] gridViewImageId = {
            R.drawable.androidstudio,R.drawable.kotlin, R.drawable.react,
            R.drawable.androidstudio,R.drawable.kotlin, R.drawable.react,
            R.drawable.androidstudio,R.drawable.kotlin, R.drawable.react,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text);

        CustomGridViewActivity AdapterViewAndroid = new CustomGridViewActivity(GridViewImageTextActivity.this, gridViewString, gridViewImageId);
        androidGridView = (GridView) findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(AdapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(GridViewImageTextActivity.this, "GridViewItem : " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
