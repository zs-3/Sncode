package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkb extends com.google.android.gms.internal.measurement.zzki {
    zzkb(com.google.android.gms.internal.measurement.zzkf r7, java.lang.String r8, java.lang.Long r9, boolean r10) {
            r6 = this;
            r4 = 1
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    final /* synthetic */ java.lang.Object zza(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L7
            java.lang.Long r4 = (java.lang.Long) r4
            goto L3c
        L7:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L17
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L17
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L17
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L17
            goto L3c
        L17:
            java.lang.String r0 = r3.zzb
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid long value for "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r4)
            r4 = 0
        L3c:
            return r4
    }
}
