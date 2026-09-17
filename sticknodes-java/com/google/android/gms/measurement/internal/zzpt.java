package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzpt {
    private final com.google.android.gms.measurement.internal.zzpv zza;
    private int zzb;
    private long zzc;

    public zzpt(com.google.android.gms.measurement.internal.zzpv r3) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            r3 = 1
            r2.zzb = r3
            long r0 = r2.zzd()
            r2.zzc = r0
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.measurement.internal.zzpt r2) {
            long r0 = r2.zzc
            return r0
    }

    private final long zzd() {
            r7 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r7.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzu
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzv
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5 = 1
        L1f:
            int r6 = r7.zzb
            if (r5 >= r6) goto L2c
            long r3 = r3 + r3
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 < 0) goto L29
            goto L2c
        L29:
            int r5 = r5 + 1
            goto L1f
        L2c:
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r5 = r0.currentTimeMillis()
            long r0 = java.lang.Math.min(r3, r1)
            long r5 = r5 + r0
            return r5
    }

    public final void zzb() {
            r2 = this;
            int r0 = r2.zzb
            int r0 = r0 + 1
            r2.zzb = r0
            long r0 = r2.zzd()
            r2.zzc = r0
            return
    }

    public final boolean zzc() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r5.zza
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r0 = r0.currentTimeMillis()
            long r2 = r5.zzc
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
