package com.google.android.gms.fido.u2f;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class U2fApiClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api zzb = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.fido.u2f.U2fApiClient.zza = r0
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            com.google.android.gms.internal.fido.zzx r2 = new com.google.android.gms.internal.fido.zzx
            r2.<init>()
            java.lang.String r3 = "Fido.U2F_API"
            r1.<init>(r3, r2, r0)
            com.google.android.gms.fido.u2f.U2fApiClient.zzb = r1
            return
    }

    public U2fApiClient(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.fido.u2f.U2fApiClient.zzb
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public U2fApiClient(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.fido.u2f.U2fApiClient.zzb
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.u2f.U2fPendingIntent> getRegisterIntent(com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 5424(0x1530, float:7.6E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.fido.u2f.zzb r1 = new com.google.android.gms.fido.u2f.zzb
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.u2f.U2fPendingIntent> getSignIntent(com.google.android.gms.fido.u2f.api.common.SignRequestParams r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 5425(0x1531, float:7.602E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.fido.u2f.zza r1 = new com.google.android.gms.fido.u2f.zza
            r1.<init>(r2, r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }
}
