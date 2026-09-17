package com.badlogic.gdx.utils.reflect;

/* loaded from: classes.dex */
public final class ClassReflection {
    public static java.lang.Class forName(java.lang.String r4) throws com.badlogic.gdx.utils.reflect.ReflectionException {
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L5
            return r4
        L5:
            r0 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r1 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class not found: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    public static com.badlogic.gdx.utils.reflect.Constructor getConstructor(java.lang.Class r3, java.lang.Class... r4) throws com.badlogic.gdx.utils.reflect.ReflectionException {
            com.badlogic.gdx.utils.reflect.Constructor r0 = new com.badlogic.gdx.utils.reflect.Constructor     // Catch: java.lang.NoSuchMethodException -> La java.lang.SecurityException -> L26
            java.lang.reflect.Constructor r4 = r3.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> La java.lang.SecurityException -> L26
            r0.<init>(r4)     // Catch: java.lang.NoSuchMethodException -> La java.lang.SecurityException -> L26
            return r0
        La:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Constructor not found for class: "
            r1.append(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
        L26:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Security violation occurred while getting constructor for class: '"
            r1.append(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = "'."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    public static com.badlogic.gdx.utils.reflect.Constructor getDeclaredConstructor(java.lang.Class r3, java.lang.Class... r4) throws com.badlogic.gdx.utils.reflect.ReflectionException {
            com.badlogic.gdx.utils.reflect.Constructor r0 = new com.badlogic.gdx.utils.reflect.Constructor     // Catch: java.lang.NoSuchMethodException -> La java.lang.SecurityException -> L26
            java.lang.reflect.Constructor r4 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> La java.lang.SecurityException -> L26
            r0.<init>(r4)     // Catch: java.lang.NoSuchMethodException -> La java.lang.SecurityException -> L26
            return r0
        La:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Constructor not found for class: "
            r1.append(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
        L26:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Security violation while getting constructor for class: "
            r1.append(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    public static com.badlogic.gdx.utils.reflect.Field[] getDeclaredFields(java.lang.Class r5) {
            java.lang.reflect.Field[] r5 = r5.getDeclaredFields()
            int r0 = r5.length
            com.badlogic.gdx.utils.reflect.Field[] r0 = new com.badlogic.gdx.utils.reflect.Field[r0]
            int r1 = r5.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L17
            com.badlogic.gdx.utils.reflect.Field r3 = new com.badlogic.gdx.utils.reflect.Field
            r4 = r5[r2]
            r3.<init>(r4)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L9
        L17:
            return r0
    }

    public static java.lang.String getSimpleName(java.lang.Class r0) {
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public static boolean isAssignableFrom(java.lang.Class r0, java.lang.Class r1) {
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public static boolean isMemberClass(java.lang.Class r0) {
            boolean r0 = r0.isMemberClass()
            return r0
    }

    public static boolean isStaticClass(java.lang.Class r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    public static <T> T newInstance(java.lang.Class<T> r4) throws com.badlogic.gdx.utils.reflect.ReflectionException {
            java.lang.String r0 = "Could not instantiate instance of class: "
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.IllegalAccessException -> L7 java.lang.InstantiationException -> L21
            return r4
        L7:
            r1 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r2 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r2.<init>(r4, r1)
            throw r2
        L21:
            r1 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r2 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r2.<init>(r4, r1)
            throw r2
    }
}
