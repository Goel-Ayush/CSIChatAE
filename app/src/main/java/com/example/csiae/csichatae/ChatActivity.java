package com.example.csiae.csichatae;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ArrayList<Chats> chatsadapter = new ArrayList<Chats>();
        chatsadapter.add(new Chats("Abc1"));
        chatsadapter.add(new Chats("Abc2"));
        chatsadapter.add(new Chats("Abc3"));
        chatsadapter.add(new Chats("Abc4"));
        chatsadapter.add(new Chats("Abc5"));
        chatsadapter.add(new Chats("Abc6"));

        ChatArrayadpter chatadapter = new ChatArrayadpter(this,chatsadapter);
        ListView listView = (ListView)findViewById(R.id.ListChats);
        listView.setAdapter(chatadapter);
    }


}
