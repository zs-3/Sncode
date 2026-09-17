package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzks {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzks(com.google.android.gms.internal.ads.zzkq r3, com.google.android.gms.internal.ads.zzkr r4) {
            r2 = this;
            r2.<init>()
            long r0 = com.google.android.gms.internal.ads.zzkq.zzc(r3)
            r2.zza = r0
            float r4 = com.google.android.gms.internal.ads.zzkq.zza(r3)
            r2.zzb = r4
            long r3 = com.google.android.gms.internal.ads.zzkq.zzb(r3)
            r2.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.ads.zzks
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzks r8 = (com.google.android.gms.internal.ads.zzks) r8
            long r3 = r7.zza
            long r5 = r8.zza
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L25
            float r1 = r7.zzb
            float r3 = r8.zzb
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L25
            long r3 = r7.zzc
            long r5 = r8.zzc
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.zza
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.zzb
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            long r1 = r3.zzc
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzkq zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzkq r0 = new com.google.android.gms.internal.ads.zzkq
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
