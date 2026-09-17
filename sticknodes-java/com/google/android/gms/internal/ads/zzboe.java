package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzboe {
    private final java.lang.Object zza;
    private final java.lang.Object zzb;
    private com.google.android.gms.internal.ads.zzbon zzc;
    private com.google.android.gms.internal.ads.zzbon zzd;

    public zzboe() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            return
    }

    private static final android.content.Context zzc(android.content.Context r1) {
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 != 0) goto L7
            return r1
        L7:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbon zza(android.content.Context r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6, com.google.android.gms.internal.ads.zzfmd r7) {
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbon r1 = r4.zzc     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1e
            com.google.android.gms.internal.ads.zzbon r1 = new com.google.android.gms.internal.ads.zzbon     // Catch: java.lang.Throwable -> L22
            android.content.Context r5 = zzc(r5)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zza     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L22
            r1.<init>(r5, r6, r2, r7)     // Catch: java.lang.Throwable -> L22
            r4.zzc = r1     // Catch: java.lang.Throwable -> L22
        L1e:
            com.google.android.gms.internal.ads.zzbon r5 = r4.zzc     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r5
        L22:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r5
    }

    public final com.google.android.gms.internal.ads.zzbon zzb(android.content.Context r4, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5, com.google.android.gms.internal.ads.zzfmd r6) {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbon r1 = r3.zzd     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1a
            com.google.android.gms.internal.ads.zzbon r1 = new com.google.android.gms.internal.ads.zzbon     // Catch: java.lang.Throwable -> L1e
            android.content.Context r4 = zzc(r4)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbfb.zza     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.zze()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r4, r5, r2, r6)     // Catch: java.lang.Throwable -> L1e
            r3.zzd = r1     // Catch: java.lang.Throwable -> L1e
        L1a:
            com.google.android.gms.internal.ads.zzbon r4 = r3.zzd     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r4
        L1e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }
}
