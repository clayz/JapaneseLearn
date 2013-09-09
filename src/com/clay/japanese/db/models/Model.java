/**
 * 
 */
package com.clay.japanese.db.models;

import java.io.Serializable;

import com.j256.ormlite.field.DatabaseField;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 14, 2013
 * @version 0.1
 */
public abstract class Model implements Serializable {
    private static final long serialVersionUID = -7342512389042508194L;

    @DatabaseField(generatedId = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
