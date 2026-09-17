package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzpo implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zzb;

    zzpo(com.google.android.gms.measurement.internal.zzpv r1, com.google.android.gms.measurement.internal.zzr r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r5 = this;
            com.google.android.gms.measurement.internal.zzr r0 = r5.zza
            java.lang.String r1 = r0.zza
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.measurement.internal.zzpv r2 = r5.zzb
            com.google.android.gms.measurement.internal.zzjx r1 = r2.zzu(r1)
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r1 = r1.zzr(r3)
            if (r1 == 0) goto L30
            java.lang.String r1 = r0.zzu
            r4 = 100
            com.google.android.gms.measurement.internal.zzjx r1 = com.google.android.gms.measurement.internal.zzjx.zzk(r1, r4)
            boolean r1 = r1.zzr(r3)
            if (r1 != 0) goto L27
            goto L30
        L27:
            com.google.android.gms.measurement.internal.zzh r0 = r2.zzg(r0)
            java.lang.String r0 = r0.zzD()
            goto L3e
        L30:
            com.google.android.gms.measurement.internal.zzhe r0 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "Analytics storage consent denied. Returning null app instance id"
            r0.zza(r1)
            r0 = 0
        L3e:
            return r0
    }
}
