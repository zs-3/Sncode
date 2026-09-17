package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzpp implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.os.Bundle zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpq zzd;

    zzpp(com.google.android.gms.measurement.internal.zzpq r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            com.google.android.gms.measurement.internal.zzpq r0 = r11.zzd
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zza
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzB()
            com.google.android.gms.common.util.Clock r2 = r0.zzaU()
            long r6 = r2.currentTimeMillis()
            java.lang.String r10 = r11.zza
            java.lang.String r3 = r11.zzb
            android.os.Bundle r4 = r11.zzc
            java.lang.String r5 = "auto"
            r8 = 0
            r9 = 1
            r2 = r10
            com.google.android.gms.measurement.internal.zzbh r1 = r1.zzC(r2, r3, r4, r5, r6, r8, r9)
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.measurement.internal.zzbh r1 = (com.google.android.gms.measurement.internal.zzbh) r1
            r0.zzT(r1, r10)
            return
    }
}
