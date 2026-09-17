package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzk extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zza;
    private final com.google.android.gms.internal.ads.zzdui zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze;
    private final java.lang.Boolean zzf;

    public zzk(com.google.android.gms.ads.nonagon.signalgeneration.zzj r1, boolean r2, int r3, java.lang.Boolean r4, com.google.android.gms.internal.ads.zzdui r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zzf = r4
            r0.zzb = r5
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            r0.zze = r1
            return
    }

    private static long zza() {
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjx
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r0 = r0 + r2
            return r0
    }

    private final long zzb() {
            r4 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            long r2 = r4.zze
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String r11) {
            r10 = this;
            r0 = 9
            android.util.Pair[] r0 = new android.util.Pair[r0]
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "sgf_reason"
            r1.<init>(r2, r11)
            r2 = 0
            r0[r2] = r1
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "se"
            java.lang.String r3 = "query_g"
            r1.<init>(r2, r3)
            r2 = 1
            r0[r2] = r1
            android.util.Pair r1 = new android.util.Pair
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.BANNER
            java.lang.String r3 = r3.name()
            java.lang.String r4 = "ad_format"
            r1.<init>(r4, r3)
            r3 = 2
            r0[r3] = r1
            android.util.Pair r1 = new android.util.Pair
            r3 = 6
            java.lang.String r4 = java.lang.Integer.toString(r3)
            java.lang.String r5 = "rtype"
            r1.<init>(r5, r4)
            r4 = 3
            r0[r4] = r1
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r4 = "scar"
            java.lang.String r5 = "true"
            r1.<init>(r4, r5)
            r4 = 4
            r0[r4] = r1
            android.util.Pair r1 = new android.util.Pair
            long r4 = r10.zzb()
            java.lang.String r4 = java.lang.Long.toString(r4)
            java.lang.String r5 = "lat_ms"
            r1.<init>(r5, r4)
            r4 = 5
            r0[r4] = r1
            android.util.Pair r1 = new android.util.Pair
            int r4 = r10.zzd
            java.lang.String r4 = java.lang.Integer.toString(r4)
            java.lang.String r5 = "sgpc_rn"
            r1.<init>(r5, r4)
            r0[r3] = r1
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r3 = r10.zzf
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "sgpc_lsu"
            r1.<init>(r4, r3)
            r3 = 7
            r0[r3] = r1
            boolean r1 = r10.zzc
            android.util.Pair r3 = new android.util.Pair
            if (r2 == r1) goto L7f
            java.lang.String r1 = "0"
            goto L81
        L7f:
            java.lang.String r1 = "1"
        L81:
            java.lang.String r2 = "tpc"
            r3.<init>(r2, r1)
            r1 = 8
            r0[r1] = r3
            com.google.android.gms.internal.ads.zzdui r1 = r10.zzb
            r2 = 0
            java.lang.String r3 = "sgpcf"
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r1, r2, r3, r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzl r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzl
            r5 = 0
            long r7 = zza()
            int r9 = r10.zzd
            r4 = r0
            r6 = r11
            r4.<init>(r5, r6, r7, r9)
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r11 = r10.zza
            boolean r1 = r10.zzc
            r11.zzf(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo r11) {
            r10 = this;
            r0 = 8
            android.util.Pair[] r0 = new android.util.Pair[r0]
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "se"
            java.lang.String r3 = "query_g"
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            android.util.Pair r1 = new android.util.Pair
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER
            java.lang.String r2 = r2.name()
            java.lang.String r3 = "ad_format"
            r1.<init>(r3, r2)
            r2 = 1
            r0[r2] = r1
            android.util.Pair r1 = new android.util.Pair
            r3 = 6
            java.lang.String r4 = java.lang.Integer.toString(r3)
            java.lang.String r5 = "rtype"
            r1.<init>(r5, r4)
            r4 = 2
            r0[r4] = r1
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r4 = "scar"
            java.lang.String r5 = "true"
            r1.<init>(r4, r5)
            r4 = 3
            r0[r4] = r1
            android.util.Pair r1 = new android.util.Pair
            long r4 = r10.zzb()
            java.lang.String r4 = java.lang.Long.toString(r4)
            java.lang.String r5 = "lat_ms"
            r1.<init>(r5, r4)
            r4 = 4
            r0[r4] = r1
            android.util.Pair r1 = new android.util.Pair
            int r4 = r10.zzd
            java.lang.String r4 = java.lang.Integer.toString(r4)
            java.lang.String r5 = "sgpc_rn"
            r1.<init>(r5, r4)
            r4 = 5
            r0[r4] = r1
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r4 = r10.zzf
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "sgpc_lsu"
            r1.<init>(r5, r4)
            r0[r3] = r1
            boolean r1 = r10.zzc
            android.util.Pair r3 = new android.util.Pair
            if (r2 == r1) goto L75
            java.lang.String r1 = "0"
            goto L77
        L75:
            java.lang.String r1 = "1"
        L77:
            java.lang.String r2 = "tpc"
            r3.<init>(r2, r1)
            r1 = 7
            r0[r1] = r3
            com.google.android.gms.internal.ads.zzdui r1 = r10.zzb
            r2 = 0
            java.lang.String r3 = "sgpcs"
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r1, r2, r3, r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzl r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzl
            long r7 = zza()
            int r9 = r10.zzd
            java.lang.String r6 = ""
            r4 = r0
            r5 = r11
            r4.<init>(r5, r6, r7, r9)
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r11 = r10.zza
            boolean r1 = r10.zzc
            r11.zzf(r1, r0)
            return
    }
}
