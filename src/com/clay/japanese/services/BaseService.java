/**
 * 
 */
package com.clay.japanese.services;

import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;

import android.content.Context;
import android.util.Log;

import com.clay.japanese.common.Pager;
import com.clay.japanese.db.DBHelper;
import com.clay.japanese.db.models.Model;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 18, 2013
 * @version 0.1
 */
public abstract class BaseService<T extends Model> {
    private static final String TAG = BaseService.class.getSimpleName();

    private DBHelper dbHelper = null;

    protected Context context;

    @SuppressWarnings("unchecked")
    protected Dao<T, Integer> getDao() throws SQLException {
        return this.getDBHelper().getDao((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }

    protected QueryBuilder<T, Integer> getQueryBuilder() throws SQLException {
        return this.getDao().queryBuilder();
    }

    protected QueryBuilder<T, Integer> getQueryBuilder(Pager<T> pager) throws SQLException {
        QueryBuilder<T, Integer> queryBuilder = this.getDao().queryBuilder();
        queryBuilder.offset(pager.getOffset());
        queryBuilder.limit(pager.getLimit());

        return queryBuilder;
    }

    protected synchronized DBHelper getDBHelper() {
        if (this.dbHelper == null) {
            Log.d(TAG, "Open database helper for context: " + this.context.toString());
            this.dbHelper = OpenHelperManager.getHelper(this.context, DBHelper.class);
        }

        return this.dbHelper;
    }

    public synchronized void releaseDBHelper() {
        if (this.dbHelper != null) {
            OpenHelperManager.releaseHelper();
            this.dbHelper = null;
        }
    }

    public T get(int id) throws SQLException {
        return this.getDao().queryForId(id);
    }

    public void create(T model) throws SQLException {
        this.getDao().create(model);
    }

    public void update(T model) throws SQLException {
        this.getDao().update(model);
    }

    public void delete(int id) throws SQLException {
        this.getDao().deleteById(id);
    }

    public void delete(T model) throws SQLException {
        this.getDao().delete(model);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
