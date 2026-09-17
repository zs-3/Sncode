package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class ReflectionPool<T> extends com.badlogic.gdx.utils.Pool<T> {
    private final com.badlogic.gdx.utils.reflect.Constructor constructor;

    public ReflectionPool(java.lang.Class<T> r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r3, r4)
            com.badlogic.gdx.utils.reflect.Constructor r3 = r1.findConstructor(r2)
            r1.constructor = r3
            if (r3 == 0) goto Lc
            return
        Lc:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Class cannot be created (missing no-arg constructor): "
            r4.append(r0)
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    private com.badlogic.gdx.utils.reflect.Constructor findConstructor(java.lang.Class<T> r3) {
            r2 = this;
            r0 = 0
            com.badlogic.gdx.utils.reflect.Constructor r3 = com.badlogic.gdx.utils.reflect.ClassReflection.getConstructor(r3, r0)     // Catch: java.lang.Exception -> L6
            return r3
        L6:
            com.badlogic.gdx.utils.reflect.Constructor r3 = com.badlogic.gdx.utils.reflect.ClassReflection.getDeclaredConstructor(r3, r0)     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> Lf
            r1 = 1
            r3.setAccessible(r1)     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> Lf
            return r3
        Lf:
            return r0
    }

    @Override // com.badlogic.gdx.utils.Pool
    protected T newObject() {
            r4 = this;
            com.badlogic.gdx.utils.reflect.Constructor r0 = r4.constructor     // Catch: java.lang.Exception -> L8
            r1 = 0
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L8
            return r0
        L8:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to create new instance: "
            r2.append(r3)
            com.badlogic.gdx.utils.reflect.Constructor r3 = r4.constructor
            java.lang.Class r3 = r3.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }
}
