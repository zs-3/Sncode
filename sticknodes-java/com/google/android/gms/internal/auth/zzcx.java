package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzcx extends com.google.android.gms.internal.auth.zzdc {
    zzcx(com.google.android.gms.internal.auth.zzcz r7, java.lang.String r8, java.lang.Double r9, boolean r10) {
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

    @Override // com.google.android.gms.internal.auth.zzdc
    final /* synthetic */ java.lang.Object zza(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> Lc
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> Lc
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc
            goto L2f
        Lc:
            java.lang.String r0 = r3.zzc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid double value for "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r4)
            r4 = 0
        L2f:
            return r4
    }
}
