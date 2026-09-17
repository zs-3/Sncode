package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzps {
    final java.lang.String zza;
    long zzb;

    /* synthetic */ zzps(com.google.android.gms.measurement.internal.zzpv r1, com.google.android.gms.measurement.internal.zzpu r2) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzqf r2 = r1.zzB()
            java.lang.String r2 = r2.zzF()
            r0.<init>(r1, r2)
            return
    }

    private zzps(com.google.android.gms.measurement.internal.zzpv r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            com.google.android.gms.common.util.Clock r1 = r1.zzaU()
            long r1 = r1.elapsedRealtime()
            r0.zzb = r1
            return
    }

    /* synthetic */ zzps(com.google.android.gms.measurement.internal.zzpv r1, java.lang.String r2, com.google.android.gms.measurement.internal.zzpu r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }
}
