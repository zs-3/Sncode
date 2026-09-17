package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdwv {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final java.lang.String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdwv(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, int r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    public final org.json.JSONObject zza() throws org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.zza
            java.lang.String r2 = "adapterClassName"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzc
            java.lang.String r2 = "version"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziT
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2c
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "sdkVersion"
            r0.put(r2, r1)
        L2c:
            int r1 = r3.zzd
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zze
            java.lang.String r2 = "description"
            r0.put(r2, r1)
            int r1 = r3.zzf
            java.lang.String r2 = "initializationLatencyMillis"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziU
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5a
            boolean r1 = r3.zzg
            java.lang.String r2 = "supportsInitialization"
            r0.put(r2, r1)
        L5a:
            return r0
    }
}
