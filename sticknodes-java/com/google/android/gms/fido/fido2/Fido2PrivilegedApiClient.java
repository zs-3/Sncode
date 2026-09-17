package com.google.android.gms.fido.fido2;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public class Fido2PrivilegedApiClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api zzb = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zza = r0
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            com.google.android.gms.internal.fido.zzj r2 = new com.google.android.gms.internal.fido.zzj
            r2.<init>()
            java.lang.String r3 = "Fido.FIDO2_PRIVILEGED_API"
            r1.<init>(r3, r2, r0)
            com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zzb = r1
            return
    }

    @java.lang.Deprecated
    public Fido2PrivilegedApiClient(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zzb
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public Fido2PrivilegedApiClient(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.zzb
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails>> getCredentialList(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.fido.fido2.zzk r1 = new com.google.android.gms.fido.fido2.zzk
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 5430(0x1536, float:7.609E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getRegisterIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 5414(0x1526, float:7.587E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.fido.fido2.zzo r1 = new com.google.android.gms.fido.fido2.zzo
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getRegisterPendingIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.fido.fido2.zzl r1 = new com.google.android.gms.fido.fido2.zzl
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 5412(0x1524, float:7.584E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getSignIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 5415(0x1527, float:7.588E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.fido.fido2.zzn r1 = new com.google.android.gms.fido.fido2.zzn
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignPendingIntent(com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.fido.fido2.zzm r1 = new com.google.android.gms.fido.fido2.zzm
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 5413(0x1525, float:7.585E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> isUserVerifyingPlatformAuthenticatorAvailable() {
            r4 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.fido.fido2.zzp r1 = new com.google.android.gms.fido.fido2.zzp
            r1.<init>(r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.fido.zza.zzh
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            r1 = 5416(0x1528, float:7.59E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r4.doRead(r0)
            return r0
    }
}
