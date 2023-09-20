package singleton;

import java.util.HashMap;

public class CacheManager {
    public static CacheManager cacheManager;
    private HashMap<String, String> cache = new HashMap<>();
    private CacheManager(){

    }

    public static CacheManager getInstance(){
        if(cacheManager == null){
            synchronized (CacheManager.class) {
                if(cacheManager == null) {
                    cacheManager = new CacheManager();
                }
            }
        }
        return cacheManager;
    }

    public void addToCache(String key, String value) {
        cache.put(key, value);
    }

    public HashMap<String, String> getCache() {
        return cache;
    }

    public void removeFromCache(String key) {
        cache.remove(key);
    }
}
