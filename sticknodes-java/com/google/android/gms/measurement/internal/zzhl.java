package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzhl implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhm zzb;

    zzhl(com.google.android.gms.measurement.internal.zzhm r1, boolean r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzhm r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzhm.zza(r0)
            boolean r1 = r2.zza
            r0.zzX(r1)
            return
    }
}
