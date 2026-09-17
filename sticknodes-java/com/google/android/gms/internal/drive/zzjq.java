package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzjq extends com.google.android.gms.internal.drive.zzjo {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzoc;
    private int zzod;
    private int zzoe;
    private int zzof;

    private zzjq(byte[] r2, int r3, int r4, boolean r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.zzof = r0
            r1.buffer = r2
            int r4 = r4 + r3
            r1.limit = r4
            r1.pos = r3
            r1.zzoe = r3
            r1.zzoc = r5
            return
    }

    /* synthetic */ zzjq(byte[] r1, int r2, int r3, boolean r4, com.google.android.gms.internal.drive.zzjp r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzjo
    public final int zzbz() {
            r2 = this;
            int r0 = r2.pos
            int r1 = r2.zzoe
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzjo
    public final int zzv(int r4) throws com.google.android.gms.internal.drive.zzkq {
            r3 = this;
            if (r4 < 0) goto L2a
            int r0 = r3.zzbz()
            int r4 = r4 + r0
            int r0 = r3.zzof
            if (r4 > r0) goto L25
            r3.zzof = r4
            int r1 = r3.limit
            int r2 = r3.zzod
            int r1 = r1 + r2
            r3.limit = r1
            int r2 = r3.zzoe
            int r2 = r1 - r2
            if (r2 <= r4) goto L21
            int r2 = r2 - r4
            r3.zzod = r2
            int r1 = r1 - r2
            r3.limit = r1
            goto L24
        L21:
            r4 = 0
            r3.zzod = r4
        L24:
            return r0
        L25:
            com.google.android.gms.internal.drive.zzkq r4 = com.google.android.gms.internal.drive.zzkq.zzdi()
            throw r4
        L2a:
            com.google.android.gms.internal.drive.zzkq r4 = com.google.android.gms.internal.drive.zzkq.zzdj()
            throw r4
    }
}
