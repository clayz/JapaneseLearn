/**
 * 
 */
package com.clay.japanese.db.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Sep 9, 2013
 * @version 0.1
 */
@DatabaseTable(tableName = "article")
public class Article extends Model {
    private static final long serialVersionUID = -6023506163767952616L;

    @DatabaseField(canBeNull = false, foreign = true)
    private Chapter chapter;

    @DatabaseField(columnName = "title_jp", canBeNull = false)
    private String titleJP;

    @DatabaseField(columnName = "title_cn", canBeNull = false)
    private String titleCN;

    @DatabaseField(columnName = "content_jp", canBeNull = false)
    private String contentJP;

    @DatabaseField(columnName = "content_cn", canBeNull = false)
    private String contentCN;

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
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

    public String getContentJP() {
        return contentJP;
    }

    public void setContentJP(String contentJP) {
        this.contentJP = contentJP;
    }

    public String getContentCN() {
        return contentCN;
    }

    public void setContentCN(String contentCN) {
        this.contentCN = contentCN;
    }
}
