package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzme implements com.google.android.gms.internal.drive.zzlo {
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] zzue;
    private final com.google.android.gms.internal.drive.zzlq zzuh;

    zzme(com.google.android.gms.internal.drive.zzlq r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.zzuh = r4
            r3.info = r5
            r3.zzue = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
            r3.flags = r4
            return
        L16:
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
            r1 = 1
        L1b:
            int r2 = r1 + 1
            char r1 = r5.charAt(r1)
            if (r1 < r6) goto L2b
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r0
            r4 = r4 | r1
            int r0 = r0 + 13
            r1 = r2
            goto L1b
        L2b:
            int r5 = r1 << r0
            r4 = r4 | r5
            r3.flags = r4
            return
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final int zzec() {
            r2 = this;
            int r0 = r2.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L9
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsf
            return r0
        L9:
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsg
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final boolean zzed() {
            r2 = this;
            int r0 = r2.flags
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final com.google.android.gms.internal.drive.zzlq zzee() {
            r1 = this;
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzuh
            return r0
    }

    final java.lang.String zzek() {
            r1 = this;
            java.lang.String r0 = r1.info
            return r0
    }

    final java.lang.Object[] zzel() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzue
            return r0
    }
}
