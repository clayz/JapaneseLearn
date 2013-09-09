/**
 * 
 */
package com.clay.japanese.db.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Aug 4, 2013
 * @version 0.1
 */
@DatabaseTable(tableName = "sentence")
public class Sentence extends Model {
    private static final long serialVersionUID = 2711669886850692893L;

    @DatabaseField(canBeNull = false, foreign = true)
    private Chapter chapter;

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
