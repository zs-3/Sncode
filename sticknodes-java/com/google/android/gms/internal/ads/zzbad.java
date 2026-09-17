package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbad {
    final long zza;
    final java.lang.String zzb;
    final int zzc;

    zzbad(long r1, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L1a
            boolean r1 = r7 instanceof com.google.android.gms.internal.ads.zzbad
            if (r1 != 0) goto L8
            goto L1a
        L8:
            com.google.android.gms.internal.ads.zzbad r7 = (com.google.android.gms.internal.ads.zzbad) r7
            long r1 = r7.zza
            long r3 = r6.zza
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            int r7 = r7.zzc
            int r1 = r6.zzc
            if (r7 != r1) goto L1a
            r7 = 1
            return r7
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.zza
            int r1 = (int) r0
            return r1
    }
}
