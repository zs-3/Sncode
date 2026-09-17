package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzqb zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjm(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzqb r2, com.google.android.gms.measurement.internal.zzr r3) {
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
            com.google.android.gms.measurement.internal.zzjp r0 = r3.zzc
            com.google.android.gms.measurement.internal.zzpv r1 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r1.zzL()
            com.google.android.gms.measurement.internal.zzqb r1 = r3.zza
            java.lang.Object r2 = r1.zza()
            if (r2 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzr r2 = r3.zzb
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            java.lang.String r1 = r1.zzb
            r0.zzag(r1, r2)
            return
        L1d:
            com.google.android.gms.measurement.internal.zzr r2 = r3.zzb
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            r0.zzas(r1, r2)
            return
    }
}
