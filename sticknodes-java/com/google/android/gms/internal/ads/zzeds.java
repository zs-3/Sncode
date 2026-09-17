package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeds implements com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzcyd {
    private static final java.lang.Object zza = null;
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final com.google.android.gms.internal.ads.zzeec zzd;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzeds.zza = r0
            return
    }

    public zzeds(com.google.android.gms.internal.ads.zzeec r1, com.google.android.gms.ads.internal.util.zzg r2) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            r0.zzc = r2
            return
    }

    private final void zzb(boolean r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            goto L47
        L13:
            com.google.android.gms.ads.internal.util.zzg r0 = r4.zzc
            boolean r0 = r0.zzS()
            if (r0 != 0) goto L47
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzeds.zza
            monitor-enter(r0)
            int r1 = com.google.android.gms.internal.ads.zzeds.zzb     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzfY     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L44
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            if (r1 >= r2) goto L47
            com.google.android.gms.internal.ads.zzeec r1 = r4.zzd
            r1.zzd(r5)
            monitor-enter(r0)
            int r5 = com.google.android.gms.internal.ads.zzeds.zzb     // Catch: java.lang.Throwable -> L41
            int r5 = r5 + 1
            com.google.android.gms.internal.ads.zzeds.zzb = r5     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r5
        L44:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r5
        L47:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze r1) {
            r0 = this;
            r1 = 0
            r0.zzb(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r1 = this;
            r0 = 1
            r1.zzb(r0)
            return
    }
}
