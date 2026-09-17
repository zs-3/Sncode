package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmi implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zze;

    zzmi(com.google.android.gms.measurement.internal.zzmo r1, android.os.Bundle r2, com.google.android.gms.measurement.internal.zzmh r3, com.google.android.gms.measurement.internal.zzmh r4, long r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzmo r0 = r6.zze
            android.os.Bundle r1 = r6.zza
            com.google.android.gms.measurement.internal.zzmh r2 = r6.zzb
            com.google.android.gms.measurement.internal.zzmh r3 = r6.zzc
            long r4 = r6.zzd
            com.google.android.gms.measurement.internal.zzmo.zzq(r0, r1, r2, r3, r4)
            return
    }
}
