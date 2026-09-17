package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgsn {
    static {
            int r0 = com.google.android.gms.internal.ads.zzgxi.zza
            zza()     // Catch: java.security.GeneralSecurityException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    public static void zza() throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgst.zzd()
            com.google.android.gms.internal.ads.zzgrx.zzd()
            r0 = 1
            com.google.android.gms.internal.ads.zzgsg.zza(r0)
            boolean r1 = com.google.android.gms.internal.ads.zzgnx.zzb()
            if (r1 == 0) goto L11
            return
        L11:
            com.google.android.gms.internal.ads.zzgro.zzd(r0)
            return
    }
}
