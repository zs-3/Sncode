package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzab extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.internal.auth.zzg {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = null;
    private static final com.google.android.gms.common.api.Api zzc = null;
    private static final com.google.android.gms.common.logging.Logger zzd = null;
    private final android.content.Context zze;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.internal.auth.zzab.zza = r0
            com.google.android.gms.internal.auth.zzv r1 = new com.google.android.gms.internal.auth.zzv
            r1.<init>()
            com.google.android.gms.internal.auth.zzab.zzb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "GoogleAuthService.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.internal.auth.zzab.zzc = r2
            java.lang.String r0 = "GoogleAuthServiceClient"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.auth.zzd.zza(r0)
            com.google.android.gms.internal.auth.zzab.zzd = r0
            return
    }

    zzab(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.auth.zzab.zzc
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            r3.zze = r4
            return
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.common.api.Status r0, java.lang.Object r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            boolean r0 = com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r0, r1, r2)
            if (r0 != 0) goto L10
            com.google.android.gms.common.logging.Logger r0 = com.google.android.gms.internal.auth.zzab.zzd
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "The task is already complete."
            r0.w(r2, r1)
        L10:
            return
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.internal.auth.zzbw r5) {
            r4 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.auth.zze.zzl
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth.zzt r1 = new com.google.android.gms.internal.auth.zzt
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r0 = 1513(0x5e9, float:2.12E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doWrite(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task zzb(com.google.android.gms.auth.AccountChangeEventsRequest r5) {
            r4 = this;
            java.lang.String r0 = "request cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.auth.zze.zzk
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth.zzu r1 = new com.google.android.gms.internal.auth.zzu
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r0 = 1515(0x5eb, float:2.123E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doWrite(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task zzc(android.accounts.Account r5, java.lang.String r6, android.os.Bundle r7) {
            r4 = this;
            java.lang.String r0 = "Account name cannot be null!"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "Scope cannot be null!"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6, r0)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.auth.zze.zzl
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth.zzs r1 = new com.google.android.gms.internal.auth.zzs
            r1.<init>(r4, r5, r6, r7)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r6 = 1512(0x5e8, float:2.119E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r6)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doWrite(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task zzd(android.accounts.Account r5) {
            r4 = this;
            java.lang.String r0 = "account cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.auth.zze.zzk
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth.zzr r1 = new com.google.android.gms.internal.auth.zzr
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r0 = 1517(0x5ed, float:2.126E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doWrite(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final com.google.android.gms.tasks.Task zze(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Client package name cannot be null!"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.auth.zze.zzk
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth.zzq r1 = new com.google.android.gms.internal.auth.zzq
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r0 = 1514(0x5ea, float:2.122E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doWrite(r5)
            return r5
    }
}
