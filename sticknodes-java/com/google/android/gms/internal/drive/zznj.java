package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zznj extends java.lang.IllegalArgumentException {
    zznj(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 54
            r0.<init>(r1)
            java.lang.String r1 = "Unpaired surrogate at index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " of "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }
}
