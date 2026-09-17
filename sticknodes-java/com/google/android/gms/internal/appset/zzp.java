package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzp extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.appset.AppSetIdClient {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.appset.zzd> zza = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.appset.zzd, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb = null;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzc = null;
    private final android.content.Context zzd;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zze;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.internal.appset.zzp.zza = r0
            com.google.android.gms.internal.appset.zzn r1 = new com.google.android.gms.internal.appset.zzn
            r1.<init>()
            com.google.android.gms.internal.appset.zzp.zzb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "AppSet.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.internal.appset.zzp.zzc = r2
            return
    }

    zzp(android.content.Context r4, com.google.android.gms.common.GoogleApiAvailabilityLight r5) {
            r3 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r0 = com.google.android.gms.internal.appset.zzp.zzc
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            r3.zzd = r4
            r3.zze = r5
            return
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> getAppSetIdInfo() {
            r4 = this;
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r4.zze
            android.content.Context r1 = r4.zzd
            r2 = 212800000(0xcaf1200, float:2.6973853E-31)
            int r0 = r0.isGooglePlayServicesAvailable(r1, r2)
            if (r0 != 0) goto L39
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.appset.zze.zza
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.appset.zzm r1 = new com.google.android.gms.internal.appset.zzm
            r1.<init>(r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setAutoResolveMissingFeatures(r3)
            r1 = 27601(0x6bd1, float:3.8677E-41)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r4.doRead(r0)
            return r0
        L39:
            com.google.android.gms.common.api.ApiException r0 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 17
            r1.<init>(r2)
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)
            return r0
    }
}
