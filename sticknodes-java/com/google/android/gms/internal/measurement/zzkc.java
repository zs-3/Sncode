package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkc extends com.google.android.gms.internal.measurement.zzki {
    zzkc(com.google.android.gms.internal.measurement.zzkf r7, java.lang.String r8, java.lang.Boolean r9, boolean r10) {
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
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L7
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L51
        L7:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L2c
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            java.util.regex.Pattern r1 = com.google.android.gms.internal.measurement.zzjc.zzc
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L1d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L51
        L1d:
            java.util.regex.Pattern r1 = com.google.android.gms.internal.measurement.zzjc.zzd
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L2c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L51
        L2c:
            java.lang.String r0 = r3.zzb
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid boolean value for "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r4)
            r4 = 0
        L51:
            return r4
    }
}
