package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzie implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzif zzb;

    zzie(com.google.android.gms.measurement.internal.zzif r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final java.lang.String zza(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r2.zzb
            java.util.Map r0 = com.google.android.gms.measurement.internal.zzif.zzn(r0)
            java.lang.String r1 = r2.zza
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L1e
            boolean r1 = r0.containsKey(r3)
            if (r1 != 0) goto L17
            goto L1e
        L17:
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L1e:
            r3 = 0
            return r3
    }
}
