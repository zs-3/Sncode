package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzls implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjx zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzd;

    zzls(com.google.android.gms.measurement.internal.zzlw r1, com.google.android.gms.measurement.internal.zzjx r2, long r3, boolean r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r5
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r6.zzd
            com.google.android.gms.measurement.internal.zzjx r1 = r6.zza
            r0.zzaj(r1)
            boolean r5 = r6.zzc
            long r2 = r6.zzb
            r4 = 0
            com.google.android.gms.measurement.internal.zzlw.zzD(r0, r1, r2, r4, r5)
            return
    }
}
