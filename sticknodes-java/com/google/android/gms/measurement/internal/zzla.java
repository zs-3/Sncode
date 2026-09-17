package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzla implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zze;

    zzla(com.google.android.gms.measurement.internal.zzlw r1, java.lang.String r2, java.lang.String r3, java.lang.Object r4, long r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r6.zze
            java.lang.String r1 = r6.zza
            java.lang.String r2 = r6.zzb
            java.lang.Object r3 = r6.zzc
            long r4 = r6.zzd
            r0.zzan(r1, r2, r3, r4)
            return
    }
}
