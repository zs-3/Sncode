package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaz extends com.google.android.gms.internal.ads.zzaqr {
    private final android.content.Context zzb;

    private zzaz(android.content.Context r1, com.google.android.gms.internal.ads.zzaqq r2) {
            r0 = this;
            r0.<init>(r2)
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzaqf zzb(android.content.Context r4) {
            com.google.android.gms.ads.internal.util.zzaz r0 = new com.google.android.gms.ads.internal.util.zzaz
            com.google.android.gms.internal.ads.zzard r1 = new com.google.android.gms.internal.ads.zzard
            r2 = 0
            r1.<init>(r2, r2)
            r0.<init>(r4, r1)
            java.io.File r1 = new java.io.File
            com.google.android.gms.internal.ads.zzftn r2 = com.google.android.gms.internal.ads.zzftl.zza()
            java.io.File r4 = r4.getCacheDir()
            java.lang.String r3 = "admob_volley"
            java.lang.String r4 = com.google.android.gms.internal.ads.zzftm.zza(r2, r4, r3)
            r1.<init>(r4)
            com.google.android.gms.internal.ads.zzaqf r4 = new com.google.android.gms.internal.ads.zzaqf
            com.google.android.gms.internal.ads.zzaqy r2 = new com.google.android.gms.internal.ads.zzaqy
            r3 = 20971520(0x1400000, float:3.526483E-38)
            r2.<init>(r1, r3)
            r1 = 4
            r4.<init>(r2, r0, r1)
            r4.zzd()
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzaqr, com.google.android.gms.internal.ads.zzapv
    public final com.google.android.gms.internal.ads.zzapy zza(com.google.android.gms.internal.ads.zzaqc r4) throws com.google.android.gms.internal.ads.zzaql {
            r3 = this;
            int r0 = r4.zza()
            if (r0 != 0) goto L5a
            java.lang.String r0 = r4.zzk()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzep
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)
            if (r0 == 0) goto L5a
            android.content.Context r0 = r3.zzb
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzf.zzt(r0, r1)
            if (r0 == 0) goto L5a
            android.content.Context r0 = r3.zzb
            com.google.android.gms.internal.ads.zzblt r1 = new com.google.android.gms.internal.ads.zzblt
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzapy r0 = r1.zza(r4)
            if (r0 == 0) goto L49
            java.lang.String r4 = r4.zzk()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Got gmscore asset response: "
            java.lang.String r4 = r1.concat(r4)
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            return r0
        L49:
            java.lang.String r0 = r4.zzk()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Failed to get gmscore asset response: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        L5a:
            com.google.android.gms.internal.ads.zzapy r4 = super.zza(r4)
            return r4
    }
}
