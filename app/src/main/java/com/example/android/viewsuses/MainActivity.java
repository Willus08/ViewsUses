package com.example.android.viewsuses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContacts;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private DefaultItemAnimator defaultItemAnimator;
    private List<Contact> contactList = new ArrayList<>();
    private ContactsAdapter contactsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts =(ListView) findViewById(R.id.lvContacts);
        String [] values = new  String[]{"Me", "Myself", "I"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, android.R.id.text1,values);
        lvContacts.setAdapter(adapter);


        recyclerView = (RecyclerView) findViewById(R.id.rvTesting);
        contactList.add(new Contact("will", "27", "23783197"));
        contactList.add(new Contact("richard", "28", "23783197"));
        contactList.add(new Contact("raul", "32", "23783197"));
        contactList.add(new Contact("ace", "40", "23783197"));
        contactList.add(new Contact("ivy", "43", "23783197"));
        layoutManager = new GridLayoutManager(this,3);
        defaultItemAnimator = new DefaultItemAnimator();
        contactsAdapter = new ContactsAdapter(contactList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(defaultItemAnimator);
        recyclerView.setAdapter(contactsAdapter);

    }

    public void addContact(View view) {
        Contact contact = new Contact("William",  "28" , "291929292");
        contactList.add(contact);
        contactsAdapter.notifyDataSetChanged();
    }
}
