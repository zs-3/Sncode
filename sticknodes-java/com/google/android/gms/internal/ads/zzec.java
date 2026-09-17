package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzec {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzec(int r3) {
            r2 = this;
            r2.<init>()
            r3 = 16
            int r0 = java.lang.Integer.bitCount(r3)
            r1 = 1
            if (r0 == r1) goto L13
            r3 = 15
            int r3 = java.lang.Integer.highestOneBit(r3)
            int r3 = r3 + r3
        L13:
            r0 = 0
            r2.zza = r0
            r2.zzb = r0
            long[] r3 = new long[r3]
            r2.zzc = r3
            int r3 = r3.length
            int r3 = r3 + (-1)
            r2.zzd = r3
            return
    }

    public final long zza() {
            r3 = this;
            int r0 = r3.zzb
            if (r0 == 0) goto Lb
            long[] r0 = r3.zzc
            int r1 = r3.zza
            r1 = r0[r1]
            return r1
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final long zzb() {
            r5 = this;
            int r0 = r5.zzb
            if (r0 == 0) goto L16
            long[] r1 = r5.zzc
            int r2 = r5.zza
            r3 = r1[r2]
            int r2 = r2 + 1
            int r1 = r5.zzd
            r1 = r1 & r2
            r5.zza = r1
            int r0 = r0 + (-1)
            r5.zzb = r0
            return r3
        L16:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final void zzc() {
            r1 = this;
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            return
    }

    public final boolean zzd() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
