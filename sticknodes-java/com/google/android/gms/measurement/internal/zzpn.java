package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzpn extends com.google.android.gms.measurement.internal.zzaz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zza;

    zzpn(com.google.android.gms.measurement.internal.zzpv r1, com.google.android.gms.measurement.internal.zzjs r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            java.util.Deque r1 = com.google.android.gms.measurement.internal.zzpv.zzE(r0)
            java.lang.Object r1 = r1.pollFirst()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L41
            com.google.android.gms.common.util.Clock r2 = r0.zzaU()
            long r2 = r2.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzpv.zzG(r0, r2)
            com.google.android.gms.measurement.internal.zzhe r2 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r3 = "Sending trigger URI notification to app"
            r2.zzb(r3, r1)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r2.setAction(r3)
            r2.setPackage(r1)
            android.content.Context r1 = r0.zzaT()
            com.google.android.gms.measurement.internal.zzpv.zzJ(r1, r2)
        L41:
            com.google.android.gms.measurement.internal.zzpv.zzI(r0)
            return
    }
}
