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
@DatabaseTable(tableName = "word")
public class Word extends Model {
    private static final long serialVersionUID = -300407995076080632L;

    @DatabaseField(canBeNull = false, foreign = true)
    private Chapter chapter;

    @DatabaseField
    private String hiragana;

    @DatabaseField
    private String katakana;

    @DatabaseField
    private String kannji;

    @DatabaseField
    private String chinese;

    public String getHiragana() {
        return hiragana;
    }

    public void setHiragana(String hiragana) {
        this.hiragana = hiragana;
    }

    public String getKatakana() {
        return katakana;
    }

    public void setKatakana(String katakana) {
        this.katakana = katakana;
    }

    public String getKannji() {
        return kannji;
    }

    public void setKannji(String kannji) {
        this.kannji = kannji;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
}
