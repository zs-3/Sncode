package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzin implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzke zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzio zzb;

    zzin(com.google.android.gms.measurement.internal.zzio r1, com.google.android.gms.measurement.internal.zzke r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzke r1 = r2.zza
            com.google.android.gms.measurement.internal.zzio.zzC(r0, r1)
            com.google.android.gms.internal.measurement.zzdh r1 = r1.zzg
            r0.zzH(r1)
            return
    }
}
