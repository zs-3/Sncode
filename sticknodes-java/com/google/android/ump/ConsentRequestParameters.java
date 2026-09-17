package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public class ConsentRequestParameters {
    private final boolean zza;
    private final java.lang.String zzb;
    private final com.google.android.ump.ConsentDebugSettings zzc;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public static final class Builder {
        private boolean zza;
        private java.lang.String zzb;
        private com.google.android.ump.ConsentDebugSettings zzc;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* bridge */ /* synthetic */ com.google.android.ump.ConsentDebugSettings zza(com.google.android.ump.ConsentRequestParameters.Builder r0) {
                com.google.android.ump.ConsentDebugSettings r0 = r0.zzc
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.String zzb(com.google.android.ump.ConsentRequestParameters.Builder r0) {
                java.lang.String r0 = r0.zzb
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zzc(com.google.android.ump.ConsentRequestParameters.Builder r0) {
                boolean r0 = r0.zza
                return r0
        }

        @androidx.annotation.RecentlyNonNull
        public com.google.android.ump.ConsentRequestParameters build() {
                r2 = this;
                com.google.android.ump.ConsentRequestParameters r0 = new com.google.android.ump.ConsentRequestParameters
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.ump.ConsentRequestParameters.Builder setAdMobAppId(java.lang.String r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        @androidx.annotation.RecentlyNonNull
        public com.google.android.ump.ConsentRequestParameters.Builder setConsentDebugSettings(com.google.android.ump.ConsentDebugSettings r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        @androidx.annotation.RecentlyNonNull
        public com.google.android.ump.ConsentRequestParameters.Builder setTagForUnderAgeOfConsent(boolean r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    /* synthetic */ ConsentRequestParameters(com.google.android.ump.ConsentRequestParameters.Builder r1, com.google.android.ump.zzb r2) {
            r0 = this;
            r0.<init>()
            boolean r2 = com.google.android.ump.ConsentRequestParameters.Builder.zzc(r1)
            r0.zza = r2
            java.lang.String r2 = com.google.android.ump.ConsentRequestParameters.Builder.zzb(r1)
            r0.zzb = r2
            com.google.android.ump.ConsentDebugSettings r1 = com.google.android.ump.ConsentRequestParameters.Builder.zza(r1)
            r0.zzc = r1
            return
    }

    @androidx.annotation.RecentlyNullable
    public com.google.android.ump.ConsentDebugSettings getConsentDebugSettings() {
            r1 = this;
            com.google.android.ump.ConsentDebugSettings r0 = r1.zzc
            return r0
    }

    public boolean isTagForUnderAgeOfConsent() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    @androidx.annotation.RecentlyNullable
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
