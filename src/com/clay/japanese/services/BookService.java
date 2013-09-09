/**
 * 
 */
package com.clay.japanese.services;

import java.sql.SQLException;

import com.clay.japanese.common.Constants;
import com.clay.japanese.common.Pager;
import com.clay.japanese.db.models.Book;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 18, 2013
 * @version 0.1
 */
public class BookService extends BaseService<Book> {
    public Pager<Book> list() throws SQLException {
        Pager<Book> pager = new Pager<Book>(Constants.DB.DEFAULT_OFFSET, Constants.DB.LIMIT_ALL);
        pager.setData(super.getDao().queryForAll());

        return pager;
    }
}
