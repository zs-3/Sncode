package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzxd {
    public final long zza;
    public final long zzb;

    public zzxd(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.ads.zzxd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzxd r8 = (com.google.android.gms.internal.ads.zzxd) r8
            long r3 = r7.zza
            long r5 = r8.zza
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L1d
            long r3 = r7.zzb
            long r5 = r8.zzb
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.zza
            int r1 = (int) r0
            long r2 = r4.zzb
            int r1 = r1 * 31
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }
}
