/**
 * 
 */
package com.clay.japanese.db;

import java.io.IOException;
import java.sql.SQLException;

import com.clay.japanese.db.models.Book;
import com.clay.japanese.db.models.Chapter;
import com.clay.japanese.db.models.Word;
import com.clay.japanese.utils.FileUtil;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 12, 2013
 * @version 0.1
 */
public class DBHelper extends OrmLiteSqliteOpenHelper {
    private static final String TAG = DBHelper.class.getSimpleName();

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "JapaneseLearn.db";
    private static final String DB_FOLDER = "db/";
    private static final String DB_CREATION_FILE = "schema.sql";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqliteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, Book.class);
            TableUtils.createTableIfNotExists(connectionSource, Chapter.class);
            TableUtils.createTableIfNotExists(connectionSource, Word.class);
        } catch (SQLException e) {
            Log.e(TAG, "Table creation failed.", e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqliteDatabase, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
    }
}
