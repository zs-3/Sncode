package com.google.common.collect;

/* loaded from: classes2.dex */
public final class Collections2 {
    static java.lang.StringBuilder newStringBuilderForCollection(int r5) {
            java.lang.String r0 = "size"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            long r1 = (long) r5
            r3 = 8
            long r1 = r1 * r3
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r1 = java.lang.Math.min(r1, r3)
            int r5 = (int) r1
            r0.<init>(r5)
            return r0
    }
}
