package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjk(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzbh r2, java.lang.String r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzjp r0 = r3.zzc
            com.google.android.gms.measurement.internal.zzpv r1 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r1.zzL()
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            com.google.android.gms.measurement.internal.zzbh r1 = r3.zza
            java.lang.String r2 = r3.zzb
            r0.zzT(r1, r2)
            return
    }
}
