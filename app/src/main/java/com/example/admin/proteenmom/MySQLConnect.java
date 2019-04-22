package com.example.admin.proteenmom;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class MySQLConnect {

        private final Activity main;
        private List<String> list;
        private String URL ="http://192.168.0.104", GET_URL ="proteenmom/get_post.php", SENT_POST = "proteenmom/sent_post.php";
    public MySQLConnect() {main=null;}

    public MySQLConnect(Activity mainA){
        main = mainA;
        list = new ArrayList<String>();
    }


}
