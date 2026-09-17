package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbud {
    private static com.google.android.gms.internal.ads.zzbzl zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzei zzd;
    private final java.lang.String zze;

    public zzbud(android.content.Context r1, com.google.android.gms.ads.AdFormat r2, com.google.android.gms.ads.internal.client.zzei r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzbzl zza(android.content.Context r3) {
            java.lang.Class<com.google.android.gms.internal.ads.zzbud> r0 = com.google.android.gms.internal.ads.zzbud.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbzl r1 = com.google.android.gms.internal.ads.zzbud.zza     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L16
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.zzbph r2 = new com.google.android.gms.internal.ads.zzbph     // Catch: java.lang.Throwable -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.zzbzl r3 = r1.zzt(r3, r2)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.zzbud.zza = r3     // Catch: java.lang.Throwable -> L1a
        L16:
            com.google.android.gms.internal.ads.zzbzl r3 = com.google.android.gms.internal.ads.zzbud.zza     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    public final void zzb(com.google.android.gms.ads.query.QueryInfoGenerationCallback r8) {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.Context r2 = r7.zzb
            com.google.android.gms.internal.ads.zzbzl r2 = zza(r2)
            if (r2 != 0) goto L12
            java.lang.String r0 = "Internal Error, query info generator is null."
            r8.onFailure(r0)
            return
        L12:
            android.content.Context r3 = r7.zzb
            com.google.android.gms.ads.internal.client.zzei r4 = r7.zzd
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)
            if (r4 != 0) goto L29
            com.google.android.gms.ads.internal.client.zzn r4 = new com.google.android.gms.ads.internal.client.zzn
            r4.<init>()
            r4.zzg(r0)
            com.google.android.gms.ads.internal.client.zzm r0 = r4.zza()
            goto L36
        L29:
            r4.zzq(r0)
            android.content.Context r0 = r7.zzb
            com.google.android.gms.ads.internal.client.zzei r1 = r7.zzd
            com.google.android.gms.ads.internal.client.zzr r4 = com.google.android.gms.ads.internal.client.zzr.zza
            com.google.android.gms.ads.internal.client.zzm r0 = r4.zza(r0, r1)
        L36:
            java.lang.String r1 = r7.zze
            com.google.android.gms.ads.AdFormat r4 = r7.zzc
            com.google.android.gms.internal.ads.zzbzp r5 = new com.google.android.gms.internal.ads.zzbzp
            java.lang.String r4 = r4.name()
            r6 = 0
            r5.<init>(r1, r4, r6, r0)
            com.google.android.gms.internal.ads.zzbuc r0 = new com.google.android.gms.internal.ads.zzbuc     // Catch: android.os.RemoteException -> L4d
            r0.<init>(r7, r8)     // Catch: android.os.RemoteException -> L4d
            r2.zzf(r3, r5, r0)     // Catch: android.os.RemoteException -> L4d
            return
        L4d:
            java.lang.String r0 = "Internal Error."
            r8.onFailure(r0)
            return
    }
}
