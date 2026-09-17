package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
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

    @java.lang.Deprecated
    public static final int ORIENTATION_ANY = 0;

    @java.lang.Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;

    @java.lang.Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final int zze;
    private final com.google.android.gms.ads.VideoOptions zzf;
    private final boolean zzg;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static final class Builder {
        private boolean zza;
        private int zzb;
        private int zzc;
        private boolean zzd;
        private com.google.android.gms.ads.VideoOptions zze;
        private int zzf;
        private boolean zzg;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.zza = r0
                r1 = -1
                r2.zzb = r1
                r2.zzc = r0
                r2.zzd = r0
                r1 = 1
                r2.zzf = r1
                r2.zzg = r0
                return
        }

        static /* bridge */ /* synthetic */ int zza(com.google.android.gms.ads.formats.NativeAdOptions.Builder r0) {
                int r0 = r0.zzf
                return r0
        }

        static /* bridge */ /* synthetic */ int zzb(com.google.android.gms.ads.formats.NativeAdOptions.Builder r0) {
                int r0 = r0.zzb
                return r0
        }

        static /* bridge */ /* synthetic */ int zzc(com.google.android.gms.ads.formats.NativeAdOptions.Builder r0) {
                int r0 = r0.zzc
                return r0
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.ads.VideoOptions zzd(com.google.android.gms.ads.formats.NativeAdOptions.Builder r0) {
                com.google.android.gms.ads.VideoOptions r0 = r0.zze
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zze(com.google.android.gms.ads.formats.NativeAdOptions.Builder r0) {
                boolean r0 = r0.zzd
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzf(com.google.android.gms.ads.formats.NativeAdOptions.Builder r0) {
                boolean r0 = r0.zza
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzg(com.google.android.gms.ads.formats.NativeAdOptions.Builder r0) {
                boolean r0 = r0.zzg
                return r0
        }

        public com.google.android.gms.ads.formats.NativeAdOptions build() {
                r2 = this;
                com.google.android.gms.ads.formats.NativeAdOptions r0 = new com.google.android.gms.ads.formats.NativeAdOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setAdChoicesPlacement(@com.google.android.gms.ads.formats.NativeAdOptions.AdChoicesPlacement int r1) {
                r0 = this;
                r0.zzf = r1
                return r0
        }

        @java.lang.Deprecated
        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setImageOrientation(int r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setMediaAspectRatio(@com.google.android.gms.ads.formats.NativeAdOptions.NativeMediaAspectRatio int r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setRequestCustomMuteThisAd(boolean r1) {
                r0 = this;
                r0.zzg = r1
                return r0
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setRequestMultipleImages(boolean r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setReturnUrlsForImageAssets(boolean r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.ads.formats.NativeAdOptions.Builder setVideoOptions(com.google.android.gms.ads.VideoOptions r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(com.google.android.gms.ads.formats.NativeAdOptions.Builder r1, com.google.android.gms.ads.formats.zzd r2) {
            r0 = this;
            r0.<init>()
            boolean r2 = com.google.android.gms.ads.formats.NativeAdOptions.Builder.zzf(r1)
            r0.zza = r2
            int r2 = com.google.android.gms.ads.formats.NativeAdOptions.Builder.zzb(r1)
            r0.zzb = r2
            int r2 = com.google.android.gms.ads.formats.NativeAdOptions.Builder.zzc(r1)
            r0.zzc = r2
            boolean r2 = com.google.android.gms.ads.formats.NativeAdOptions.Builder.zze(r1)
            r0.zzd = r2
            int r2 = com.google.android.gms.ads.formats.NativeAdOptions.Builder.zza(r1)
            r0.zze = r2
            com.google.android.gms.ads.VideoOptions r2 = com.google.android.gms.ads.formats.NativeAdOptions.Builder.zzd(r1)
            r0.zzf = r2
            boolean r1 = com.google.android.gms.ads.formats.NativeAdOptions.Builder.zzg(r1)
            r0.zzg = r1
            return
    }

    public int getAdChoicesPlacement() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @java.lang.Deprecated
    public int getImageOrientation() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public int getMediaAspectRatio() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public com.google.android.gms.ads.VideoOptions getVideoOptions() {
            r1 = this;
            com.google.android.gms.ads.VideoOptions r0 = r1.zzf
            return r0
    }

    public boolean shouldRequestMultipleImages() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    public boolean shouldReturnUrlsForImageAssets() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    public final boolean zza() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }
}
