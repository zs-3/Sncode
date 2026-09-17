package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkz implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ java.lang.String zzh;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzi;

    zzkz(com.google.android.gms.measurement.internal.zzlw r1, java.lang.String r2, java.lang.String r3, long r4, android.os.Bundle r6, boolean r7, boolean r8, boolean r9, java.lang.String r10) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r6
            r0.zze = r7
            r0.zzf = r8
            r0.zzg = r9
            r0.zzh = r10
            r0.zzi = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r10.zzi
            java.lang.String r1 = r10.zza
            java.lang.String r2 = r10.zzb
            long r3 = r10.zzc
            android.os.Bundle r5 = r10.zzd
            boolean r6 = r10.zze
            boolean r7 = r10.zzf
            boolean r8 = r10.zzg
            java.lang.String r9 = r10.zzh
            r0.zzT(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }
}
