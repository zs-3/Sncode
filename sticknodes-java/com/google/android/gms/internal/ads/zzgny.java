package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgny {
    private static final java.lang.String[] zza = null;

    static {
            java.lang.String r0 = "GmsCore_OpenSSL"
            java.lang.String r1 = "AndroidOpenSSL"
            java.lang.String r2 = "Conscrypt"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.gms.internal.ads.zzgny.zza = r0
            return
    }

    public static java.security.Provider zza() {
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzgny.zza
            r1 = 0
        L3:
            r2 = 3
            if (r1 >= r2) goto L12
            r2 = r0[r1]
            java.security.Provider r2 = java.security.Security.getProvider(r2)
            if (r2 == 0) goto Lf
            return r2
        Lf:
            int r1 = r1 + 1
            goto L3
        L12:
            r0 = 0
            return r0
    }
}
