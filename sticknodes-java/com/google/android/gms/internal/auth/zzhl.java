package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
abstract class zzhl {
    zzhl() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract int zza(int r1, byte[] r2, int r3, int r4);

    final boolean zzb(byte[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            int r2 = r1.zza(r0, r2, r3, r4)
            if (r2 != 0) goto L9
            r2 = 1
            return r2
        L9:
            return r0
    }
}
