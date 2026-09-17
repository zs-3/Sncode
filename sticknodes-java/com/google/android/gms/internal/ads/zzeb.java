package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeb {
    private int zza;
    private long[] zzb;

    public zzeb() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzeb(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 32
            long[] r1 = new long[r1]
            r0.zzb = r1
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final long zzb(int r5) {
            r4 = this;
            if (r5 < 0) goto Lb
            int r0 = r4.zza
            if (r5 >= r0) goto Lb
            long[] r0 = r4.zzb
            r1 = r0[r5]
            return r1
        Lb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r1 = r4.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid index "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", size is "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    public final void zzc(long r4) {
            r3 = this;
            int r0 = r3.zza
            long[] r1 = r3.zzb
            int r2 = r1.length
            if (r0 != r2) goto Le
            int r0 = r0 + r0
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.zzb = r0
        Le:
            long[] r0 = r3.zzb
            int r1 = r3.zza
            int r2 = r1 + 1
            r3.zza = r2
            r0[r1] = r4
            return
    }
}
