/**
 * 
 */
package com.clay.japanese.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 12, 2013
 * @version 0.1
 */
public class FileUtil {
    /**
     * 
     * @param in
     * @return
     * @throws IOException
     */
    public static String read(InputStream in) throws IOException {
        ByteArrayOutputStream out = null;

        try {
            out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length = 0;

            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }

            return new String(out.toByteArray());
        } finally {
            if (out != null) out.close();
        }
    }
}
