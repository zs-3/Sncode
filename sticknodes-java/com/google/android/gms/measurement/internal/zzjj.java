package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjj(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzbh r2, com.google.android.gms.measurement.internal.zzr r3) {
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
            com.google.android.gms.measurement.internal.zzbh r0 = r3.zza
            com.google.android.gms.measurement.internal.zzr r1 = r3.zzb
            com.google.android.gms.measurement.internal.zzjp r2 = r3.zzc
            com.google.android.gms.measurement.internal.zzbh r0 = r2.zzb(r0, r1)
            r2.zzJ(r0, r1)
            return
    }
}
