package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zzc;

    zzmm(com.google.android.gms.measurement.internal.zzmo r1, com.google.android.gms.measurement.internal.zzmh r2, long r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzmo r0 = r5.zzc
            com.google.android.gms.measurement.internal.zzmh r1 = r5.zza
            long r2 = r5.zzb
            r4 = 0
            com.google.android.gms.measurement.internal.zzmo.zzr(r0, r1, r4, r2)
            r1 = 0
            r0.zza = r1
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            r0.zzS(r1)
            return
    }
}
