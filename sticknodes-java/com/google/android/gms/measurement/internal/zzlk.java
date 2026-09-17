package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlk implements com.google.android.gms.measurement.internal.zzqe {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zza;

    zzlk(com.google.android.gms.measurement.internal.zzlw r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzqe
    public final void zza(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r0 = "auto"
            java.lang.String r1 = "_err"
            if (r4 != 0) goto L10
            com.google.android.gms.measurement.internal.zzlw r4 = r2.zza
            r4.zzQ(r0, r1, r5, r3)
            return
        L10:
            com.google.android.gms.measurement.internal.zzlw r3 = r2.zza
            r3.zzO(r0, r1, r5)
            return
    }
}
