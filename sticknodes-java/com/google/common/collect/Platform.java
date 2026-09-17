package com.google.common.collect;

/* loaded from: classes2.dex */
final class Platform {
    static <T> T[] copy(java.lang.Object[] r0, int r1, int r2, T[] r3) {
            java.lang.Class r3 = r3.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2, r3)
            return r0
    }

    static <T> T[] newArray(T[] r0, int r1) {
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }
}
