package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static final class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.zza = r0
                r1.zzb = r0
                return
        }

        static /* bridge */ /* synthetic */ java.lang.String zza(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder r0) {
                java.lang.String r0 = r0.zzb
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.String zzb(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder r0) {
                java.lang.String r0 = r0.zza
                return r0
        }

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions build() {
                r2 = this;
                com.google.android.gms.ads.rewarded.ServerSideVerificationOptions r0 = new com.google.android.gms.ads.rewarded.ServerSideVerificationOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder setCustomData(java.lang.String r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder setUserId(java.lang.String r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    /* synthetic */ ServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder r1, com.google.android.gms.ads.rewarded.zzd r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r2 = com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder.zzb(r1)
            r0.zza = r2
            java.lang.String r1 = com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder.zza(r1)
            r0.zzb = r1
            return
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
