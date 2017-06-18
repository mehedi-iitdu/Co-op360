package com.datasoft.co_op360.storage.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by mehedi on 5/24/17.
 */

@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {

    public static final String NAME = "MyDataBase";

    public static final int VERSION = 1;
}