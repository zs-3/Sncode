package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjf implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzjf(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzr r2) {
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
            com.google.android.gms.measurement.internal.zzpv r0 = com.google.android.gms.measurement.internal.zzjp.zzc(r0)
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            r0.zzM()
            com.google.android.gms.measurement.internal.zzr r1 = r3.zza
            java.lang.String r2 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzg(r1)
            return
    }
}
