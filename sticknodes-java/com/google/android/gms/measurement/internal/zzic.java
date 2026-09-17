package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzic extends androidx.collection.LruCache {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzif zza;

    zzic(com.google.android.gms.measurement.internal.zzif r1, int r2) {
            r0 = this;
            r0.zza = r1
            r1 = 20
            r0.<init>(r1)
            return
    }

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ java.lang.Object create(java.lang.Object r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.measurement.internal.zzif r0 = r4.zza
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r1.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbn
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto L1b
            com.google.android.gms.internal.measurement.zzc r5 = com.google.android.gms.measurement.internal.zzif.zze(r0, r5)
            goto L1f
        L1b:
            com.google.android.gms.internal.measurement.zzc r5 = com.google.android.gms.measurement.internal.zzif.zzd(r0, r5)
        L1f:
            return r5
    }
}
