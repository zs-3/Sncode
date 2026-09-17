package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static final class Builder {
        private boolean zza;
        private boolean zzb;
        private boolean zzc;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.zza = r0
                r0 = 0
                r1.zzb = r0
                r1.zzc = r0
                return
        }

        static /* bridge */ /* synthetic */ boolean zza(com.google.android.gms.ads.VideoOptions.Builder r0) {
                boolean r0 = r0.zzc
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzb(com.google.android.gms.ads.VideoOptions.Builder r0) {
                boolean r0 = r0.zzb
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.ads.VideoOptions.Builder r0) {
                boolean r0 = r0.zza
                return r0
        }

        public com.google.android.gms.ads.VideoOptions build() {
                r2 = this;
                com.google.android.gms.ads.VideoOptions r0 = new com.google.android.gms.ads.VideoOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.gms.ads.VideoOptions.Builder setClickToExpandRequested(boolean r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.ads.VideoOptions.Builder setCustomControlsRequested(boolean r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.ads.VideoOptions.Builder setStartMuted(boolean r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    /* synthetic */ VideoOptions(com.google.android.gms.ads.VideoOptions.Builder r1, com.google.android.gms.ads.zzi r2) {
            r0 = this;
            r0.<init>()
            boolean r2 = com.google.android.gms.ads.VideoOptions.Builder.zzc(r1)
            r0.zza = r2
            boolean r2 = com.google.android.gms.ads.VideoOptions.Builder.zzb(r1)
            r0.zzb = r2
            boolean r1 = com.google.android.gms.ads.VideoOptions.Builder.zza(r1)
            r0.zzc = r1
            return
    }

    public VideoOptions(com.google.android.gms.ads.internal.client.zzgb r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.zza
            r1.zza = r0
            boolean r0 = r2.zzb
            r1.zzb = r0
            boolean r2 = r2.zzc
            r1.zzc = r2
            return
    }

    public boolean getClickToExpandRequested() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public boolean getCustomControlsRequested() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    public boolean getStartMuted() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }
}
