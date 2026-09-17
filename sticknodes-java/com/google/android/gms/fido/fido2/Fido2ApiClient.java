package com.google.android.gms.fido.fido2;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public class Fido2ApiClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api zzb = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.fido.fido2.Fido2ApiClient.zza = r0
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            com.google.android.gms.internal.fido.zzo r2 = new com.google.android.gms.internal.fido.zzo
            r2.<init>()
            java.lang.String r3 = "Fido.FIDO2_API"
            r1.<init>(r3, r2, r0)
            com.google.android.gms.fido.fido2.Fido2ApiClient.zzb = r1
            return
    }

    @java.lang.Deprecated
    public Fido2ApiClient(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.fido.fido2.Fido2ApiClient.zzb
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public Fido2ApiClient(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.fido.fido2.Fido2ApiClient.zzb
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getRegisterIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 5409(0x1521, float:7.58E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.fido.fido2.zzd r1 = new com.google.android.gms.fido.fido2.zzd
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getRegisterPendingIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.fido.fido2.zzc r1 = new com.google.android.gms.fido.fido2.zzc
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 5407(0x151f, float:7.577E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getSignIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 5410(0x1522, float:7.581E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.fido.fido2.zza r1 = new com.google.android.gms.fido.fido2.zza
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignPendingIntent(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.fido.fido2.zze r1 = new com.google.android.gms.fido.fido2.zze
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 5408(0x1520, float:7.578E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> isUserVerifyingPlatformAuthenticatorAvailable() {
            r4 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.fido.fido2.zzb r1 = new com.google.android.gms.fido.fido2.zzb
            r1.<init>(r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.fido.zza.zzh
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            r1 = 5411(0x1523, float:7.582E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r4.doRead(r0)
            return r0
    }
}
