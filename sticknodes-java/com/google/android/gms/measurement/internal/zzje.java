package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzje implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzd;

    zzje(com.google.android.gms.measurement.internal.zzjp r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.measurement.internal.zzjp r0 = r4.zzd
            com.google.android.gms.measurement.internal.zzpv r1 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r1.zzL()
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            com.google.android.gms.measurement.internal.zzaw r0 = r0.zzj()
            java.lang.String r1 = r4.zza
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r4.zzc
            java.util.List r0 = r0.zzB(r1, r2, r3)
            return r0
    }
}
