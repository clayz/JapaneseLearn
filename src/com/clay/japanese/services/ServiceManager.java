/**
 * 
 */
package com.clay.japanese.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 18, 2013
 * @version 0.1
 */
public class ServiceManager {

    private static final String TAG = ServiceManager.class.getSimpleName();

    private static ServiceManager serviceManager = new ServiceManager();

    @SuppressWarnings("rawtypes")
    private Map<Class<?>, BaseService> serviceMap = new HashMap<Class<?>, BaseService>();

    private ServiceManager() {}

    public static ServiceManager getInstance() {
        return serviceManager;
    }

    @SuppressWarnings("rawtypes")
    public synchronized void release(Context context) {
        for (Entry<Class<?>, BaseService> entry : this.serviceMap.entrySet()) {
            entry.getValue().releaseDBHelper();
        }

        this.serviceMap.clear();
    }

    public BookService getBookService(Context context) {
        if (!this.serviceMap.containsKey(BookService.class)) {
            Log.d(TAG, "Creating book service for context: " + context.toString());

            synchronized (this.serviceMap) {
                BookService service = new BookService();
                service.setContext(context);
                this.serviceMap.put(BookService.class, service);
            }
        }

        return (BookService) this.serviceMap.get(BookService.class);
    }
}
