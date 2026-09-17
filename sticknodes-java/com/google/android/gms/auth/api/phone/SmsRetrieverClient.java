package com.google.android.gms.auth.api.phone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public abstract class SmsRetrieverClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.auth.api.phone.SmsRetrieverApi {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = null;
    private static final com.google.android.gms.common.api.Api zzc = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.auth.api.phone.SmsRetrieverClient.zza = r0
            com.google.android.gms.auth.api.phone.zza r1 = new com.google.android.gms.auth.api.phone.zza
            r1.<init>()
            com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "SmsRetriever.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzc = r2
            return
    }

    public SmsRetrieverClient(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzc
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public SmsRetrieverClient(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.auth.api.phone.SmsRetrieverClient.zzc
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever();

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> startSmsUserConsent(java.lang.String r1);
}
