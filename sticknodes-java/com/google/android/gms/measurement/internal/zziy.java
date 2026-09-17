package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zziy implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zze;

    zziy(com.google.android.gms.measurement.internal.zzjp r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
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
            r5 = this;
            java.lang.String r0 = r5.zza
            if (r0 != 0) goto L11
            com.google.android.gms.measurement.internal.zzjp r0 = r5.zze
            java.lang.String r1 = r5.zzb
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r2 = 0
            r0.zzaj(r1, r2)
            return
        L11:
            java.lang.String r1 = r5.zzc
            long r2 = r5.zzd
            com.google.android.gms.measurement.internal.zzmh r4 = new com.google.android.gms.measurement.internal.zzmh
            r4.<init>(r1, r0, r2)
            com.google.android.gms.measurement.internal.zzjp r0 = r5.zze
            java.lang.String r1 = r5.zzb
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r0.zzaj(r1, r4)
            return
    }
}
