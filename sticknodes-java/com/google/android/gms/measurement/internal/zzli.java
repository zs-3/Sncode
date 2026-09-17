package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzli implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zze;

    zzli(com.google.android.gms.measurement.internal.zzlw r1, java.util.concurrent.atomic.AtomicReference r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            java.lang.String r3 = r6.zzb
            java.lang.String r4 = r6.zzc
            boolean r5 = r6.zzd
            com.google.android.gms.measurement.internal.zzlw r0 = r6.zze
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            java.util.concurrent.atomic.AtomicReference r1 = r6.zza
            r2 = 0
            r0.zzL(r1, r2, r3, r4, r5)
            return
    }
}
