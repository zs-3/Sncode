package com.google.common.collect;

/* loaded from: classes2.dex */
final class CollectPreconditions {
    static void checkEntryNotNull(java.lang.Object r2, java.lang.Object r3) {
            if (r2 == 0) goto L2b
            if (r3 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r0 = r2.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "null value in entry: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = "=null"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r3.<init>(r2)
            throw r3
        L2b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "null key in entry: null="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
    }

    static int checkNonnegative(int r3, java.lang.String r4) {
            if (r3 < 0) goto L3
            return r3
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r1 = r1.length()
            int r1 = r1 + 40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r4 = " cannot be negative but was: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }
}
