package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class AdLoader {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.client.zzbr zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static class Builder {
        private final android.content.Context zza;
        private final com.google.android.gms.ads.internal.client.zzbu zzb;

        public Builder(android.content.Context r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "context cannot be null"
                java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
                android.content.Context r0 = (android.content.Context) r0
                com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()
                com.google.android.gms.internal.ads.zzbph r2 = new com.google.android.gms.internal.ads.zzbph
                r2.<init>()
                com.google.android.gms.ads.internal.client.zzbu r4 = r1.zzd(r4, r5, r2)
                r3.<init>()
                r3.zza = r0
                r3.zzb = r4
                return
        }

        public com.google.android.gms.ads.AdLoader build() {
                r4 = this;
                com.google.android.gms.ads.AdLoader r0 = new com.google.android.gms.ads.AdLoader     // Catch: android.os.RemoteException -> L10
                android.content.Context r1 = r4.zza     // Catch: android.os.RemoteException -> L10
                com.google.android.gms.ads.internal.client.zzbu r2 = r4.zzb     // Catch: android.os.RemoteException -> L10
                com.google.android.gms.ads.internal.client.zzbr r2 = r2.zze()     // Catch: android.os.RemoteException -> L10
                com.google.android.gms.ads.internal.client.zzr r3 = com.google.android.gms.ads.internal.client.zzr.zza     // Catch: android.os.RemoteException -> L10
                r0.<init>(r1, r2, r3)     // Catch: android.os.RemoteException -> L10
                return r0
            L10:
                r0 = move-exception
                java.lang.String r1 = "Failed to build AdLoader."
                com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
                com.google.android.gms.ads.internal.client.zzfj r0 = new com.google.android.gms.ads.internal.client.zzfj
                r0.<init>()
                android.content.Context r1 = r4.zza
                com.google.android.gms.ads.AdLoader r2 = new com.google.android.gms.ads.AdLoader
                com.google.android.gms.ads.internal.client.zzbr r0 = r0.zzc()
                com.google.android.gms.ads.internal.client.zzr r3 = com.google.android.gms.ads.internal.client.zzr.zza
                r2.<init>(r1, r0, r3)
                return r2
        }

        public com.google.android.gms.ads.AdLoader.Builder forAdManagerAdView(com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener r3, com.google.android.gms.ads.AdSize... r4) {
                r2 = this;
                if (r4 == 0) goto L1e
                int r0 = r4.length
                if (r0 <= 0) goto L1e
                com.google.android.gms.ads.internal.client.zzs r0 = new com.google.android.gms.ads.internal.client.zzs     // Catch: android.os.RemoteException -> L17
                android.content.Context r1 = r2.zza     // Catch: android.os.RemoteException -> L17
                r0.<init>(r1, r4)     // Catch: android.os.RemoteException -> L17
                com.google.android.gms.ads.internal.client.zzbu r4 = r2.zzb     // Catch: android.os.RemoteException -> L17
                com.google.android.gms.internal.ads.zzbij r1 = new com.google.android.gms.internal.ads.zzbij     // Catch: android.os.RemoteException -> L17
                r1.<init>(r3)     // Catch: android.os.RemoteException -> L17
                r4.zzj(r1, r0)     // Catch: android.os.RemoteException -> L17
                goto L1d
            L17:
                r3 = move-exception
                java.lang.String r4 = "Failed to add Google Ad Manager banner ad listener"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r4, r3)
            L1d:
                return r2
            L1e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "The supported ad sizes must contain at least one valid ad size."
                r3.<init>(r4)
                throw r3
        }

        public com.google.android.gms.ads.AdLoader.Builder forCustomFormatAd(java.lang.String r2, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener r3, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener r4) {
                r1 = this;
                com.google.android.gms.internal.ads.zzbsz r0 = new com.google.android.gms.internal.ads.zzbsz
                r0.<init>(r3, r4)
                com.google.android.gms.ads.internal.client.zzbu r3 = r1.zzb     // Catch: android.os.RemoteException -> L13
                com.google.android.gms.internal.ads.zzbhj r4 = r0.zzb()     // Catch: android.os.RemoteException -> L13
                com.google.android.gms.internal.ads.zzbhg r0 = r0.zza()     // Catch: android.os.RemoteException -> L13
                r3.zzh(r2, r4, r0)     // Catch: android.os.RemoteException -> L13
                goto L19
            L13:
                r2 = move-exception
                java.lang.String r3 = "Failed to add custom format ad listener"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r2)
            L19:
                return r1
        }

        public com.google.android.gms.ads.AdLoader.Builder forNativeAd(com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener r3) {
                r2 = this;
                com.google.android.gms.ads.internal.client.zzbu r0 = r2.zzb     // Catch: android.os.RemoteException -> Lb
                com.google.android.gms.internal.ads.zzbtb r1 = new com.google.android.gms.internal.ads.zzbtb     // Catch: android.os.RemoteException -> Lb
                r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
                r0.zzk(r1)     // Catch: android.os.RemoteException -> Lb
                goto L11
            Lb:
                r3 = move-exception
                java.lang.String r0 = "Failed to add google native ad listener"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)
            L11:
                return r2
        }

        public com.google.android.gms.ads.AdLoader.Builder withAdListener(com.google.android.gms.ads.AdListener r3) {
                r2 = this;
                com.google.android.gms.ads.internal.client.zzbu r0 = r2.zzb     // Catch: android.os.RemoteException -> Lb
                com.google.android.gms.ads.internal.client.zzg r1 = new com.google.android.gms.ads.internal.client.zzg     // Catch: android.os.RemoteException -> Lb
                r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
                r0.zzl(r1)     // Catch: android.os.RemoteException -> Lb
                goto L11
            Lb:
                r3 = move-exception
                java.lang.String r0 = "Failed to set AdListener."
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)
            L11:
                return r2
        }

        public com.google.android.gms.ads.AdLoader.Builder withAdManagerAdViewOptions(com.google.android.gms.ads.formats.AdManagerAdViewOptions r2) {
                r1 = this;
                com.google.android.gms.ads.internal.client.zzbu r0 = r1.zzb     // Catch: android.os.RemoteException -> L6
                r0.zzm(r2)     // Catch: android.os.RemoteException -> L6
                goto Lc
            L6:
                r2 = move-exception
                java.lang.String r0 = "Failed to specify Ad Manager banner ad options"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r2)
            Lc:
                return r1
        }

        public com.google.android.gms.ads.AdLoader.Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions r15) {
                r14 = this;
                com.google.android.gms.ads.internal.client.zzbu r0 = r14.zzb     // Catch: android.os.RemoteException -> L42
                com.google.android.gms.internal.ads.zzbfr r13 = new com.google.android.gms.internal.ads.zzbfr     // Catch: android.os.RemoteException -> L42
                boolean r3 = r15.shouldReturnUrlsForImageAssets()     // Catch: android.os.RemoteException -> L42
                boolean r5 = r15.shouldRequestMultipleImages()     // Catch: android.os.RemoteException -> L42
                int r6 = r15.getAdChoicesPlacement()     // Catch: android.os.RemoteException -> L42
                com.google.android.gms.ads.VideoOptions r1 = r15.getVideoOptions()     // Catch: android.os.RemoteException -> L42
                if (r1 == 0) goto L20
                com.google.android.gms.ads.internal.client.zzgb r1 = new com.google.android.gms.ads.internal.client.zzgb     // Catch: android.os.RemoteException -> L42
                com.google.android.gms.ads.VideoOptions r2 = r15.getVideoOptions()     // Catch: android.os.RemoteException -> L42
                r1.<init>(r2)     // Catch: android.os.RemoteException -> L42
                goto L21
            L20:
                r1 = 0
            L21:
                r7 = r1
                boolean r8 = r15.zzc()     // Catch: android.os.RemoteException -> L42
                int r9 = r15.getMediaAspectRatio()     // Catch: android.os.RemoteException -> L42
                int r10 = r15.zza()     // Catch: android.os.RemoteException -> L42
                boolean r11 = r15.zzb()     // Catch: android.os.RemoteException -> L42
                int r15 = r15.zzd()     // Catch: android.os.RemoteException -> L42
                int r12 = r15 + (-1)
                r2 = 4
                r4 = -1
                r1 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: android.os.RemoteException -> L42
                r0.zzo(r13)     // Catch: android.os.RemoteException -> L42
                goto L48
            L42:
                r15 = move-exception
                java.lang.String r0 = "Failed to specify native ad options"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r15)
            L48:
                return r14
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zza(java.lang.String r2, com.google.android.gms.ads.formats.zzg r3, com.google.android.gms.ads.formats.zzf r4) {
                r1 = this;
                com.google.android.gms.internal.ads.zzbih r0 = new com.google.android.gms.internal.ads.zzbih
                r0.<init>(r3, r4)
                com.google.android.gms.ads.internal.client.zzbu r3 = r1.zzb     // Catch: android.os.RemoteException -> L13
                com.google.android.gms.internal.ads.zzbhj r4 = r0.zzd()     // Catch: android.os.RemoteException -> L13
                com.google.android.gms.internal.ads.zzbhg r0 = r0.zzc()     // Catch: android.os.RemoteException -> L13
                r3.zzh(r2, r4, r0)     // Catch: android.os.RemoteException -> L13
                goto L19
            L13:
                r2 = move-exception
                java.lang.String r3 = "Failed to add custom template ad listener"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r2)
            L19:
                return r1
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zzb(com.google.android.gms.ads.formats.zzi r3) {
                r2 = this;
                com.google.android.gms.ads.internal.client.zzbu r0 = r2.zzb     // Catch: android.os.RemoteException -> Lb
                com.google.android.gms.internal.ads.zzbik r1 = new com.google.android.gms.internal.ads.zzbik     // Catch: android.os.RemoteException -> Lb
                r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
                r0.zzk(r1)     // Catch: android.os.RemoteException -> Lb
                goto L11
            Lb:
                r3 = move-exception
                java.lang.String r0 = "Failed to add google native ad listener"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)
            L11:
                return r2
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions r3) {
                r2 = this;
                com.google.android.gms.ads.internal.client.zzbu r0 = r2.zzb     // Catch: android.os.RemoteException -> Lb
                com.google.android.gms.internal.ads.zzbfr r1 = new com.google.android.gms.internal.ads.zzbfr     // Catch: android.os.RemoteException -> Lb
                r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
                r0.zzo(r1)     // Catch: android.os.RemoteException -> Lb
                goto L11
            Lb:
                r3 = move-exception
                java.lang.String r0 = "Failed to specify native ad options"
                com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)
            L11:
                return r2
        }
    }

    AdLoader(android.content.Context r1, com.google.android.gms.ads.internal.client.zzbr r2, com.google.android.gms.ads.internal.client.zzr r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zza = r3
            return
    }

    private final void zzb(com.google.android.gms.ads.internal.client.zzei r4) {
            r3 = this;
            android.content.Context r0 = r3.zzb
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L26
            goto L31
        L26:
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb
            com.google.android.gms.ads.zza r1 = new com.google.android.gms.ads.zza
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
        L31:
            com.google.android.gms.ads.internal.client.zzbr r0 = r3.zzc     // Catch: android.os.RemoteException -> L3f
            com.google.android.gms.ads.internal.client.zzr r1 = r3.zza     // Catch: android.os.RemoteException -> L3f
            android.content.Context r2 = r3.zzb     // Catch: android.os.RemoteException -> L3f
            com.google.android.gms.ads.internal.client.zzm r4 = r1.zza(r2, r4)     // Catch: android.os.RemoteException -> L3f
            r0.zzg(r4)     // Catch: android.os.RemoteException -> L3f
            return
        L3f:
            r4 = move-exception
            java.lang.String r0 = "Failed to load ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            return
    }

    public boolean isLoading() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzbr r0 = r2.zzc     // Catch: android.os.RemoteException -> L7
            boolean r0 = r0.zzi()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = "Failed to check if ad is loading."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            r0 = 0
            return r0
    }

    public void loadAd(com.google.android.gms.ads.AdRequest r1) {
            r0 = this;
            com.google.android.gms.ads.internal.client.zzei r1 = r1.zza
            r0.zzb(r1)
            return
    }

    public void loadAd(com.google.android.gms.ads.admanager.AdManagerAdRequest r1) {
            r0 = this;
            com.google.android.gms.ads.internal.client.zzei r1 = r1.zza
            r0.zzb(r1)
            return
    }

    public void loadAds(com.google.android.gms.ads.AdRequest r4, int r5) {
            r3 = this;
            com.google.android.gms.ads.internal.client.zzei r4 = r4.zza
            com.google.android.gms.ads.internal.client.zzbr r0 = r3.zzc     // Catch: android.os.RemoteException -> L10
            com.google.android.gms.ads.internal.client.zzr r1 = r3.zza     // Catch: android.os.RemoteException -> L10
            android.content.Context r2 = r3.zzb     // Catch: android.os.RemoteException -> L10
            com.google.android.gms.ads.internal.client.zzm r4 = r1.zza(r2, r4)     // Catch: android.os.RemoteException -> L10
            r0.zzh(r4, r5)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r4 = move-exception
            java.lang.String r5 = "Failed to load ads."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r4)
            return
    }

    final /* synthetic */ void zza(com.google.android.gms.ads.internal.client.zzei r4) {
            r3 = this;
            com.google.android.gms.ads.internal.client.zzbr r0 = r3.zzc     // Catch: android.os.RemoteException -> Le
            com.google.android.gms.ads.internal.client.zzr r1 = r3.zza     // Catch: android.os.RemoteException -> Le
            android.content.Context r2 = r3.zzb     // Catch: android.os.RemoteException -> Le
            com.google.android.gms.ads.internal.client.zzm r4 = r1.zza(r2, r4)     // Catch: android.os.RemoteException -> Le
            r0.zzg(r4)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r4 = move-exception
            java.lang.String r0 = "Failed to load ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            return
    }
}
