package singleton;

public class Singleton {
    public void demo() {
        CacheManager cacheManager1 = CacheManager.getInstance();
        cacheManager1.addToCache("cache 1", "Type 1");
        CacheManager cacheManager2 = CacheManager.getInstance();
        cacheManager2.addToCache("cache 2", "Type 2");

        System.out.println(cacheManager1.hashCode());
        System.out.println(cacheManager2.hashCode());


        System.out.println(cacheManager1.getCache());
        cacheManager1.removeFromCache("cache 1");
        System.out.println(cacheManager2.getCache());
    }
}
