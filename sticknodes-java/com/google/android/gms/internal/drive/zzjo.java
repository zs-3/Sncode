package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public abstract class zzjo {
    private int zznz;
    private int zzoa;
    private boolean zzob;

    private zzjo() {
            r1 = this;
            r1.<init>()
            r0 = 100
            r1.zznz = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.zzoa = r0
            r0 = 0
            r1.zzob = r0
            return
    }

    /* synthetic */ zzjo(com.google.android.gms.internal.drive.zzjp r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.gms.internal.drive.zzjo zza(byte[] r6, int r7, int r8, boolean r9) {
            com.google.android.gms.internal.drive.zzjq r7 = new com.google.android.gms.internal.drive.zzjq
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r6
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.zzv(r8)     // Catch: com.google.android.gms.internal.drive.zzkq -> Lf
            return r7
        Lf:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
    }

    public static long zzk(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r4 = r4 & r2
            long r4 = -r4
            long r4 = r4 ^ r0
            return r4
    }

    public static int zzw(int r1) {
            int r0 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    public abstract int zzbz();

    public abstract int zzv(int r1) throws com.google.android.gms.internal.drive.zzkq;
}
