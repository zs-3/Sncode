package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.phone.SmsCodeAutofillClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = null;
    private static final com.google.android.gms.common.api.Api zzc = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.internal.p001authapiphone.zzr.zza = r0
            com.google.android.gms.internal.auth-api-phone.zzn r1 = new com.google.android.gms.internal.auth-api-phone.zzn
            r1.<init>()
            com.google.android.gms.internal.p001authapiphone.zzr.zzb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "SmsCodeAutofill.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.internal.p001authapiphone.zzr.zzc = r2
            return
    }

    public zzr(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p001authapiphone.zzr.zzc
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public zzr(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p001authapiphone.zzr.zzc
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> checkPermissionState() {
            r4 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p001authapiphone.zzac.zza
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api-phone.zzk r1 = new com.google.android.gms.internal.auth-api-phone.zzk
            r1.<init>(r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 1564(0x61c, float:2.192E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r4.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> hasOngoingSmsRequest(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            boolean r0 = r5.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "The package name cannot be empty."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r2)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p001authapiphone.zzac.zza
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api-phone.zzl r1 = new com.google.android.gms.internal.auth-api-phone.zzl
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r0 = 1565(0x61d, float:2.193E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsCodeRetriever() {
            r4 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p001authapiphone.zzac.zza
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api-phone.zzm r1 = new com.google.android.gms.internal.auth-api-phone.zzm
            r1.<init>(r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 1563(0x61b, float:2.19E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r4.doWrite(r0)
            return r0
    }
}
