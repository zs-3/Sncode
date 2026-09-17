package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class GdxNativesLoader {
    public static boolean disableNativesLoading;
    private static boolean nativesLoaded;

    static {
            return
    }

    public static synchronized void load() {
            java.lang.Class<com.badlogic.gdx.utils.GdxNativesLoader> r0 = com.badlogic.gdx.utils.GdxNativesLoader.class
            monitor-enter(r0)
            boolean r1 = com.badlogic.gdx.utils.GdxNativesLoader.nativesLoaded     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            boolean r1 = com.badlogic.gdx.utils.GdxNativesLoader.disableNativesLoading     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto Lf
            monitor-exit(r0)
            return
        Lf:
            com.badlogic.gdx.utils.SharedLibraryLoader r1 = new com.badlogic.gdx.utils.SharedLibraryLoader     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "gdx"
            r1.load(r2)     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            com.badlogic.gdx.utils.GdxNativesLoader.nativesLoaded = r1     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return
        L1e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
