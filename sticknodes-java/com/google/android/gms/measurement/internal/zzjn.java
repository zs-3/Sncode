package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjn implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjn(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzr r2, android.os.Bundle r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.measurement.internal.zzjp r0 = r3.zzc
            com.google.android.gms.measurement.internal.zzpv r1 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r1.zzL()
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            com.google.android.gms.measurement.internal.zzr r1 = r3.zza
            android.os.Bundle r2 = r3.zzb
            java.util.List r0 = r0.zzF(r1, r2)
            return r0
    }
}
