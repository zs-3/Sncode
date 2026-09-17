package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzok implements java.lang.Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzol zzc;

    zzok(com.google.android.gms.measurement.internal.zzol r1, long r2, long r4) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            r0.zza = r2
            r0.zzb = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzol r0 = r2.zzc
            com.google.android.gms.measurement.internal.zzop r0 = r0.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzoj r1 = new com.google.android.gms.measurement.internal.zzoj
            r1.<init>(r2)
            r0.zzq(r1)
            return
    }
}
