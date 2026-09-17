package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzpk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpw zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zzb;

    zzpk(com.google.android.gms.measurement.internal.zzpv r1, com.google.android.gms.measurement.internal.zzpw r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzpw r1 = r2.zza
            com.google.android.gms.measurement.internal.zzpv.zzH(r0, r1)
            r0.zzam()
            return
    }
}
