package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlp implements java.lang.Runnable {
    final /* synthetic */ java.lang.Boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlp(com.google.android.gms.measurement.internal.zzlw r1, java.lang.Boolean r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r3.zzb
            java.lang.Boolean r1 = r3.zza
            r2 = 1
            com.google.android.gms.measurement.internal.zzlw.zzE(r0, r1, r2)
            return
    }
}
