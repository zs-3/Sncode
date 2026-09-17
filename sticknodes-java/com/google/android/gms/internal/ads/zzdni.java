package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdni {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzdnx zzb;
    private final com.google.android.gms.internal.ads.zzdoc zzc;

    public zzdni(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzdnx r2, com.google.android.gms.internal.ads.zzdoc r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r17, com.google.android.gms.internal.ads.zzfgh r18, org.json.JSONObject r19) {
            r16 = this;
            r13 = r16
            r0 = r17
            r1 = r18
            r7 = r19
            com.google.android.gms.internal.ads.zzdnd r2 = new com.google.android.gms.internal.ads.zzdnd
            r2.<init>(r13, r0, r1, r7)
            com.google.android.gms.internal.ads.zzgfz r3 = r13.zza
            com.google.common.util.concurrent.ListenableFuture r2 = r3.zzb(r2)
            com.google.android.gms.internal.ads.zzdnx r3 = r13.zzb
            java.lang.String r4 = "images"
            com.google.common.util.concurrent.ListenableFuture r3 = r3.zzf(r7, r4)
            com.google.android.gms.internal.ads.zzfgs r5 = r0.zzb
            com.google.android.gms.internal.ads.zzfgk r5 = r5.zzb
            com.google.android.gms.internal.ads.zzdnx r6 = r13.zzb
            com.google.common.util.concurrent.ListenableFuture r10 = r6.zzg(r7, r4, r1, r5)
            java.lang.String r4 = "secondary_image"
            com.google.common.util.concurrent.ListenableFuture r5 = r6.zze(r7, r4)
            java.lang.String r4 = "app_icon"
            com.google.common.util.concurrent.ListenableFuture r4 = r6.zze(r7, r4)
            java.lang.String r8 = "attribution"
            com.google.common.util.concurrent.ListenableFuture r6 = r6.zzd(r7, r8)
            com.google.android.gms.internal.ads.zzfgs r0 = r0.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            com.google.android.gms.internal.ads.zzdnx r8 = r13.zzb
            com.google.common.util.concurrent.ListenableFuture r8 = r8.zzh(r7, r1, r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmz
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9d
            java.lang.String r0 = "video"
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            com.google.android.gms.internal.ads.zzdne r1 = new com.google.android.gms.internal.ads.zzdne
            r1.<init>()
            java.util.Optional r0 = r0.map(r1)
            com.google.android.gms.internal.ads.zzdnf r1 = new com.google.android.gms.internal.ads.zzdnf
            r1.<init>()
            java.util.Optional r0 = r0.map(r1)
            com.google.android.gms.internal.ads.zzdng r1 = new com.google.android.gms.internal.ads.zzdng
            r1.<init>()
            java.util.Optional r0 = r0.map(r1)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 3
            if (r0 != r1) goto L9d
            com.google.android.gms.internal.ads.zzdnx r0 = r13.zzb
            com.google.android.gms.internal.ads.zzcas r1 = new com.google.android.gms.internal.ads.zzcas
            r1.<init>()
            com.google.android.gms.internal.ads.zzdnw r9 = new com.google.android.gms.internal.ads.zzdnw
            r9.<init>(r0, r1)
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzgfo.zzr(r8, r9, r0)
            r9 = r1
            goto La7
        L9d:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            r9 = r0
        La7:
            com.google.android.gms.internal.ads.zzdoc r0 = r13.zzc
            java.lang.String r1 = "custom_assets"
            com.google.common.util.concurrent.ListenableFuture r12 = r0.zza(r7, r1)
            com.google.android.gms.internal.ads.zzdnx r0 = r13.zzb
            java.lang.String r1 = "enable_omid"
            boolean r1 = r7.optBoolean(r1)
            r11 = 0
            if (r1 != 0) goto Lc0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r11)
        Lbe:
            r11 = r0
            goto Lee
        Lc0:
            java.lang.String r1 = "omid_settings"
            org.json.JSONObject r1 = r7.optJSONObject(r1)
            if (r1 != 0) goto Lcd
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r11)
            goto Lbe
        Lcd:
            java.lang.String r14 = "omid_html"
            java.lang.String r1 = r1.optString(r14)
            boolean r14 = android.text.TextUtils.isEmpty(r1)
            if (r14 == 0) goto Lde
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r11)
            goto Lbe
        Lde:
            com.google.common.util.concurrent.ListenableFuture r11 = com.google.android.gms.internal.ads.zzgfo.zzh(r11)
            com.google.android.gms.internal.ads.zzdnk r14 = new com.google.android.gms.internal.ads.zzdnk
            r14.<init>(r0, r1)
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r11, r14, r0)
            goto Lbe
        Lee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            r0.add(r3)
            r0.add(r10)
            r0.add(r5)
            r0.add(r4)
            r0.add(r6)
            r0.add(r8)
            r0.add(r9)
            r0.add(r12)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfd
            com.google.android.gms.internal.ads.zzbct r14 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r14.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L123
            r0.add(r11)
        L123:
            com.google.android.gms.internal.ads.zzgfn r14 = com.google.android.gms.internal.ads.zzgfo.zza(r0)
            com.google.android.gms.internal.ads.zzdnh r15 = new com.google.android.gms.internal.ads.zzdnh
            r0 = r15
            r1 = r16
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.google.android.gms.internal.ads.zzgfz r0 = r13.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r14.zza(r15, r0)
            return r0
    }
}
