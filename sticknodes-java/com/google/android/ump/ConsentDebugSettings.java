package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public class ConsentDebugSettings {
    private final boolean zza;
    private final int zzb;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public static class Builder {
        private final java.util.List zza;
        private final android.content.Context zzb;
        private int zzc;
        private boolean zzd;

        public Builder(@androidx.annotation.RecentlyNonNull android.content.Context r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zza = r0
                r0 = 0
                r1.zzc = r0
                android.content.Context r2 = r2.getApplicationContext()
                r1.zzb = r2
                return
        }

        static /* bridge */ /* synthetic */ int zza(com.google.android.ump.ConsentDebugSettings.Builder r0) {
                int r0 = r0.zzc
                return r0
        }

        @androidx.annotation.RecentlyNonNull
        public com.google.android.ump.ConsentDebugSettings.Builder addTestDeviceHashedId(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
                r1 = this;
                java.util.List r0 = r1.zza
                r0.add(r2)
                return r1
        }

        @androidx.annotation.RecentlyNonNull
        public com.google.android.ump.ConsentDebugSettings build() {
                r3 = this;
                r0 = 1
                boolean r1 = com.google.android.gms.internal.consent_sdk.zzct.zza(r0)
                if (r1 != 0) goto L1c
                java.util.List r1 = r3.zza
                android.content.Context r2 = r3.zzb
                java.lang.String r2 = com.google.android.gms.internal.consent_sdk.zzcl.zza(r2)
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L16
                goto L1c
            L16:
                boolean r1 = r3.zzd
                if (r1 == 0) goto L1b
                goto L1c
            L1b:
                r0 = 0
            L1c:
                com.google.android.ump.ConsentDebugSettings r1 = new com.google.android.ump.ConsentDebugSettings
                r2 = 0
                r1.<init>(r0, r3, r2)
                return r1
        }

        @androidx.annotation.RecentlyNonNull
        public com.google.android.ump.ConsentDebugSettings.Builder setDebugGeography(int r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.ump.ConsentDebugSettings.Builder setForceTesting(boolean r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }

    /* synthetic */ ConsentDebugSettings(boolean r1, com.google.android.ump.ConsentDebugSettings.Builder r2, com.google.android.ump.zza r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            int r1 = com.google.android.ump.ConsentDebugSettings.Builder.zza(r2)
            r0.zzb = r1
            return
    }

    public int getDebugGeography() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public boolean isTestDevice() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }
}
