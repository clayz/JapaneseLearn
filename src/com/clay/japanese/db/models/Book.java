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
@DatabaseTable(tableName = "book")
public class Book extends Model {
    private static final long serialVersionUID = -1788116965613935527L;

    @DatabaseField(columnName = "title_jp", canBeNull = false)
    private String titleJP;

    @DatabaseField(columnName = "title_cn", canBeNull = false)
    private String titleCN;

    @DatabaseField(columnName = "subtitle_jp")
    private String subtitleJP;

    @DatabaseField(columnName = "subtitle_cn")
    private String subtitleCN;

    @DatabaseField
    private String publisher;

    @DatabaseField
    private String author;

    @DatabaseField(canBeNull = false)
    private String cover;

    @DatabaseField(columnName = "description_jp")
    private String descriptionJP;

    @DatabaseField(columnName = "description_cn")
    private String descriptionCN;

    @DatabaseField(columnName = "is_learn")
    private boolean isLearn;

    public Book() {}

    public Book(String titleJP, String titleCN, String subtitleJP, String subtitleCN, String publisher, String author, String cover,
            String descriptionJP, String descriptionCN, boolean isLearn) {
        super();
        this.titleJP = titleJP;
        this.titleCN = titleCN;
        this.subtitleJP = subtitleJP;
        this.subtitleCN = subtitleCN;
        this.publisher = publisher;
        this.author = author;
        this.cover = cover;
        this.descriptionJP = descriptionJP;
        this.descriptionCN = descriptionCN;
        this.isLearn = isLearn;
    }

    @Override
    public String toString() {
        return "Book [titleJP=" + titleJP + ", titleCN=" + titleCN + ", subtitleJP=" + subtitleJP + ", subtitleCN=" + subtitleCN + ", publisher="
                + publisher + ", author=" + author + ", cover=" + cover + ", descriptionJP=" + descriptionJP + ", descriptionCN=" + descriptionCN
                + ", isLearn=" + isLearn + "]";
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

    public String getSubtitleJP() {
        return subtitleJP;
    }

    public void setSubtitleJP(String subtitleJP) {
        this.subtitleJP = subtitleJP;
    }

    public String getSubtitleCN() {
        return subtitleCN;
    }

    public void setSubtitleCN(String subtitleCN) {
        this.subtitleCN = subtitleCN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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
