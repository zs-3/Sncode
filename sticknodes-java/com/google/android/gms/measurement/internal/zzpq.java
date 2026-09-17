package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzpq implements com.google.android.gms.measurement.internal.zzqe {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zza;

    zzpq(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzqe
    public final void zza(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L20
            com.google.android.gms.measurement.internal.zzpv r3 = r2.zza
            com.google.android.gms.measurement.internal.zzio r5 = com.google.android.gms.measurement.internal.zzpv.zzs(r3)
            if (r5 == 0) goto L1f
            com.google.android.gms.measurement.internal.zzio r3 = com.google.android.gms.measurement.internal.zzpv.zzs(r3)
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r5 = "AppId not known when logging event"
            r3.zzb(r5, r4)
        L1f:
            return
        L20:
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzpp r1 = new com.google.android.gms.measurement.internal.zzpp
            r1.<init>(r2, r3, r4, r5)
            r0.zzq(r1)
            return
    }
}
