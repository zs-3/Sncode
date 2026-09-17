package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
abstract class zznh {
    zznh() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract int zzb(int r1, byte[] r2, int r3, int r4);

    abstract int zzb(java.lang.CharSequence r1, byte[] r2, int r3, int r4);

    final boolean zze(byte[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            int r2 = r1.zzb(r0, r2, r3, r4)
            if (r2 != 0) goto L9
            r2 = 1
            return r2
        L9:
            return r0
    }

    abstract java.lang.String zzg(byte[] r1, int r2, int r3) throws com.google.android.gms.internal.drive.zzkq;
}
