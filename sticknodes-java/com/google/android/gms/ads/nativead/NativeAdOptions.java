package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    private final boolean zza;
    private final int zzb;
    private final boolean zzc;
    private final int zzd;
    private final com.google.android.gms.ads.VideoOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int zzh;
    private final int zzi;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static final class Builder {
        private boolean zza;
        private int zzb;
        private boolean zzc;
        private com.google.android.gms.ads.VideoOptions zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private int zzh;
        private int zzi;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.zza = r0
                r2.zzb = r0
                r2.zzc = r0
                r1 = 1
                r2.zze = r1
                r2.zzf = r0
                r2.zzg = r0
                r2.zzh = r0
                r2.zzi = r1
                return
        }

        static /* bridge */ /* synthetic */ int zza(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                int r0 = r0.zze
                return r0
        }

        static /* bridge */ /* synthetic */ int zzb(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                int r0 = r0.zzh
                return r0
        }

        static /* bridge */ /* synthetic */ int zzc(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                int r0 = r0.zzb
                return r0
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.ads.VideoOptions zzd(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                com.google.android.gms.ads.VideoOptions r0 = r0.zzd
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zze(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                boolean r0 = r0.zzg
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzf(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                boolean r0 = r0.zzc
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzg(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                boolean r0 = r0.zza
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzh(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                boolean r0 = r0.zzf
                return r0
        }

        static /* bridge */ /* synthetic */ int zzj(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r0) {
                int r0 = r0.zzi
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions build() {
                r2 = this;
                com.google.android.gms.ads.nativead.NativeAdOptions r0 = new com.google.android.gms.ads.nativead.NativeAdOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder enableCustomClickGestureDirection(@com.google.android.gms.ads.nativead.NativeAdOptions.SwipeGestureDirection int r1, boolean r2) {
                r0 = this;
                r0.zzg = r2
                r0.zzh = r1
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setAdChoicesPlacement(@com.google.android.gms.ads.nativead.NativeAdOptions.AdChoicesPlacement int r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setMediaAspectRatio(@com.google.android.gms.ads.nativead.NativeAdOptions.NativeMediaAspectRatio int r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setRequestCustomMuteThisAd(boolean r1) {
                r0 = this;
                r0.zzf = r1
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setRequestMultipleImages(boolean r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setReturnUrlsForImageAssets(boolean r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.ads.nativead.NativeAdOptions.Builder setVideoOptions(com.google.android.gms.ads.VideoOptions r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public final com.google.android.gms.ads.nativead.NativeAdOptions.Builder zzi(int r1) {
                r0 = this;
                r0.zzi = r1
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public @interface SwipeGestureDirection {
    }

    /* synthetic */ NativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions.Builder r1, com.google.android.gms.ads.nativead.zza r2) {
            r0 = this;
            r0.<init>()
            boolean r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zzg(r1)
            r0.zza = r2
            int r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zzc(r1)
            r0.zzb = r2
            boolean r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zzf(r1)
            r0.zzc = r2
            int r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zza(r1)
            r0.zzd = r2
            com.google.android.gms.ads.VideoOptions r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zzd(r1)
            r0.zze = r2
            boolean r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zzh(r1)
            r0.zzf = r2
            boolean r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zze(r1)
            r0.zzg = r2
            int r2 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zzb(r1)
            r0.zzh = r2
            int r1 = com.google.android.gms.ads.nativead.NativeAdOptions.Builder.zzj(r1)
            r0.zzi = r1
            return
    }

    public int getAdChoicesPlacement() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public int getMediaAspectRatio() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.ads.VideoOptions getVideoOptions() {
            r1 = this;
            com.google.android.gms.ads.VideoOptions r0 = r1.zze
            return r0
    }

    public boolean shouldRequestMultipleImages() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public boolean shouldReturnUrlsForImageAssets() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }

    public final boolean zzb() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }

    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zzf
            return r0
    }

    public final int zzd() {
            r1 = this;
            int r0 = r1.zzi
            return r0
    }
}
