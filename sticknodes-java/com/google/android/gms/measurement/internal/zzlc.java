package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlc implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzc;

    zzlc(com.google.android.gms.measurement.internal.zzlw r1, java.util.concurrent.atomic.AtomicReference r2, boolean r3) {
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
            com.google.android.gms.measurement.internal.zzlw r0 = r3.zzc
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            java.util.concurrent.atomic.AtomicReference r1 = r3.zza
            boolean r2 = r3.zzb
            r0.zzJ(r1, r2)
            return
    }
}
