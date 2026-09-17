package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@androidx.annotation.RecentlyNonNull com.google.android.ump.FormError r1);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@androidx.annotation.RecentlyNonNull com.google.android.ump.ConsentForm r1);
    }

    private UserMessagingPlatform() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RecentlyNonNull
    public static com.google.android.ump.ConsentInformation getConsentInformation(@androidx.annotation.RecentlyNonNull android.content.Context r0) {
            com.google.android.gms.internal.consent_sdk.zza r0 = com.google.android.gms.internal.consent_sdk.zza.zza(r0)
            com.google.android.gms.internal.consent_sdk.zzj r0 = r0.zzb()
            return r0
    }

    public static void loadAndShowConsentFormIfRequired(@androidx.annotation.RecentlyNonNull android.app.Activity r2, @androidx.annotation.RecentlyNonNull com.google.android.ump.ConsentForm.OnConsentFormDismissedListener r3) {
            com.google.android.gms.internal.consent_sdk.zza r0 = com.google.android.gms.internal.consent_sdk.zza.zza(r2)
            com.google.android.gms.internal.consent_sdk.zzj r0 = r0.zzb()
            boolean r0 = r0.canRequestAds()
            if (r0 == 0) goto L13
            r2 = 0
            r3.onConsentFormDismissed(r2)
            return
        L13:
            com.google.android.gms.internal.consent_sdk.zza r0 = com.google.android.gms.internal.consent_sdk.zza.zza(r2)
            com.google.android.gms.internal.consent_sdk.zzbn r0 = r0.zzc()
            com.google.android.gms.internal.consent_sdk.zzcr.zza()
            com.google.android.gms.internal.consent_sdk.zzbl r1 = new com.google.android.gms.internal.consent_sdk.zzbl
            r1.<init>(r2, r3)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.consent_sdk.zzbm r2 = new com.google.android.gms.internal.consent_sdk.zzbm
            r2.<init>(r3)
            r0.zzb(r1, r2)
            return
    }

    public static void loadConsentForm(@androidx.annotation.RecentlyNonNull android.content.Context r0, @androidx.annotation.RecentlyNonNull com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener r1, @androidx.annotation.RecentlyNonNull com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener r2) {
            com.google.android.gms.internal.consent_sdk.zza r0 = com.google.android.gms.internal.consent_sdk.zza.zza(r0)
            com.google.android.gms.internal.consent_sdk.zzbn r0 = r0.zzc()
            r0.zzb(r1, r2)
            return
    }

    public static void showPrivacyOptionsForm(@androidx.annotation.RecentlyNonNull android.app.Activity r1, @androidx.annotation.RecentlyNonNull com.google.android.ump.ConsentForm.OnConsentFormDismissedListener r2) {
            com.google.android.gms.internal.consent_sdk.zza r0 = com.google.android.gms.internal.consent_sdk.zza.zza(r1)
            com.google.android.gms.internal.consent_sdk.zzbn r0 = r0.zzc()
            r0.zze(r1, r2)
            return
    }
}
