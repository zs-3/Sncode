package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Pools {
    private static final com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> typePools = null;

    static {
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            com.badlogic.gdx.utils.Pools.typePools = r0
            return
    }

    public static void free(java.lang.Object r2) {
            if (r2 == 0) goto L15
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = com.badlogic.gdx.utils.Pools.typePools
            java.lang.Class r1 = r2.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.utils.Pool r0 = (com.badlogic.gdx.utils.Pool) r0
            if (r0 != 0) goto L11
            return
        L11:
            r0.free(r2)
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "object cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public static void freeAll(com.badlogic.gdx.utils.Array r6, boolean r7) {
            if (r6 == 0) goto L2b
            r0 = 0
            int r1 = r6.size
            r2 = 0
            r3 = r2
        L7:
            if (r0 >= r1) goto L2a
            java.lang.Object r4 = r6.get(r0)
            if (r4 != 0) goto L10
            goto L27
        L10:
            if (r3 != 0) goto L21
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r3 = com.badlogic.gdx.utils.Pools.typePools
            java.lang.Class r5 = r4.getClass()
            java.lang.Object r3 = r3.get(r5)
            com.badlogic.gdx.utils.Pool r3 = (com.badlogic.gdx.utils.Pool) r3
            if (r3 != 0) goto L21
            goto L27
        L21:
            r3.free(r4)
            if (r7 != 0) goto L27
            r3 = r2
        L27:
            int r0 = r0 + 1
            goto L7
        L2a:
            return
        L2b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "objects cannot be null."
            r6.<init>(r7)
            throw r6
    }

    public static <T> com.badlogic.gdx.utils.Pool<T> get(java.lang.Class<T> r1) {
            r0 = 100
            com.badlogic.gdx.utils.Pool r1 = get(r1, r0)
            return r1
    }

    public static <T> com.badlogic.gdx.utils.Pool<T> get(java.lang.Class<T> r3, int r4) {
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = com.badlogic.gdx.utils.Pools.typePools
            java.lang.Object r1 = r0.get(r3)
            com.badlogic.gdx.utils.Pool r1 = (com.badlogic.gdx.utils.Pool) r1
            if (r1 != 0) goto L13
            com.badlogic.gdx.utils.ReflectionPool r1 = new com.badlogic.gdx.utils.ReflectionPool
            r2 = 4
            r1.<init>(r3, r2, r4)
            r0.put(r3, r1)
        L13:
            return r1
    }

    public static <T> T obtain(java.lang.Class<T> r0) {
            com.badlogic.gdx.utils.Pool r0 = get(r0)
            java.lang.Object r0 = r0.obtain()
            return r0
    }
}
