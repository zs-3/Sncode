package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbqr implements com.google.android.gms.ads.mediation.NativeMediationAdRequest {
    private final java.util.Date zza;
    private final int zzb;
    private final java.util.Set zzc;
    private final boolean zzd;
    private final android.location.Location zze;
    private final int zzf;
    private final com.google.android.gms.internal.ads.zzbfr zzg;
    private final java.util.List zzh;
    private final boolean zzi;
    private final java.util.Map zzj;

    public zzbqr(java.util.Date r1, int r2, java.util.Set r3, android.location.Location r4, boolean r5, int r6, com.google.android.gms.internal.ads.zzbfr r7, java.util.List r8, boolean r9, int r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zze = r4
            r0.zzd = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzi = r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzh = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzj = r1
            if (r8 == 0) goto L75
            java.util.Iterator r1 = r8.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "custom:"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L6f
            java.lang.String r3 = ":"
            r4 = 3
            java.lang.String[] r2 = r2.split(r3, r4)
            int r3 = r2.length
            if (r3 != r4) goto L27
            r3 = 2
            r4 = r2[r3]
            java.lang.String r5 = "true"
            boolean r4 = r5.equals(r4)
            r5 = 1
            if (r4 == 0) goto L5b
            java.util.Map r3 = r0.zzj
            r2 = r2[r5]
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.put(r2, r4)
            goto L27
        L5b:
            r3 = r2[r3]
            java.lang.String r4 = "false"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L27
            java.util.Map r3 = r0.zzj
            r2 = r2[r5]
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put(r2, r4)
            goto L27
        L6f:
            java.util.List r3 = r0.zzh
            r3.add(r2)
            goto L27
        L75:
            return
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            float r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final java.util.Date getBirthday() {
            r1 = this;
            java.util.Date r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final int getGender() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final java.util.Set<java.lang.String> getKeywords() {
            r1 = this;
            java.util.Set r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final android.location.Location getLocation() {
            r1 = this;
            android.location.Location r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions() {
            r4 = this;
            com.google.android.gms.ads.formats.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.formats.NativeAdOptions$Builder
            r0.<init>()
            com.google.android.gms.internal.ads.zzbfr r1 = r4.zzg
            if (r1 != 0) goto Le
            com.google.android.gms.ads.formats.NativeAdOptions r0 = r0.build()
            goto L48
        Le:
            int r2 = r1.zza
            r3 = 2
            if (r2 == r3) goto L30
            r3 = 3
            if (r2 == r3) goto L24
            r3 = 4
            if (r2 == r3) goto L1a
            goto L35
        L1a:
            boolean r2 = r1.zzg
            r0.setRequestCustomMuteThisAd(r2)
            int r2 = r1.zzh
            r0.setMediaAspectRatio(r2)
        L24:
            com.google.android.gms.ads.internal.client.zzgb r2 = r1.zzf
            if (r2 == 0) goto L30
            com.google.android.gms.ads.VideoOptions r3 = new com.google.android.gms.ads.VideoOptions
            r3.<init>(r2)
            r0.setVideoOptions(r3)
        L30:
            int r2 = r1.zze
            r0.setAdChoicesPlacement(r2)
        L35:
            boolean r2 = r1.zzb
            r0.setReturnUrlsForImageAssets(r2)
            int r2 = r1.zzc
            r0.setImageOrientation(r2)
            boolean r1 = r1.zzd
            r0.setRequestMultipleImages(r1)
            com.google.android.gms.ads.formats.NativeAdOptions r0 = r0.build()
        L48:
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbfr r0 = r1.zzg
            com.google.android.gms.ads.nativead.NativeAdOptions r0 = com.google.android.gms.internal.ads.zzbfr.zza(r0)
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            boolean r0 = r0.zzy()
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final boolean isDesignedForFamilies() {
            r1 = this;
            boolean r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
            r2 = this;
            java.util.List r0 = r2.zzh
            java.lang.String r1 = "6"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final java.util.Map zza() {
            r1 = this;
            java.util.Map r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
            r2 = this;
            java.util.List r0 = r2.zzh
            java.lang.String r1 = "3"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
