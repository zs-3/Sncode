package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzja implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzai zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzja(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzai r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzjp r0 = r3.zzb
            com.google.android.gms.measurement.internal.zzpv r1 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r1.zzL()
            com.google.android.gms.measurement.internal.zzai r1 = r3.zza
            com.google.android.gms.measurement.internal.zzqb r2 = r1.zzc
            java.lang.Object r2 = r2.zza()
            if (r2 != 0) goto L1b
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r0.zzae(r1)
            return
        L1b:
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r0.zzan(r1)
            return
    }
}
