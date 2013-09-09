/**
 * 
 */
package com.clay.japanese.db;

import android.provider.BaseColumns;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 12, 2013
 * @version 0.1
 */
public final class DBContract {
    /**
     * Define an empty constructor to prevent someone from accidentally instantiating the contract class,
     */
    public DBContract() {}

    public static abstract class BookColumns implements BaseColumns {
        public static final String TABLE_NAME = "book";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_SUBTITLE = "subtitle";
        public static final String COLUMN_PUBLISHER = "publisher";
        public static final String COLUMN_AUTHOR = "author";
    }

    public static abstract class ChapterColumns implements BaseColumns {
        public static final String TABLE_NAME = "chapter";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_BOOK_ID = "book_id";
        public static final String COLUMN_TITLE = "title";
    }

    public static abstract class WordColumns implements BaseColumns {
        public static final String TABLE_NAME = "word";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_CHAPTER = "chapter_id";
        public static final String COLUMN_HIRAGANA = "hiragana";
        public static final String COLUMN_KATAKANA = "katakana";
        public static final String COLUMN_KANNJI = "kannji";
        public static final String COLUMN_CHINESE = "chinese";
    }
}
