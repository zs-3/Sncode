package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzou {
    private final com.google.android.gms.common.util.Clock zza;
    private long zzb;

    public zzou(com.google.android.gms.common.util.Clock r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zza = r1
            return
    }

    public final void zza() {
            r2 = this;
            r0 = 0
            r2.zzb = r0
            return
    }

    public final void zzb() {
            r2 = this;
            com.google.android.gms.common.util.Clock r0 = r2.zza
            long r0 = r0.elapsedRealtime()
            r2.zzb = r0
            return
    }

    public final boolean zzc(long r5) {
            r4 = this;
            long r5 = r4.zzb
            r0 = 1
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            return r0
        La:
            com.google.android.gms.common.util.Clock r5 = r4.zza
            long r5 = r5.elapsedRealtime()
            long r1 = r4.zzb
            long r5 = r5 - r1
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L1b
            return r0
        L1b:
            r5 = 0
            return r5
    }
}
