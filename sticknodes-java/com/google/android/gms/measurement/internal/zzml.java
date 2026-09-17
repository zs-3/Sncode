package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzml implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zzb;

    zzml(com.google.android.gms.measurement.internal.zzmo r1, long r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzmo r0 = r4.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzd r1 = r1.zzd()
            long r2 = r4.zza
            r1.zzf(r2)
            r1 = 0
            r0.zza = r1
            return
    }
}
