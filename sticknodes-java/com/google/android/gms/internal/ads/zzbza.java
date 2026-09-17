package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbza {
    static com.google.android.gms.internal.ads.zzbza zza;

    public zzbza() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.google.android.gms.internal.ads.zzbza zzd(android.content.Context r4) {
            java.lang.Class<com.google.android.gms.internal.ads.zzbza> r0 = com.google.android.gms.internal.ads.zzbza.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbza r1 = com.google.android.gms.internal.ads.zzbza.zza     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r1
        L9:
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbcv.zza(r4)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()     // Catch: java.lang.Throwable -> L92
            r1.zzs(r4)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbys r2 = new com.google.android.gms.internal.ads.zzbys     // Catch: java.lang.Throwable -> L92
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L92
            r2.zzb(r4)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L92
            r2.zzc(r4)     // Catch: java.lang.Throwable -> L92
            r2.zza(r1)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbyz r4 = com.google.android.gms.ads.internal.zzu.zzn()     // Catch: java.lang.Throwable -> L92
            r2.zzd(r4)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbza r4 = r2.zze()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbza.zza = r4     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbyl r4 = r4.zza()     // Catch: java.lang.Throwable -> L92
            r4.zza()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbza r4 = com.google.android.gms.internal.ads.zzbza.zza     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbze r4 = r4.zzc()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzay     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L92
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto L5b
            goto L8e
        L5b:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzaz     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L92
            java.util.Map r1 = com.google.android.gms.ads.internal.util.zzt.zzv(r1)     // Catch: java.lang.Throwable -> L92
            java.util.Set r2 = r1.keySet()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L92
        L76:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto L86
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L92
            r4.zzc(r3)     // Catch: java.lang.Throwable -> L92
            goto L76
        L86:
            com.google.android.gms.internal.ads.zzbzc r2 = new com.google.android.gms.internal.ads.zzbzc     // Catch: java.lang.Throwable -> L92
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L92
            r4.zzd(r2)     // Catch: java.lang.Throwable -> L92
        L8e:
            com.google.android.gms.internal.ads.zzbza r4 = com.google.android.gms.internal.ads.zzbza.zza     // Catch: java.lang.Throwable -> L92
            monitor-exit(r0)
            return r4
        L92:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    abstract com.google.android.gms.internal.ads.zzbyl zza();

    abstract com.google.android.gms.internal.ads.zzbyp zzb();

    abstract com.google.android.gms.internal.ads.zzbze zzc();
}
