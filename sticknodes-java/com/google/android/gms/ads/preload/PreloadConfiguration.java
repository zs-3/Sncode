package com.google.android.gms.ads.preload;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class PreloadConfiguration {
    private final java.lang.String zza;
    private final com.google.android.gms.ads.AdFormat zzb;
    private final com.google.android.gms.ads.AdRequest zzc;
    private final int zzd;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static class Builder {
        private final java.lang.String zza;
        private final com.google.android.gms.ads.AdFormat zzb;
        private com.google.android.gms.ads.AdRequest zzc;
        private int zzd;

        public Builder(java.lang.String r2, com.google.android.gms.ads.AdFormat r3) {
                r1 = this;
                r1.<init>()
                com.google.android.gms.ads.AdRequest$Builder r0 = new com.google.android.gms.ads.AdRequest$Builder
                r0.<init>()
                com.google.android.gms.ads.AdRequest r0 = r0.build()
                r1.zzc = r0
                r1.zza = r2
                r1.zzb = r3
                return
        }

        static /* bridge */ /* synthetic */ int zza(com.google.android.gms.ads.preload.PreloadConfiguration.Builder r0) {
                int r0 = r0.zzd
                return r0
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.ads.AdFormat zzb(com.google.android.gms.ads.preload.PreloadConfiguration.Builder r0) {
                com.google.android.gms.ads.AdFormat r0 = r0.zzb
                return r0
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.ads.AdRequest zzc(com.google.android.gms.ads.preload.PreloadConfiguration.Builder r0) {
                com.google.android.gms.ads.AdRequest r0 = r0.zzc
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.String zzd(com.google.android.gms.ads.preload.PreloadConfiguration.Builder r0) {
                java.lang.String r0 = r0.zza
                return r0
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration build() {
                r2 = this;
                com.google.android.gms.ads.preload.PreloadConfiguration r0 = new com.google.android.gms.ads.preload.PreloadConfiguration
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration.Builder setAdRequest(com.google.android.gms.ads.AdRequest r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration.Builder setBufferSize(int r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }
    }

    /* synthetic */ PreloadConfiguration(com.google.android.gms.ads.preload.PreloadConfiguration.Builder r1, com.google.android.gms.ads.preload.zza r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r2 = com.google.android.gms.ads.preload.PreloadConfiguration.Builder.zzd(r1)
            r0.zza = r2
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.preload.PreloadConfiguration.Builder.zzb(r1)
            r0.zzb = r2
            com.google.android.gms.ads.AdRequest r2 = com.google.android.gms.ads.preload.PreloadConfiguration.Builder.zzc(r1)
            r0.zzc = r2
            int r1 = com.google.android.gms.ads.preload.PreloadConfiguration.Builder.zza(r1)
            r0.zzd = r1
            return
    }

    public com.google.android.gms.ads.AdFormat getAdFormat() {
            r1 = this;
            com.google.android.gms.ads.AdFormat r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.ads.AdRequest getAdRequest() {
            r1 = this;
            com.google.android.gms.ads.AdRequest r0 = r1.zzc
            return r0
    }

    public java.lang.String getAdUnitId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public int getBufferSize() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }
}
