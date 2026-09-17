package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzbj extends com.google.android.gms.internal.measurement.zzaw {
    public zzbj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String r5, com.google.android.gms.internal.measurement.zzg r6, java.util.List r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L2f
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L2f
            boolean r2 = r6.zzh(r5)
            if (r2 == 0) goto L2f
            com.google.android.gms.internal.measurement.zzap r2 = r6.zzd(r5)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzai
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.measurement.zzai r2 = (com.google.android.gms.internal.measurement.zzai) r2
            com.google.android.gms.internal.measurement.zzap r5 = r2.zza(r6, r7)
            return r5
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r5
            java.lang.String r5 = "Function %s is not defined"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.<init>(r5)
            throw r6
        L2f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r5
            java.lang.String r5 = "Command not found: %s"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.<init>(r5)
            throw r6
    }
}
