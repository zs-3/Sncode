package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcvs implements com.google.android.gms.internal.ads.zzday, com.google.android.gms.internal.ads.zzdgm {
    private com.google.android.gms.internal.ads.zzbvu zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfmd zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final java.util.concurrent.Executor zzf;
    private boolean zzg;
    private boolean zzh;

    zzcvs(android.content.Context r2, com.google.android.gms.internal.ads.zzfmd r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4, java.util.concurrent.Executor r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzg = r0
            r1.zzh = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzb = r0
            r1.zzc = r2
            r1.zzd = r3
            r1.zze = r4
            r1.zzf = r5
            return
    }

    final /* synthetic */ void zzc() {
            r1 = this;
            android.content.Context r0 = r1.zzc
            com.google.android.gms.internal.ads.zzbcf.zze(r0)
            r0 = 1
            r1.zzh = r0
            return
    }

    public final void zzd() {
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzb
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzber.zzk
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 3
            r3 = 2
            if (r0 == 0) goto L1d
        L1b:
            r2 = 2
            goto L68
        L1d:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzber.zzl
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzber.zzj
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r2 = 1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()
            java.lang.String r0 = r0.zzc()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1b
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r2 = r2 + (-1)
            if (r2 == r1) goto L80
            if (r2 == r3) goto L6f
            goto La5
        L6f:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzfmd r2 = r5.zzd
            com.google.android.gms.internal.ads.zzboe r3 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbon r0 = r3.zzb(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzfmd r2 = r5.zzd
            com.google.android.gms.internal.ads.zzboe r3 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbon r0 = r3.zza(r0, r4, r2)
        L90:
            com.google.android.gms.internal.ads.zzboh r2 = com.google.android.gms.internal.ads.zzbok.zza
            java.lang.String r3 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzbod r0 = r0.zza(r3, r2, r2)
            android.content.Context r2 = r5.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r5.zze
            com.google.android.gms.internal.ads.zzbvw r4 = new com.google.android.gms.internal.ads.zzbvw
            r4.<init>(r2, r0, r3)
            r5.zza = r4
            r5.zzg = r1
        La5:
            boolean r0 = r5.zzg
            if (r0 != 0) goto Laa
            goto Ld3
        Laa:
            com.google.android.gms.internal.ads.zzbvu r0 = r5.zza
            if (r0 == 0) goto Ld3
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza()
            boolean r1 = r5.zzh
            if (r1 != 0) goto Lce
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbej.zzi
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lce
            com.google.android.gms.internal.ads.zzcvr r1 = new com.google.android.gms.internal.ads.zzcvr
            r1.<init>(r5)
            java.util.concurrent.Executor r2 = r5.zzf
            r0.addListener(r1, r2)
        Lce:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.zzcaq.zza(r0, r1)
        Ld3:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r1) {
            r0 = this;
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbd r1) {
            r0 = this;
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zzf(java.lang.String r1) {
            r0 = this;
            r0.zzd()
            return
    }
}
