package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class HashAccumulator {
    private int zaa;

    public HashAccumulator() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.zaa
            int r0 = r0 * 31
            if (r2 != 0) goto L8
            r2 = 0
            goto Lc
        L8:
            int r2 = r2.hashCode()
        Lc:
            int r0 = r0 + r2
            r1.zaa = r0
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int hash() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean r2) {
            r1 = this;
            int r0 = r1.zaa
            int r0 = r0 * 31
            int r0 = r0 + r2
            r1.zaa = r0
            return r1
    }
}
