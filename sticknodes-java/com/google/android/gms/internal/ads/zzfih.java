package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfih {
    static com.google.android.gms.tasks.Task zza;
    public static com.google.android.gms.appset.AppSetIdClient zzb;
    private static final java.lang.Object zzc = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzfih.zzc = r0
            return
    }

    public static com.google.android.gms.tasks.Task zza(android.content.Context r1) {
            r0 = 0
            zzb(r1, r0)
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzfih.zzc
            monitor-enter(r1)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.internal.ads.zzfih.zza     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public static void zzb(android.content.Context r2, boolean r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfih.zzc
            monitor-enter(r0)
            com.google.android.gms.appset.AppSetIdClient r1 = com.google.android.gms.internal.ads.zzfih.zzb     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto Ld
            com.google.android.gms.appset.AppSetIdClient r2 = com.google.android.gms.appset.AppSet.getClient(r2)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.zzfih.zzb = r2     // Catch: java.lang.Throwable -> L3b
        Ld:
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.internal.ads.zzfih.zza     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L29
            boolean r2 = r2.isComplete()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L1f
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.internal.ads.zzfih.zza     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r2.isSuccessful()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L29
        L1f:
            if (r3 == 0) goto L39
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.internal.ads.zzfih.zza     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r2.isComplete()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L39
        L29:
            com.google.android.gms.appset.AppSetIdClient r2 = com.google.android.gms.internal.ads.zzfih.zzb     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "the appSetIdClient shouldn't be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r3)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.appset.AppSetIdClient r2 = (com.google.android.gms.appset.AppSetIdClient) r2     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.tasks.Task r2 = r2.getAppSetIdInfo()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.zzfih.zza = r2     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r2
    }
}
