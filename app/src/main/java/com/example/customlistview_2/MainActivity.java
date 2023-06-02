package com.example.customlistview_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);

        //Data
        ArrayList<Language> arrayList = new ArrayList<>();

        arrayList.add(new Language(R.drawable.cplus, "C++", "Released in 1995"));
        arrayList.add(new Language(R.drawable.csharp, "C sharp", "Released in 1995"));
        arrayList.add(new Language(R.drawable.go, "Go", "Released in 1995"));
        arrayList.add(new Language(R.drawable.java, "Java", "Released in 1995"));
        arrayList.add(new Language(R.drawable.flutter, "Flutter", "Released in 1995"));
        arrayList.add(new Language(R.drawable.php, "PHP", "Released in 1995"));
        arrayList.add(new Language(R.drawable.python, "Python", "Released in 1995"));
        arrayList.add(new Language(R.drawable.ruby, "Ruby", "Released in 1995"));
        arrayList.add(new Language(R.drawable.rust, "Rust", "Released in 1995"));
        arrayList.add(new Language(R.drawable.javascript, "Java script", "Released in 1995"));

        //Adapter

        LanguageAdapter languageAdapter = new LanguageAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(languageAdapter);
    }
}