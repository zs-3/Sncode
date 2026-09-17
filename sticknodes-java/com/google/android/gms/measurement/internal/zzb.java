package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzb implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzd zzc;

    zzb(com.google.android.gms.measurement.internal.zzd r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzd r0 = r4.zzc
            java.lang.String r1 = r4.zza
            long r2 = r4.zzb
            com.google.android.gms.measurement.internal.zzd.zzb(r0, r1, r2)
            return
    }
}
