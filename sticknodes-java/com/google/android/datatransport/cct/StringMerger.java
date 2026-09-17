package com.google.android.datatransport.cct;

/* loaded from: classes.dex */
public final class StringMerger {
    public StringMerger() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String mergeStrings(java.lang.String r3, java.lang.String r4) {
            int r0 = r3.length()
            int r1 = r4.length()
            int r0 = r0 - r1
            if (r0 < 0) goto L3f
            r1 = 1
            if (r0 > r1) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r2 = r4.length()
            int r1 = r1 + r2
            r0.<init>(r1)
            r1 = 0
        L1d:
            int r2 = r3.length()
            if (r1 >= r2) goto L3a
            char r2 = r3.charAt(r1)
            r0.append(r2)
            int r2 = r4.length()
            if (r2 <= r1) goto L37
            char r2 = r4.charAt(r1)
            r0.append(r2)
        L37:
            int r1 = r1 + 1
            goto L1d
        L3a:
            java.lang.String r3 = r0.toString()
            return r3
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid input received"
            r3.<init>(r4)
            throw r3
    }
}
