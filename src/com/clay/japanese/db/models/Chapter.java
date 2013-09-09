/**
 * 
 */
package com.clay.japanese.db.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 14, 2013
 * @version 0.1
 */
@DatabaseTable(tableName = "chapter")
public class Chapter extends Model {
    private static final long serialVersionUID = 8922959921398001484L;

    @DatabaseField(canBeNull = false, foreign = true)
    private Book book;

    @DatabaseField(columnName = "title_jp", canBeNull = false)
    private String titleJP;

    @DatabaseField(columnName = "title_cn", canBeNull = false)
    private String titleCN;

    @DatabaseField(columnName = "description_jp")
    private String descriptionJP;

    @DatabaseField(columnName = "description_cn")
    private String descriptionCN;

    @DatabaseField(columnName = "is_learn")
    private boolean isLearn;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getTitleJP() {
        return titleJP;
    }

    public void setTitleJP(String titleJP) {
        this.titleJP = titleJP;
    }

    public String getTitleCN() {
        return titleCN;
    }

    public void setTitleCN(String titleCN) {
        this.titleCN = titleCN;
    }

    public String getDescriptionJP() {
        return descriptionJP;
    }

    public void setDescriptionJP(String descriptionJP) {
        this.descriptionJP = descriptionJP;
    }

    public String getDescriptionCN() {
        return descriptionCN;
    }

    public void setDescriptionCN(String descriptionCN) {
        this.descriptionCN = descriptionCN;
    }

    public boolean isLearn() {
        return isLearn;
    }

    public void setLearn(boolean isLearn) {
        this.isLearn = isLearn;
    }
}
