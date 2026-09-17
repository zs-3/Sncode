package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzax extends java.lang.Exception {
    public zzax(java.lang.String r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "User verification requirement %s not supported"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r2.<init>(r3)
            return
    }
}
