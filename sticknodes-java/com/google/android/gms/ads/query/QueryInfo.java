package com.google.android.gms.ads.query;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class QueryInfo {
    private final com.google.android.gms.ads.internal.client.zzfb zza;

    public QueryInfo(com.google.android.gms.ads.internal.client.zzfb r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static void generate(android.content.Context r1, com.google.android.gms.ads.AdFormat r2, com.google.android.gms.ads.AdRequest r3, com.google.android.gms.ads.query.QueryInfoGenerationCallback r4) {
            r0 = 0
            zza(r1, r2, r3, r0, r4)
            return
    }

    public static void generate(android.content.Context r1, com.google.android.gms.ads.AdFormat r2, com.google.android.gms.ads.AdRequest r3, java.lang.String r4, com.google.android.gms.ads.query.QueryInfoGenerationCallback r5) {
            java.lang.String r0 = "AdUnitId cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            zza(r1, r2, r3, r4, r5)
            return
    }

    private static void zza(android.content.Context r8, com.google.android.gms.ads.AdFormat r9, com.google.android.gms.ads.AdRequest r10, java.lang.String r11, com.google.android.gms.ads.query.QueryInfoGenerationCallback r12) {
            com.google.android.gms.internal.ads.zzbcv.zza(r8)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzj
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L24
            goto L35
        L24:
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.query.zza r7 = new com.google.android.gms.ads.query.zza
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r7)
            return
        L35:
            com.google.android.gms.internal.ads.zzbud r0 = new com.google.android.gms.internal.ads.zzbud
            if (r10 != 0) goto L3b
            r10 = 0
            goto L3f
        L3b:
            com.google.android.gms.ads.internal.client.zzei r10 = r10.zza()
        L3f:
            r0.<init>(r8, r9, r10, r11)
            r0.zzb(r12)
            return
    }

    public java.lang.String getQuery() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzfb r0 = r1.zza
            java.lang.String r0 = r0.zzb()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getQueryBundle() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzfb r0 = r1.zza
            android.os.Bundle r0 = r0.zza()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getRequestId() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzfb r0 = r1.zza
            java.lang.String r0 = r0.zzc()
            return r0
    }
}
