package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlh implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzd;

    zzlh(com.google.android.gms.measurement.internal.zzlw r1, java.util.concurrent.atomic.AtomicReference r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            java.lang.String r0 = r5.zzb
            java.lang.String r1 = r5.zzc
            com.google.android.gms.measurement.internal.zzlw r2 = r5.zzd
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzny r2 = r2.zzu()
            java.util.concurrent.atomic.AtomicReference r3 = r5.zza
            r4 = 0
            r2.zzG(r3, r4, r0, r1)
            return
    }
}
