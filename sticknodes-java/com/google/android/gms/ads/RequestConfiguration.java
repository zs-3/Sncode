package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class RequestConfiguration {
    public static final java.lang.String MAX_AD_CONTENT_RATING_G = "G";
    public static final java.lang.String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final java.lang.String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final java.lang.String MAX_AD_CONTENT_RATING_T = "T";
    public static final java.lang.String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    public static final java.util.List zza = null;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState zzf;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static class Builder {
        private int zza;
        private int zzb;
        private java.lang.String zzc;
        private final java.util.List zzd;
        private com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState zze;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.zza = r0
                r1.zzb = r0
                r0 = 0
                r1.zzc = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zzd = r0
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r0 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT
                r1.zze = r0
                return
        }

        public com.google.android.gms.ads.RequestConfiguration build() {
                r8 = this;
                com.google.android.gms.ads.RequestConfiguration r7 = new com.google.android.gms.ads.RequestConfiguration
                int r1 = r8.zza
                int r2 = r8.zzb
                java.lang.String r3 = r8.zzc
                java.util.List r4 = r8.zzd
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r5 = r8.zze
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setMaxAdContentRating(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L39
                java.lang.String r0 = ""
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lb
                goto L39
            Lb:
                java.lang.String r0 = "G"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L36
                java.lang.String r0 = "PG"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L36
                java.lang.String r0 = "T"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L36
                java.lang.String r0 = "MA"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L2c
                goto L36
            L2c:
                java.lang.String r0 = "Invalid value passed to setMaxAdContentRating: "
                java.lang.String r2 = r0.concat(r2)
                com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
                goto L3c
            L36:
                r1.zzc = r2
                goto L3c
            L39:
                r2 = 0
                r1.zzc = r2
            L3c:
                return r1
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setPublisherPrivacyPersonalizationState(com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setTagForChildDirectedTreatment(int r3) {
                r2 = this;
                r0 = -1
                if (r3 == r0) goto L1e
                if (r3 == 0) goto L1e
                r0 = 1
                if (r3 != r0) goto L9
                goto L1e
            L9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid value passed to setTagForChildDirectedTreatment: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
                goto L20
            L1e:
                r2.zza = r3
            L20:
                return r2
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setTagForUnderAgeOfConsent(int r3) {
                r2 = this;
                r0 = -1
                if (r3 == r0) goto L1e
                if (r3 == 0) goto L1e
                r0 = 1
                if (r3 != r0) goto L9
                goto L1e
            L9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid value passed to setTagForUnderAgeOfConsent: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
                goto L20
            L1e:
                r2.zzb = r3
            L20:
                return r2
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setTestDeviceIds(java.util.List<java.lang.String> r2) {
                r1 = this;
                java.util.List r0 = r1.zzd
                r0.clear()
                if (r2 == 0) goto Lc
                java.util.List r0 = r1.zzd
                r0.addAll(r2)
            Lc:
                return r1
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public enum PublisherPrivacyPersonalizationState extends java.lang.Enum<com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState> {
        public static final com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState DEFAULT = null;
        public static final com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState DISABLED = null;
        public static final com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState ENABLED = null;
        private static final /* synthetic */ com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState[] zza = null;
        private final int zzb;

        static {
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r0 = new com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState
                java.lang.String r1 = "DEFAULT"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT = r0
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = new com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState
                java.lang.String r3 = "ENABLED"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.ENABLED = r1
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r3 = new com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState
                java.lang.String r5 = "DISABLED"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED = r3
                r5 = 3
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState[] r5 = new com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.zza = r5
                return
        }

        PublisherPrivacyPersonalizationState(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.zzb = r3
                return
        }

        public static com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState> r0 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = (com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState) r1
                return r1
        }

        public static com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState[] values() {
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState[] r0 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.zza
                java.lang.Object r0 = r0.clone()
                com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState[] r0 = (com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState[]) r0
                return r0
        }

        public int getValue() {
                r1 = this;
                int r0 = r1.zzb
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    static {
            java.lang.String r0 = "MA"
            java.lang.String r1 = "T"
            java.lang.String r2 = "PG"
            java.lang.String r3 = "G"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.android.gms.ads.RequestConfiguration.zza = r0
            return
    }

    /* synthetic */ RequestConfiguration(int r1, int r2, java.lang.String r3, java.util.List r4, com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState r5, com.google.android.gms.ads.zzh r6) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            return
    }

    public java.lang.String getMaxAdContentRating() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
            r1 = this;
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r0 = r1.zzf
            return r0
    }

    public int getTagForChildDirectedTreatment() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public int getTagForUnderAgeOfConsent() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public java.util.List<java.lang.String> getTestDeviceIds() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r2.zze
            r0.<init>(r1)
            return r0
    }

    public com.google.android.gms.ads.RequestConfiguration.Builder toBuilder() {
            r2 = this;
            com.google.android.gms.ads.RequestConfiguration$Builder r0 = new com.google.android.gms.ads.RequestConfiguration$Builder
            r0.<init>()
            int r1 = r2.zzb
            r0.setTagForChildDirectedTreatment(r1)
            int r1 = r2.zzc
            r0.setTagForUnderAgeOfConsent(r1)
            java.lang.String r1 = r2.zzd
            r0.setMaxAdContentRating(r1)
            java.util.List r1 = r2.zze
            r0.setTestDeviceIds(r1)
            return r0
    }
}
