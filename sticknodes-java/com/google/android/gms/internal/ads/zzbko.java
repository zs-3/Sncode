package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbko implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzbkn zza;

    public zzbko(com.google.android.gms.internal.ads.zzbkn r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static void zzb(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.internal.ads.zzbkn r2) {
            com.google.android.gms.internal.ads.zzbko r0 = new com.google.android.gms.internal.ads.zzbko
            r0.<init>(r2)
            java.lang.String r2 = "/reward"
            r1.zzag(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            java.lang.String r3 = "action"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "grant"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3e
            r3 = 0
            java.lang.String r0 = "amount"
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L32
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L32
            java.lang.String r1 = "type"
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.NumberFormatException -> L32
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.NumberFormatException -> L32
            if (r1 != 0) goto L38
            com.google.android.gms.internal.ads.zzbwy r1 = new com.google.android.gms.internal.ads.zzbwy     // Catch: java.lang.NumberFormatException -> L32
            r1.<init>(r4, r0)     // Catch: java.lang.NumberFormatException -> L32
            r3 = r1
            goto L38
        L32:
            r4 = move-exception
            java.lang.String r0 = "Unable to parse reward amount."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r4)
        L38:
            com.google.android.gms.internal.ads.zzbkn r4 = r2.zza
            r4.zza(r3)
            return
        L3e:
            java.lang.String r4 = "video_start"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L4c
            com.google.android.gms.internal.ads.zzbkn r3 = r2.zza
            r3.zzc()
            return
        L4c:
            java.lang.String r4 = "video_complete"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L59
            com.google.android.gms.internal.ads.zzbkn r3 = r2.zza
            r3.zzb()
        L59:
            return
    }
}
