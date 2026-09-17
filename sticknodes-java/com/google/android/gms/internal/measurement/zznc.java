package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznc {
    zznc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.Object zza(java.lang.Object r1, java.lang.Object r2) {
            com.google.android.gms.internal.measurement.zznb r1 = (com.google.android.gms.internal.measurement.zznb) r1
            com.google.android.gms.internal.measurement.zznb r2 = (com.google.android.gms.internal.measurement.zznb) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L17
            boolean r0 = r1.zze()
            if (r0 != 0) goto L14
            com.google.android.gms.internal.measurement.zznb r1 = r1.zzb()
        L14:
            r1.zzd(r2)
        L17:
            return r1
    }
}
