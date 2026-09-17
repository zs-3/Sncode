package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public interface ConsentForm {

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(com.google.android.ump.FormError r1);
    }

    void show(@androidx.annotation.RecentlyNonNull android.app.Activity r1, @androidx.annotation.RecentlyNonNull com.google.android.ump.ConsentForm.OnConsentFormDismissedListener r2);
}
