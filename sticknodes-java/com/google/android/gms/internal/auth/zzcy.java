package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzcy extends com.google.android.gms.internal.auth.zzdc {
    final /* synthetic */ com.google.android.gms.internal.auth.zzhy zza;

    zzcy(com.google.android.gms.internal.auth.zzcz r7, java.lang.String r8, java.lang.Object r9, boolean r10, com.google.android.gms.internal.auth.zzhy r11) {
            r6 = this;
            r6.zza = r11
            java.lang.String r2 = "getTokenRefactor__blocked_packages"
            r4 = 1
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final java.lang.Object zza(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Ld
            r1 = 3
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.auth.zzhs r4 = com.google.android.gms.internal.auth.zzhs.zzp(r0)     // Catch: java.lang.Throwable -> Ld
            return r4
        Ld:
            java.lang.String r0 = r3.zzc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid byte[] value for "
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
            return r4
    }
}
