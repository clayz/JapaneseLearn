/**
 * 
 */
package com.clay.japanese.utils;

import java.util.Locale;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 14, 2013
 * @version 0.1
 */
public class StringUtil {
    public static String format(String format, Object... args) {
        return String.format(Locale.CHINA, format, args);
    }
}
