package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkx implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzkx(com.google.android.gms.measurement.internal.zzlw r1, long r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r4.zzb
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zzf
            long r2 = r4.zza
            r1.zzb(r2)
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "Session timeout duration set"
            r0.zzb(r2, r1)
            return
    }
}
