package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdoc {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzdnx zzb;

    public zzdoc(java.util.concurrent.Executor r1, com.google.android.gms.internal.ads.zzdnx r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(org.json.JSONObject r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r9 = "custom_assets"
            org.json.JSONArray r8 = r8.optJSONArray(r9)
            if (r8 != 0) goto L11
            java.util.List r8 = java.util.Collections.emptyList()
            com.google.common.util.concurrent.ListenableFuture r8 = com.google.android.gms.internal.ads.zzgfo.zzh(r8)
            return r8
        L11:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r0 = r8.length()
            r1 = 0
        L1b:
            if (r1 >= r0) goto L7a
            org.json.JSONObject r2 = r8.optJSONObject(r1)
            r3 = 0
            if (r2 != 0) goto L29
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
            goto L74
        L29:
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.optString(r4)
            if (r4 != 0) goto L36
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
            goto L74
        L36:
            java.lang.String r5 = "type"
            java.lang.String r5 = r2.optString(r5)
            java.lang.String r6 = "string"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L54
            com.google.android.gms.internal.ads.zzdob r3 = new com.google.android.gms.internal.ads.zzdob
            java.lang.String r5 = "string_value"
            java.lang.String r2 = r2.optString(r5)
            r3.<init>(r4, r2)
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
            goto L74
        L54:
            java.lang.String r6 = "image"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L70
            com.google.android.gms.internal.ads.zzdnx r3 = r7.zzb
            java.lang.String r5 = "image_value"
            com.google.common.util.concurrent.ListenableFuture r2 = r3.zze(r2, r5)
            com.google.android.gms.internal.ads.zzdnz r3 = new com.google.android.gms.internal.ads.zzdnz
            r3.<init>(r4)
            java.util.concurrent.Executor r4 = r7.zza
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzm(r2, r3, r4)
            goto L74
        L70:
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
        L74:
            r9.add(r2)
            int r1 = r1 + 1
            goto L1b
        L7a:
            com.google.common.util.concurrent.ListenableFuture r8 = com.google.android.gms.internal.ads.zzgfo.zzd(r9)
            com.google.android.gms.internal.ads.zzdoa r9 = new com.google.android.gms.internal.ads.zzdoa
            r9.<init>()
            java.util.concurrent.Executor r0 = r7.zza
            com.google.common.util.concurrent.ListenableFuture r8 = com.google.android.gms.internal.ads.zzgfo.zzm(r8, r9, r0)
            return r8
    }
}
