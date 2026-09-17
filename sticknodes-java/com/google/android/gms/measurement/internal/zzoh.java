package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzoh implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zzb;

    zzoh(com.google.android.gms.measurement.internal.zzop r1, long r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzop r0 = r3.zzb
            long r1 = r3.zza
            com.google.android.gms.measurement.internal.zzop.zzl(r0, r1)
            return
    }
}
