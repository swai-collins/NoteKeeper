package com.example.notekeeper;

import android.provider.BaseColumns;

public final class NoteKeeperDatabaseContract {
    private NoteKeeperDatabaseContract () {} //make non-crreatable
        public static final class CourseInfoEntry implements BaseColumns {
            public static final String TABLE_NAME = "course_info";
            public static final String COLUMN_COUSRSE_ID = "course_id";
            public static final String COLUMN_COURSE_TITLE = "course_title";


            //CREATE TABLE course_info(course_id, course_title)
            public static final String SQL_CREATE_TABLE =
                        "CREATE TABLE " + TABLE_NAME + "(" +
                                COLUMN_COUSRSE_ID + "TEXT UNIQUE NOT NULL" +
                                COLUMN_COURSE_TITLE +"TEXT NOT NULL)";
        }
        public static final class NoteInfoEntry {
        public static final String TABLE_NAME = "note_info";
        public static final String COLUMN_NOTE_TITLE = "note_title";
        public static final String COLUMN_NOTE_TEXT = "note_text";
        public static final String COLUMN_COURSE_ID = "course_id";



            public static final String SQL_CREATE_TABLE =
                        "CREATE TABLE" + TABLE_NAME + "(" +
                                COLUMN_NOTE_TITLE + " TEXT NOT NULL, " +
                                COLUMN_NOTE_TEXT + " TEXT, " +
                                COLUMN_COURSE_ID + " TEXT NOT NULL)";
        }
}
