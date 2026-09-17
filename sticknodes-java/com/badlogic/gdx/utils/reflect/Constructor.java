package com.badlogic.gdx.utils.reflect;

/* loaded from: classes.dex */
public final class Constructor {
    private final java.lang.reflect.Constructor constructor;

    Constructor(java.lang.reflect.Constructor r1) {
            r0 = this;
            r0.<init>()
            r0.constructor = r1
            return
    }

    public java.lang.Class getDeclaringClass() {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.constructor
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    public java.lang.Object newInstance(java.lang.Object... r4) throws com.badlogic.gdx.utils.reflect.ReflectionException {
            r3 = this;
            java.lang.String r0 = "Could not instantiate instance of class: "
            java.lang.reflect.Constructor r1 = r3.constructor     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> L29 java.lang.InstantiationException -> L47 java.lang.IllegalArgumentException -> L65
            java.lang.Object r4 = r1.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> L29 java.lang.InstantiationException -> L47 java.lang.IllegalArgumentException -> L65
            return r4
        L9:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception occurred in constructor for class: "
            r1.append(r2)
            java.lang.Class r2 = r3.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
        L29:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r1 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r4)
            throw r1
        L47:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r1 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r4)
            throw r1
        L65:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal argument(s) supplied to constructor for class: "
            r1.append(r2)
            java.lang.Class r2 = r3.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    public void setAccessible(boolean r2) {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.constructor
            r0.setAccessible(r2)
            return
    }
}
