package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzghq {
    private static final java.util.concurrent.CopyOnWriteArrayList zza = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzghq.zza = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzghp zza(java.lang.String r3) throws java.security.GeneralSecurityException {
            java.util.concurrent.CopyOnWriteArrayList r0 = com.google.android.gms.internal.ads.zzghq.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzghp r1 = (com.google.android.gms.internal.ads.zzghp) r1
            boolean r2 = r1.zza()
            if (r2 == 0) goto L6
            return r1
        L19:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "No KMS client does support: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }
}
