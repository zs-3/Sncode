package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzhh implements java.lang.Runnable {
    private final com.google.android.gms.measurement.internal.zzhg zza;
    private final int zzb;
    private final java.lang.Throwable zzc;
    private final byte[] zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    /* synthetic */ zzhh(java.lang.String r1, com.google.android.gms.measurement.internal.zzhg r2, int r3, java.lang.Throwable r4, byte[] r5, java.util.Map r6, com.google.android.gms.measurement.internal.zzhj r7) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.zzf = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzhg r0 = r6.zza
            java.lang.String r1 = r6.zze
            int r2 = r6.zzb
            java.lang.Throwable r3 = r6.zzc
            byte[] r4 = r6.zzd
            java.util.Map r5 = r6.zzf
            r0.zza(r1, r2, r3, r4, r5)
            return
    }
}
