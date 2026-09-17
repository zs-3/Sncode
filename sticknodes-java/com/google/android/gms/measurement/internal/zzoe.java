package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzoe implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zza;
    final /* synthetic */ java.lang.Runnable zzb;

    zzoe(com.google.android.gms.measurement.internal.zzog r1, com.google.android.gms.measurement.internal.zzpv r2, java.lang.Runnable r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zza
            r0.zzL()
            java.lang.Runnable r1 = r2.zzb
            r0.zzK(r1)
            r0.zzat()
            return
    }
}
