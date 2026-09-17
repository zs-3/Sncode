package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmy implements com.google.android.gms.internal.measurement.zznf {
    private final com.google.android.gms.internal.measurement.zznf[] zza;

    zzmy(com.google.android.gms.internal.measurement.zznf... r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final com.google.android.gms.internal.measurement.zzne zzb(java.lang.Class r4) {
            r3 = this;
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto L16
            com.google.android.gms.internal.measurement.zznf[] r1 = r3.zza
            r1 = r1[r0]
            boolean r2 = r1.zzc(r4)
            if (r2 == 0) goto L13
            com.google.android.gms.internal.measurement.zzne r4 = r1.zzb(r4)
            return r4
        L13:
            int r0 = r0 + 1
            goto L1
        L16:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "No factory is available for message type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final boolean zzc(java.lang.Class r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 2
            if (r1 >= r2) goto L14
            com.google.android.gms.internal.measurement.zznf[] r2 = r3.zza
            r2 = r2[r1]
            boolean r2 = r2.zzc(r4)
            if (r2 == 0) goto L11
            r4 = 1
            return r4
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }
}
