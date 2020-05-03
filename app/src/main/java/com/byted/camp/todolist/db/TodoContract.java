package com.byted.camp.todolist.db;

import android.provider.BaseColumns;


/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TodoContract.NoteEntry.TABLE_NAME + " (" +
                    NoteEntry.COLUMN_NAME_ID+ " INTEGER PRIMARY KEY," +
                    NoteEntry.COLUMN_NAME_DATE + " INTEGER," +
                    NoteEntry.COLUMN_NAME_STATE + " INTEGER,"+
                    NoteEntry.COLUMN_NAME_CONTENT + " TEXT)";

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TodoContract.NoteEntry.TABLE_NAME;

    /* Inner class that defines the table contents */
    public static class NoteEntry implements BaseColumns {

        public static final String TABLE_NAME = "note";

        public static final String COLUMN_NAME_ID = "id";

        public static final String COLUMN_NAME_DATE = "date";

        public static final String COLUMN_NAME_CONTENT = "content";

        public static  final String COLUMN_NAME_STATE = "state";
    }
    private TodoContract() {
    }

}
