package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzedg implements com.google.android.gms.internal.ads.zzfkj {
    private static final java.util.regex.Pattern zza = null;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzflp zzc;
    private final com.google.android.gms.internal.ads.zzfma zzd;

    static {
            java.lang.String r0 = "([^;]+=[^;]+)(;\\s|$)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.ads.zzedg.zza = r0
            return
    }

    public zzedg(java.lang.String r1, com.google.android.gms.internal.ads.zzfma r2, com.google.android.gms.internal.ads.zzflp r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzd = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfkj
    public final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.Object r12) throws java.lang.Exception {
            r11 = this;
            com.google.android.gms.internal.ads.zzedf r12 = (com.google.android.gms.internal.ads.zzedf) r12
            org.json.JSONObject r0 = com.google.android.gms.internal.ads.zzedf.zzb(r12)
            java.lang.String r1 = "http_timeout_millis"
            r2 = 60000(0xea60, float:8.4078E-41)
            int r5 = r0.optInt(r1, r2)
            com.google.android.gms.internal.ads.zzbwc r0 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            int r1 = r0.zza()
            java.lang.String r2 = ""
            r3 = 1
            r4 = -2
            if (r1 != r4) goto Lf5
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.google.android.gms.internal.ads.zzbwc r0 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            boolean r0 = r0.zzj()
            if (r0 == 0) goto L9f
            java.lang.String r0 = r11.zzb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9f
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaT
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "Cookie"
            if (r0 == 0) goto L9a
            java.lang.String r0 = r11.zzb
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L52
            r4 = r2
            goto L90
        L52:
            java.util.regex.Pattern r4 = com.google.android.gms.internal.ads.zzedg.zza
            java.util.regex.Matcher r0 = r4.matcher(r0)
            r4 = r2
        L59:
            boolean r7 = r0.find()
            if (r7 == 0) goto L90
            java.lang.String r7 = r0.group(r3)
            if (r7 == 0) goto L59
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r9 = r7.toLowerCase(r8)
            java.lang.String r10 = "id="
            boolean r9 = r9.startsWith(r10)
            if (r9 != 0) goto L7f
            java.lang.String r8 = r7.toLowerCase(r8)
            java.lang.String r9 = "ide="
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L59
        L7f:
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L8b
            java.lang.String r8 = "; "
            java.lang.String r4 = r4.concat(r8)
        L8b:
            java.lang.String r4 = r4.concat(r7)
            goto L59
        L90:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L9f
            r6.put(r1, r4)
            goto L9f
        L9a:
            java.lang.String r0 = r11.zzb
            r6.put(r1, r0)
        L9f:
            com.google.android.gms.internal.ads.zzbwc r0 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            boolean r0 = r0.zzk()
            if (r0 == 0) goto Lb0
            org.json.JSONObject r0 = com.google.android.gms.internal.ads.zzedf.zzb(r12)
            com.google.android.gms.internal.ads.zzedh.zza(r6, r0)
        Lb0:
            com.google.android.gms.internal.ads.zzbwc r0 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            if (r0 == 0) goto Lcc
            com.google.android.gms.internal.ads.zzbwc r0 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            java.lang.String r0 = r0.zzf()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lcc
            com.google.android.gms.internal.ads.zzbwc r0 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            java.lang.String r2 = r0.zzf()
        Lcc:
            com.google.android.gms.internal.ads.zzfma r0 = r11.zzd
            com.google.android.gms.internal.ads.zzflp r1 = r11.zzc
            r1.zzg(r3)
            r0.zza(r1)
            com.google.android.gms.internal.ads.zzedb r0 = new com.google.android.gms.internal.ads.zzedb
            com.google.android.gms.internal.ads.zzbwc r1 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            java.lang.String r4 = r1.zzg()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r7 = r2.getBytes(r1)
            com.google.android.gms.internal.ads.zzbwc r12 = com.google.android.gms.internal.ads.zzedf.zza(r12)
            boolean r9 = r12.zzk()
            java.lang.String r8 = ""
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        Lf5:
            int r12 = r0.zza()
            if (r12 != r3) goto L11f
            java.util.List r12 = r0.zzh()
            if (r12 == 0) goto L10e
            java.util.List r12 = r0.zzh()
            java.lang.String r0 = ", "
            java.lang.String r2 = android.text.TextUtils.join(r0, r12)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
        L10e:
            com.google.android.gms.internal.ads.zzdye r12 = new com.google.android.gms.internal.ads.zzdye
            r0 = 2
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "Error building request URL: "
            java.lang.String r1 = r2.concat(r1)
            r12.<init>(r0, r1)
            goto L124
        L11f:
            com.google.android.gms.internal.ads.zzdye r12 = new com.google.android.gms.internal.ads.zzdye
            r12.<init>(r3)
        L124:
            com.google.android.gms.internal.ads.zzfma r0 = r11.zzd
            com.google.android.gms.internal.ads.zzflp r1 = r11.zzc
            r1.zzh(r12)
            r2 = 0
            r1.zzg(r2)
            r0.zza(r1)
            throw r12
    }
}
