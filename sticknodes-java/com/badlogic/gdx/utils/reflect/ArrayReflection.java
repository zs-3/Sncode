package com.badlogic.gdx.utils.reflect;

/* loaded from: classes.dex */
public final class ArrayReflection {
    public static java.lang.Object newInstance(java.lang.Class r0, int r1) {
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            return r0
    }

    public static void set(java.lang.Object r0, int r1, java.lang.Object r2) {
            java.lang.reflect.Array.set(r0, r1, r2)
            return
    }
}
