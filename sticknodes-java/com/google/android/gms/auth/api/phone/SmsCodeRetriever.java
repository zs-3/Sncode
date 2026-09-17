package com.google.android.gms.auth.api.phone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public final class SmsCodeRetriever {
    public static final java.lang.String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final java.lang.String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final java.lang.String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final java.lang.String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    private SmsCodeRetriever() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.app.Activity r1) {
            com.google.android.gms.internal.auth-api-phone.zzr r0 = new com.google.android.gms.internal.auth-api-phone.zzr
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.content.Context r1) {
            com.google.android.gms.internal.auth-api-phone.zzr r0 = new com.google.android.gms.internal.auth-api-phone.zzr
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.app.Activity r1) {
            com.google.android.gms.internal.auth-api-phone.zzv r0 = new com.google.android.gms.internal.auth-api-phone.zzv
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.content.Context r1) {
            com.google.android.gms.internal.auth-api-phone.zzv r0 = new com.google.android.gms.internal.auth-api-phone.zzv
            r0.<init>(r1)
            return r0
    }
}
