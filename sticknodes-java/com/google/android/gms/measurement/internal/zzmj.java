package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zze;

    zzmj(com.google.android.gms.measurement.internal.zzmo r1, com.google.android.gms.measurement.internal.zzmh r2, com.google.android.gms.measurement.internal.zzmh r3, long r4, boolean r6) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r6
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            com.google.android.gms.measurement.internal.zzmo r0 = r7.zze
            com.google.android.gms.measurement.internal.zzmh r1 = r7.zza
            com.google.android.gms.measurement.internal.zzmh r2 = r7.zzb
            long r3 = r7.zzc
            boolean r5 = r7.zzd
            r6 = 0
            com.google.android.gms.measurement.internal.zzmo.zzp(r0, r1, r2, r3, r5, r6)
            return
    }
}
