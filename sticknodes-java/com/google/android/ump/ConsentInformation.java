package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public interface ConsentInformation {

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(@androidx.annotation.RecentlyNonNull com.google.android.ump.FormError r1);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public enum PrivacyOptionsRequirementStatus extends java.lang.Enum<com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus> {

        @androidx.annotation.RecentlyNonNull
        public static final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus NOT_REQUIRED = null;

        @androidx.annotation.RecentlyNonNull
        public static final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus REQUIRED = null;

        @androidx.annotation.RecentlyNonNull
        public static final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus UNKNOWN = null;
        private static final /* synthetic */ com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus[] zza = null;

        static {
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = new com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN = r0
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = new com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus
                java.lang.String r3 = "NOT_REQUIRED"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED = r1
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r3 = new com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus
                java.lang.String r5 = "REQUIRED"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED = r3
                r5 = 3
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus[] r5 = new com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.zza = r5
                return
        }

        PrivacyOptionsRequirementStatus(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @androidx.annotation.RecentlyNonNull
        public static com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus valueOf(@androidx.annotation.RecentlyNonNull java.lang.String r1) {
                java.lang.Class<com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus> r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = (com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus) r1
                return r1
        }

        @androidx.annotation.RecentlyNonNull
        public static com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus[] values() {
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus[] r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.zza
                java.lang.Object r0 = r0.clone()
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus[] r0 = (com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus[]) r0
                return r0
        }
    }

    boolean canRequestAds();

    int getConsentStatus();

    @androidx.annotation.RecentlyNonNull
    com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@androidx.annotation.RecentlyNonNull android.app.Activity r1, @androidx.annotation.RecentlyNonNull com.google.android.ump.ConsentRequestParameters r2, @androidx.annotation.RecentlyNonNull com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener r3, @androidx.annotation.RecentlyNonNull com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener r4);

    void reset();
}
