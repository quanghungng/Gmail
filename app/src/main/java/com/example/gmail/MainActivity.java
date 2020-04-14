package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ContactModel> contactModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactModelList = new ArrayList<>();
        contactModelList.add(new ContactModel("Quang Hung",R.drawable.thumb1,"12:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("Thanh Nam",R.drawable.thumb2,"01:00","Friendship is an emotion of care, mutual trust, and fondness among three persons."));
        contactModelList.add(new ContactModel("Phi Hung",R.drawable.thumb3,"02:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("Ba Tu",R.drawable.thumb4,"03:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("Ho Hai",R.drawable.thumb5,"04:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("Ngoc Linh",R.drawable.thumb6,"05:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("Kim Quy",R.drawable.thumb7,"06:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("Nhu Anh",R.drawable.thumb8,"07:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("name9",R.drawable.thumb9,"08:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("name10",R.drawable.thumb10,"09:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));
        contactModelList.add(new ContactModel("name11",R.drawable.thumb11,"10:00","Friendship is an emotion of care, mutual trust, and fondness among two persons."));

        ContactAdapter adapter = new ContactAdapter(contactModelList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
